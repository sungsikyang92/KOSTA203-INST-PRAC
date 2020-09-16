package school.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;

import school.exception.DuplicateTelException;
import school.exception.PersonNotFoundException;

public class SchoolService {
	private LinkedHashMap<String, Person> map;
	/**
	 * ������ ��� PathInfo LIST_PATH �� ����� ����Ʈ ������ 
	 * ��ü ������ȭ�Ͽ� map�� �ε��ϴ� �޼��� 
	 * 1. ������ ��ο� ������ �����ϴ� �� ������ Ȯ���Ѵ� 
	 * 2. �������� ������ ������ ������ ������ map�� ����� 
	 * 3. �����ϸ� FileInputStream �� ObjectInputStream�� �̿��� 
	 *    ��ü�� ������ȭ�Ͽ� map�� �����Ѵ� 
	 * 4. �߻��ϴ� Exception �� ȣ���� UI ������ ó���� �����Ѵ�(������)   
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	@SuppressWarnings("unchecked")
	public void loadList() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file=new File(PathInfo.LIST_PATH);
		if(file.exists()&&file.isFile()) {//�����ϸ� ������ȭ
			ObjectInputStream ois=null;
			try {
				ois=new ObjectInputStream(new FileInputStream(file));
				map=(LinkedHashMap<String, Person>) ois.readObject();
			}finally {
				if(ois!=null)
				ois.close();
			}
		}else {//�������� ������ ó�� �����̹Ƿ� map�� ���� 
			map=new LinkedHashMap<String, Person>();
		}
	}
	/**
	 * ������ ��ο� ���α׷� ����� ���Ͽ� map�� ����ȭ�Ͽ� ������ ������Ű�� �޼��� 
	 * FileOutputStream < ObjectOutputStream  writeObject() 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public void saveList() throws FileNotFoundException, IOException {
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream(PathInfo.LIST_PATH));
			oos.writeObject(map);
		}finally {
			if(oos!=null)
			oos.close();
		}
	}
	
//tel�� �ߺ��Ǹ� �߰����� �ʰ� DuplicateTelException�� �߻���Ű�� ȣ���� ������ ������
	public void addPerson(Person person) throws DuplicateTelException {
		if (map.containsKey(person.getTel())) {
			throw new DuplicateTelException(person.getTel() + " tel�� �����Ͽ� �߰��Ұ�!");
		} else {
			map.put(person.getTel(), person);
		}
	}

	public void printAll() {
		Iterator<Person> it = map.values().iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

//tel�� �ش��ϴ� �������� ���� ��� PersonNotFoundException�� �߻���Ű��
//ȣ���� ������ �����Ѵ� 
	public Person findPersonByTel(String tel) throws PersonNotFoundException {
		Person p = map.get(tel);
		if (p == null)
			throw new PersonNotFoundException(tel + " tel�� �������� �ʾ� ��ȸ�� �� �����ϴ�.!");
		return p;
	}

	public Person removePersonByTel(String tel) throws PersonNotFoundException {
		Person p = map.remove(tel);
		if (p == null)
			throw new PersonNotFoundException(tel + " tel�� �������� �ʾ� ������ �� �����ϴ�.! ");
		return p;
	}

	public void updatePerson(Person person) throws PersonNotFoundException {
		if (map.containsKey(person.getTel()) == false)
			throw new PersonNotFoundException(person.getTel() + " tel�� �������� �ʾ� ������ �� �����ϴ�.! ");
		map.put(person.getTel(), person);
	}	
}

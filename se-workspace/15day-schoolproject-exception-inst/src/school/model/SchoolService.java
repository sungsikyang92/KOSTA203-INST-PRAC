package school.model;

import java.util.Iterator;
import java.util.LinkedHashMap;

import model.exception.DuplicateTelException;
import model.exception.PersonNotFoundException;

/*
 *  Service : �ý��� ������ ����Ͻ� ������ ��� 
 */
public class SchoolService {
	private LinkedHashMap<String,Person> map
								=new LinkedHashMap<String,Person>();
	//tel�� �ߺ��Ǹ� �߰����� �ʰ� DuplicateTelException�� �߻���Ű�� ȣ���� ������ ������
	public void addPerson(Person person) throws DuplicateTelException {
		if(map.containsKey(person.getTel())){
			throw new DuplicateTelException(person.getTel()+" tel�� �����Ͽ� �߰��Ұ�!");
		}else {
			map.put(person.getTel(), person);
		}
	}
	public void printAll() {
		Iterator<Person> it=map.values().iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	//tel�� �ش��ϴ� �������� ���� ��� PersonNotFoundException�� �߻���Ű��
	//ȣ���� ������ �����Ѵ� 
	public Person findPersonByTel(String tel) throws PersonNotFoundException {
		Person p=map.get(tel);
		if(p==null)
			throw new PersonNotFoundException(tel+" tel�� �������� �ʾ� ��ȸ�� �� �����ϴ�.!");
		return p;
	}
	public Person removePersonByTel(String tel) throws PersonNotFoundException {
		Person p=map.remove(tel);
		if(p==null)
			throw new PersonNotFoundException(tel+" tel�� �������� �ʾ� ������ �� �����ϴ�.! ");
		return p;
	}
	public void updatePerson(Person person) throws PersonNotFoundException {
		if(map.containsKey(person.getTel())==false)
			throw new PersonNotFoundException(person.getTel()+" tel�� �������� �ʾ� ������ �� �����ϴ�.! ");
		map.put(person.getTel(),person);
	}	
}



























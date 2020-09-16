package model;

import java.util.ArrayList;

/*
 *  Service : �ý��� ������ ����Ͻ� ������ ��� 
 */
public class SchoolService {
	private ArrayList<Person> list=new ArrayList<Person>();
	// �Ű������� �θ�Ÿ���� �����ϸ� �پ��� �ڽİ�ü�� �ϳ��� �޼��忡�� ó���� �� �ִ�
	public void addPerson(Person p) { 
		if(findIndexByTel(p.getTel())==-1) {//�������� ������ �߰� 
			list.add(p); 
		}else {
			System.out.println(p.getTel()+" tel�� �����ϹǷ� �߰��Ұ�!");
		}
	}
	public void printAll() {
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}	
	/**
	 * �Ű������� ���޵� tel �� ����Ʈ�� ��ҳ��� ������ tel�� ���ؼ� 
	 * ��ġ�ϴ� ��Ұ� ������ -1 �� ��ȯ�ϰ� 
	 * ��ġ�ϴ� ��Ұ� ������ ����Ʈ ����� �ε����� ��ȯ�ϴ� �޼��� 
	 * @param tel
	 * @return
	 */
	public int findIndexByTel(String tel) {
		int index=-1;
		for(int i=0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {//��ġ�ϴ� ��Ұ� ������
				index=i;
				break;
			}//if
		}//for
		return index;
	}
	public Person findPersonByTel(String tel) {
		Person p=null;
		int position=findIndexByTel(tel);// tel�� �����ϴ��� ������ �����ϸ� �� ��ġ�� ��ȯ
		if(position!=-1) {
			p=list.get(position);
		}
		return p;
	}
	public Person removePersonByTel(String tel) {
		Person p=null;
		int position=findIndexByTel(tel);
		if(position!=-1) {
			p=list.remove(position);
		}
		return p;
	}
}



























package test;

import java.util.ArrayList;

import model.Person;

public class TestForLoop {
	public static void main(String[] args) {
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(new Person("�����",100));
		list.add(new Person("�ۿ���",200));
		list.add(new Person("�����",300));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName()+" "+list.get(i).getMoney());
		}//���� for�� 
		// ���ο� for�� 
		for(Person p:list) // list�� �ִ� ��ҵ��� ���������� p ������ �Ҵ� 
			System.out.println(p.getName()+" "+p.getMoney());
	}
}














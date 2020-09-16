package test;

import java.util.ArrayList;

import model.Person;

public class TestForLoop {
	public static void main(String[] args) {
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(new Person("김수민",100));
		list.add(new Person("송영섭",200));
		list.add(new Person("정재우",300));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName()+" "+list.get(i).getMoney());
		}//기존 for문 
		// 새로운 for문 
		for(Person p:list) // list에 있는 요소들을 순차적으로 p 변수에 할당 
			System.out.println(p.getName()+" "+p.getMoney());
	}
}














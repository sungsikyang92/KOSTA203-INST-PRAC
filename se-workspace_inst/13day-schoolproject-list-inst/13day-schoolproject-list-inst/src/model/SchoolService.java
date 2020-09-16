package model;

import java.util.ArrayList;

public class SchoolService {
	private ArrayList<Person> list=new ArrayList<Person>();
	public void addPerson(Person person) {
		list.add(person);
	}
	public void printAll() {
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
}

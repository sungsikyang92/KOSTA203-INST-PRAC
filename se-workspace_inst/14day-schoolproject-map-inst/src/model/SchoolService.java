package model;

import java.util.Iterator;
import java.util.LinkedHashMap;

/*
 *  Service : 시스템 내에서 비즈니스 로직을 담당 
 */
public class SchoolService {
	private LinkedHashMap<String,Person> map
								=new LinkedHashMap<String,Person>();
	public void addPerson(Person person) {
		if(map.containsKey(person.getTel())){
			System.out.println(person.getTel()+" tel이 중복되어 추가불가!");
		}else {
			map.put(person.getTel(), person);
		}
	}
	public void printAll() {
		Iterator<Person> it=map.values().iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	public Person findPersonByTel(String tel) {
		return map.get(tel);
	}
	public Person removePersonByTel(String tel) {
		return map.remove(tel);
	}
	public void updatePerson(Person person) {
		if(map.containsKey(person.getTel()))
		map.put(person.getTel(),person);
	}	
}



























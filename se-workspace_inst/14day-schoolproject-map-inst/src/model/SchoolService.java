package model;

import java.util.Iterator;
import java.util.LinkedHashMap;

/*
 *  Service : �ý��� ������ ����Ͻ� ������ ��� 
 */
public class SchoolService {
	private LinkedHashMap<String,Person> map
								=new LinkedHashMap<String,Person>();
	public void addPerson(Person person) {
		if(map.containsKey(person.getTel())){
			System.out.println(person.getTel()+" tel�� �ߺ��Ǿ� �߰��Ұ�!");
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



























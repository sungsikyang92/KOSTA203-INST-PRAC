package school.model;

import java.util.Iterator;
import java.util.LinkedHashMap;

import model.exception.DuplicateTelException;
import model.exception.PersonNotFoundException;

/*
 *  Service : 시스템 내에서 비즈니스 로직을 담당 
 */
public class SchoolService {
	private LinkedHashMap<String,Person> map
								=new LinkedHashMap<String,Person>();
	//tel이 중복되면 추가하지 않고 DuplicateTelException을 발생시키고 호출한 곳으로 던진다
	public void addPerson(Person person) throws DuplicateTelException {
		if(map.containsKey(person.getTel())){
			throw new DuplicateTelException(person.getTel()+" tel이 존재하여 추가불가!");
		}else {
			map.put(person.getTel(), person);
		}
	}
	public void printAll() {
		Iterator<Person> it=map.values().iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	//tel에 해당하는 구성원이 없을 경우 PersonNotFoundException을 발생시키고
	//호출한 곳으로 전달한다 
	public Person findPersonByTel(String tel) throws PersonNotFoundException {
		Person p=map.get(tel);
		if(p==null)
			throw new PersonNotFoundException(tel+" tel이 존재하지 않아 조회할 수 없습니다.!");
		return p;
	}
	public Person removePersonByTel(String tel) throws PersonNotFoundException {
		Person p=map.remove(tel);
		if(p==null)
			throw new PersonNotFoundException(tel+" tel이 존재하지 않아 삭제할 수 없습니다.! ");
		return p;
	}
	public void updatePerson(Person person) throws PersonNotFoundException {
		if(map.containsKey(person.getTel())==false)
			throw new PersonNotFoundException(person.getTel()+" tel이 존재하지 않아 수정할 수 없습니다.! ");
		map.put(person.getTel(),person);
	}	
}



























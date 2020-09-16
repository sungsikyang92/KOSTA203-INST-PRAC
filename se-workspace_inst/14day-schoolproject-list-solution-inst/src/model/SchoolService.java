package model;

import java.util.ArrayList;

/*
 *  Service : 시스템 내에서 비즈니스 로직을 담당 
 */
public class SchoolService {
	private ArrayList<Person> list=new ArrayList<Person>();
	// 매개변수로 부모타입을 선언하면 다양한 자식객체를 하나의 메서드에서 처리할 수 있다
	public void addPerson(Person p) { 
		if(findIndexByTel(p.getTel())==-1) {//존재하지 않으면 추가 
			list.add(p); 
		}else {
			System.out.println(p.getTel()+" tel이 존재하므로 추가불가!");
		}
	}
	public void printAll() {
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}	
	/**
	 * 매개변수로 전달된 tel 과 리스트의 요소내의 구성원 tel과 비교해서 
	 * 일치하는 요소가 없으면 -1 을 반환하고 
	 * 일치하는 요소가 있으면 리스트 요소의 인덱스를 반환하는 메서드 
	 * @param tel
	 * @return
	 */
	public int findIndexByTel(String tel) {
		int index=-1;
		for(int i=0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {//일치하는 요소가 있으면
				index=i;
				break;
			}//if
		}//for
		return index;
	}
	public Person findPersonByTel(String tel) {
		Person p=null;
		int position=findIndexByTel(tel);// tel이 존재하는지 유무와 존재하면 그 위치를 반환
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



























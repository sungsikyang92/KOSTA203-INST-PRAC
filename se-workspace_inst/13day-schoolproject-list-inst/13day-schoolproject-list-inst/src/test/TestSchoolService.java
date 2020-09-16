package test;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestSchoolService {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		service.addPerson(new Student("0101231234", "정예울", "용인", "17"));
		service.addPerson(new Teacher("0101231235", "신성호", "수지", "국어"));
		service.addPerson(new Student("0101231236", "이진욱", "수원", "16"));
		service.addPerson(new Employee("0101231237", "송영섭", "화성", "재무부"));
		service.addPerson(new Student("0101231238", "배율휘", "용인", "18"));
		service.addPerson(new Teacher("0101231239", "강희석", "용인", "수학"));
		service.printAll();
		// 중복테스트
		/*
		 * service.addPerson(new Student("0101231234","아이유","잠실","18"));// tel 이 중복되어
		 * 추가될 수 없습니다 System.out.println("***학교 구성원 등록 완료***"); service.printAll();//6명
		 * 출력 System.out.println("***전체 구성원 출력 완료***"); String tel="0101231235"; Person
		 * p=service.findPersonByTel(tel); System.out.println("검색결과:"+p); // tel에 해당하는
		 * 구성원이 있으면 출력하고 없으면 null이 출력됨 System.out.println("***검색완료***");
		 * System.out.println("**삭제 전 명단**"); service.printAll();//6명 출력 Person
		 * p=service.deletePersonByTel("0101231239"); System.out.println("삭제정보:"+p);
		 * System.out.println("**삭제 후 명단**"); service.printAll();//5명 출력
		 */
	}
}
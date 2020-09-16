package step1;
/*
 * Encapsulation 적용된 클래스를 테스트 하는 예제 
 * setter/getter를 활용해본다 
 */
public class TestSetterGetter {
	public static void main(String[] args) {
		// Person 객체 생성 , 참조변수는 p로 한다 
		Person p=new Person();
		// p 객체의 name에 아이유를 할당해본다 
		//p.name="아이유"; // private 이므로 접근불가 
		// name에 할당하기 위해 setter 인 setName 메서드를 이용한다
		p.setName("아이유");
		// 할당한 name을 반환받아서 출력해본다 
		// 주석처리 단축키 ctrl + shift + / 
		// 주석처리 해제 단축키 ctrl + shift + \ 
		/* String name=p.getName(); System.out.println(name); */
		 // 위 두라인을 한라인으로 표현하면 아래와 같다 
		System.out.println(p.getName());
		System.out.println("************************");
		// 아래 코드에 대응되는 Person class 의 요소를 코딩해본다 
		// 1. 인스턴스 변수  2. setter  3. getter 
		//p.age=-11; private 이므로 접근 불가 
		//잘못된 나이일 경우에는 할당하지 않도록
		// Person class의 setAge() 를 수정해본다 
		p.setAge(-28);
		System.out.println(p.getAge()+"세");//28
	}
}











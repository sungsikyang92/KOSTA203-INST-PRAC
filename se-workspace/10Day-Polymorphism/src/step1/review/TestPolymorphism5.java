package step1.review;
class Animal{
	public void sleep() {
		System.out.println("자다");
	}
	public void eat() {
		System.out.println("먹다");
	}
}
class Person extends Animal{
	//자신의 독자적인 메서드
	public void study() {
		System.out.println("공부하다");
	}
	public void eat() {
		//메서드 오버라이딩: 부모 메서드를 자신에 맞게 재정의	
		System.out.println("사람이 먹다");
	}
}
public class TestPolymorphism5 {
	public static void main(String[] args) {
		//부모 타입의 변수에 자식 객체를 참조시킬 수 있다.
		Animal a=new Person();
		//이 경우 바로 접근하여 사용가능한 것은
		//부모로부터 상속받은 멤버(변수, 메서드)와
		//오버라이딩한 메서드이다
		a.sleep();//상속받은 거
		a.eat();//오버라이딩한 거
		//요거는 바로 접근 안된다 - 자식의 독자적 멤버
		//a.study(); //a는 Animal 부모 타입이므로
		//접근하기 위해서는 Object Down Casting이 필요
		((Person)a).study();
	}
}

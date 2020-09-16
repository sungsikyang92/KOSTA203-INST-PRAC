package step8;

class Animal {
	public void eat() {
		System.out.println("먹다");
	}

	public void sleep() {
		System.out.println("자다");
	}
}

class Person extends Animal {
	public void study() {
		System.out.println("공부하다");
	}
	//메서드 오버라이딩
	public void eat() {
		System.out.println("사람이 수저로 먹다");
	}
}

public class TestPolymorphism4 {
	public static void main(String[] args) {
		//다형성 적용시 특징
		//아래와 같이 부모 타입의 변수에 자식 객체를 참조할 경우
	Animal a=new Person();
	a.sleep();//상속받은 부모 메서드에 접근해 사용가능하고
	a.eat();//오버라이딩한 메서드 사용가능하다
	//자식 Person의 독자적 멤버(study 메서드)에는 접근이 불가
	//a의 타입은 Animal 부모이므로
	//a.study();//compile error
	//접근하기 위해서는 Object down casting 절차가 필요하다
	((Person)a).study();
	//위의 표현을 풀어쓰면
	Person p=(Person)a;
	p.study();
	}
}
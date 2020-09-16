package step1;
//아래와 같이 별도의 상속관계 표현이 없으면 자동으로
//상속관계를 준다. extends Object
class Parent{// extends Object
	Parent(){
		super();
		System.out.println("Parent 객체생성");
	}	
}
class Child extends Parent{
	Child(){
		super();//부모 생성자 호출하여 부모 객체 생성
		System.out.println("Child 객체생성");
	}
}
class Car{//별도의 상속관계가 없으면 extends Object
	
}
public class TestObjectClass {
	public static void main(String[] args) {
		Child c=new Child();
		//Child는 별도의 메소드가 정의되어 있지 않지만
		//상속받은 Parent가 extends Object하고 있어서
		//Object class의 getClass()를 자신의 기능으로
		//사용할 수 있다.
		System.out.println(c.getClass());
		Car car=new Car();
		//Object 자식이므로  Object class의 get Class()를 사용
		//할 수 있다.
		System.out.println(car.getClass());
	}
}

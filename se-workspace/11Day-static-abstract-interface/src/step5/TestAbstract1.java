package step5;
//추상이기에 구현할수 없고 선언만 가능
//일반 메서드는 가능
//abstract method가 하나 이상 존재하면 그 클래스는 abstract로
//선언되어야 한다.
abstract class Parent{
	Parent(){
		System.out.println("Parent 객체 생성");
	}
	public void eat() {
		System.out.println("먹다");
	}
	//abstract메서드는 구현부({})를 가질 수 없다.
	//오직 선언만 가능
	public abstract void study();
}
class Child extends Parent{
	Child(){
		super();
		System.out.println("Child 객체생성");
	}
	@Override
	public void study() {
		System.out.println("Child 공부하다");
	}
}
public class TestAbstract1 {
	public static void main(String[] args) {
		//abstract class이므로 직접 객체 생성할 수 없다.
		//Parent p=new Parent();
		Child c=new Child();
		c.study();
		c.eat();
	}
}

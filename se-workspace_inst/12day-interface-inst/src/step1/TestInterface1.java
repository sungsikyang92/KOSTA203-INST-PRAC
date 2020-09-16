package step1;
interface Flyer{
	//별도의 선언이 없어도 public static final 로 된다 
	String ID="javaking";
	public void fly();//abstract 를 별도로 명시하지 않아도 됨 
}
class Animal{}
class Person extends Animal{}
class Bird extends Animal implements Flyer{
	@Override
	public void fly() {
		System.out.println("새가 날다");
	}	
}
class Airplane implements Flyer{
	@Override
	public void fly() {
		System.out.println("비행기가 날다");
	}	
}
public class TestInterface1 {
	public static void main(String[] args) {
		//인터페이스 문법을 확인하는 예제 
		//아래 코드는 error, 상위 타입만 가능 
		//Animal a=new Airplane();
		//상위 인터페이스 타입으로 하위 객체를 참조할 수 있다 
		// 다형성이 적용됨 
		Flyer f1=new Bird();
		Flyer f2=new Airplane();
		f1.fly();
		f2.fly();
		System.out.println(Flyer.ID);
		//Flyer.ID="C"; // final 상수이므로 error 
	}
}
















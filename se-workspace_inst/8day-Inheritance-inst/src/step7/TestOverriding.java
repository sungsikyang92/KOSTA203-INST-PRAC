package step7;
class Animal{
	public void eat() {
		System.out.println("먹다");
	}
}
class Person extends Animal{
	//Person(){super();}
	// 메서드 오버라이딩 : 부모 메서드를 자신에 맞게 재정의 
	public void eat() { 
		System.out.println("수저를 이용");
		super.eat();//상속받은 부모 메서드를 이용 
	}
}
class Dog extends Animal{
	
}
public class TestOverriding {
	public static void main(String[] args) {
		Person p=new Person();
		p.eat();
		Dog d=new Dog();
		d.eat();
	}
}








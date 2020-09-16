package step5;
class Animal{
	int age;
	Animal(int age){
		this.age=age;
	}
}
class Person extends Animal{
	String name;
	Person(String name, int age){
		super(age);
		this.name=name;
	}
}

public class TestSuper3 {
	public static void main(String[] args) {
		Person p=new Person("æ∆¿Ã¿Ø", 28);
		System.out.println(p.name+" "+p.age);
	}
}

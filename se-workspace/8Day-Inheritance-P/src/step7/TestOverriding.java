package step7;
class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal{
	public void eat() {
		System.out.print("������ �̿�");
		super.eat();//��ӹ��� �θ� �޼��带 �̿�
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
package step5;
class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends Animal{
	//�޼��� �������̵� : �θ� �޼��带 �ڽſ� �°� ������ 
	public void eat() {
		System.out.println("����� �κα�ġ�Դ�");
	}
}
class Monkey extends Animal{
	//�޼��� �������̵� 
	public void eat() {
		System.out.println("�����̰� �ٳ����� �Դ�");
	}
}
class Car{}
public class TestPolymorphism1 {
	public static void main(String[] args) {
		// new Person() ���� ��ü �����ϰ� ��ȯ�Ǵ� �ּҰ��� 
		// Animal Ÿ���� a ������ �����Ѵ�. 
		// �θ� Ÿ���� ������ �ڽ� ��ü�� ������ų �� �ִ� 
		Animal a=new Person();
		a.eat(); // �ڽ��� �������̵� �� �޼��尡 ����ȴ� 
		//�θ� Ÿ�� Animal ������ Monkey �ڽ� ��ü�� ������Ų�� 
		Animal a2=new Monkey();
		a2.eat();
		// Car�� Animal �� �ڽ��� �ƴϹǷ� compile error 
		//Animal a3=new Car();
	}
}










package step5;
class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends Animal{
	//�޼��� �������̵�: �θ� �޼��带 �ڽſ� �°� ������
	public void eat() {
		System.out.println("����� �κα�ġ�� ");
	}
}
class Monkey extends Animal{
	//�޼��� �������̵�
	public void eat() {
		System.out.println("�����̰� �ٳ����� ");
	}
}
public class TestPolymorphism1 {
	public static void main(String[]args) {
		//new Person()���� ��ü �����ϰ� ��ȯ�Ǵ� �ּҰ���
		//Animal Ÿ���� a������ �����Ѵ�.
		//�θ� Ÿ���� ������ �ڽ� ��ü�� ������ų �� �ִ�.
		Animal a=new Person();
		a.eat();//�ڽ��� �������̵� �� �޼��尡 ����ȴ�.
		Animal b=new Animal();
		b.eat();
		//�θ� Ÿ�� Animal ������ Monkey �ڽ� ��ü�� ������Ų��.
		Animal c=new Monkey();
		c.eat();
		b.eat();
		//Car�� Animal�� �ڽ��� �ƴϹǷ�, compile error
		//Animal d=new Car();
	}
}

package step1.review;
class Animal{
	public void sleep() {
		System.out.println("�ڴ�");
	}
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends Animal{
	//�ڽ��� �������� �޼���
	public void study() {
		System.out.println("�����ϴ�");
	}
	public void eat() {
		//�޼��� �������̵�: �θ� �޼��带 �ڽſ� �°� ������	
		System.out.println("����� �Դ�");
	}
}
public class TestPolymorphism5 {
	public static void main(String[] args) {
		//�θ� Ÿ���� ������ �ڽ� ��ü�� ������ų �� �ִ�.
		Animal a=new Person();
		//�� ��� �ٷ� �����Ͽ� ��밡���� ����
		//�θ�κ��� ��ӹ��� ���(����, �޼���)��
		//�������̵��� �޼����̴�
		a.sleep();//��ӹ��� ��
		a.eat();//�������̵��� ��
		//��Ŵ� �ٷ� ���� �ȵȴ� - �ڽ��� ������ ���
		//a.study(); //a�� Animal �θ� Ÿ���̹Ƿ�
		//�����ϱ� ���ؼ��� Object Down Casting�� �ʿ�
		((Person)a).study();
	}
}

package step8;

class Animal {
	public void eat() {
		System.out.println("�Դ�");
	}

	public void sleep() {
		System.out.println("�ڴ�");
	}
}

class Person extends Animal {
	public void study() {
		System.out.println("�����ϴ�");
	}
	//�޼��� �������̵�
	public void eat() {
		System.out.println("����� ������ �Դ�");
	}
}

public class TestPolymorphism4 {
	public static void main(String[] args) {
		//������ ����� Ư¡
		//�Ʒ��� ���� �θ� Ÿ���� ������ �ڽ� ��ü�� ������ ���
	Animal a=new Person();
	a.sleep();//��ӹ��� �θ� �޼��忡 ������ ��밡���ϰ�
	a.eat();//�������̵��� �޼��� ��밡���ϴ�
	//�ڽ� Person�� ������ ���(study �޼���)���� ������ �Ұ�
	//a�� Ÿ���� Animal �θ��̹Ƿ�
	//a.study();//compile error
	//�����ϱ� ���ؼ��� Object down casting ������ �ʿ��ϴ�
	((Person)a).study();
	//���� ǥ���� Ǯ���
	Person p=(Person)a;
	p.study();
	}
}
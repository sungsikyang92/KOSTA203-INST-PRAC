package step3;
class Animal{
	//������
	Animal(){
		System.out.println("Animal ��ü ����");
	}
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends Animal{
	//������ constructor 
	Person(){ super(); // ������ �����Ͻÿ� �ڵ� ���� 
	//super() �� �θ� �����ڸ� �����ؼ� �θ� ��ü �����ϴ� ����
		System.out.println("Person ��ü ����");
	}
}
public class TestSuper {
	public static void main(String[] args) {
		new Person();// ��ü ���� ( �����ڰ� ���� )
	}
}






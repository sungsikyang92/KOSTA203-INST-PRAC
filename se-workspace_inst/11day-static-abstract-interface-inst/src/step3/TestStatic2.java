package step3;
class Person{
	static int age=21; // class �� member -> ���� ��ü ���� ���� ��밡��
	public static void eat() {
		System.out.println("static eat");
		//play(); // static eat() �޼���� ��ü�������� ���డ���ϰ� 
		// play() �޼���� �ݵ�� ��ü �����Ǿ�߸� �����ϱ� ������ compile error
	}
	//non-static �� Object�� ���(�޼���)�� ��ü �����ؾ� ��밡�� 
	public void play() {
		System.out.println("object play");
		eat(); // �Ǵ� ������  play() �� ����Ǿ��ٴ� ���� ��ü ������ ������ �ϰ�
		// ��ü ���� ���� class loading�� �Ͼ�� ������ �翬�� ���� ���� 
	}
}
public class TestStatic2 {
	public static void main(String[] args) {
		//age�� static �̹Ƿ� ������ ��ü �������� ����� �� �ִ� 
		//���α׷� ����� ù������ class loading�� �ǰ� �� �� static �� �޸𸮿� ����ǹǷ�
		System.out.println(Person.age);
		Person.eat();//��ü �������� Ŭ������.�޼���() �� ���డ�� 
	//	Person.play(); // object �� member �̹Ƿ� ��ü ������ �ʿ� 
		Person p=new Person();
		p.play();// �̷��� ����ؾ� �� 
	}
}












package step7;
//������ ��� �׽�Ʈ ����
class Animal{
	int age=1;
	public void eat() {
		System.out.println("�Դ�");
	}
}
//Animal�� ��۹޾ƺ���.
class Person extends Animal{
	//�θ� Animal�� ���� ���� �ڽ��� ����� ����
	public void study() {
		System.out.println("����� �����ϴ�");
	}
}
	
public class TestInheritance1 {
	public static void main(String[] args) {
		//�ڽ� Person  ��ü�� �����Ѵ�.
		Person p=new Person();
		p.eat();
		p.study();
		System.out.println(p.age);//��ӹ޾����Ƿ� ��밡��
	}
}

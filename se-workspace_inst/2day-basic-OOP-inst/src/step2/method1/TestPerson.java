package step2.method1;

public class TestPerson {
	public static void main(String[] args) {
		// Person class �� �̿��� ��ü�� �����Ѵ� 
		// �ּҰ��� �����ϴ� �������� p �� �Ѵ� 
		Person p=new Person();
		// p ��ü�� eat() �޼��带 ȣ���ؼ� �����Ų�� 
		p.eat();
		// eat2() �޼��带 ���� ,  ���� �Դ� �� ��µǵ��� �����͸� 
		// �����ؼ� �����Ų�� 
		p.eat2("����");
		p.eat2("���ɸ�");
		// eat3 �޼��带 �����ϵ�  ���� 3�� �Դ� �� ��µǵ��� �Ѵ� 
		p.eat3("����", 3);
		// eat4 �޼��带 �����ϵ� �ش� �޼��尡 ��ȯ�� ���� �޾Ƽ� 
		// ����غ��� 
		String returnValue=p.eat4("����");
		System.out.println(returnValue);
	}
}
















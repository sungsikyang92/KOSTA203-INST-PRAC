package Step2;

public class TestPerson {

	public static void main(String[] args) {
		//Person class�� �̿��� Person ��ü�� �����Ѵ�.
		Person p=new Person();
		//Person class �� name ������ �̸��� �����Ѵ�.
		p.name="������";
		//p��ü�� name�� ����غ���.
		System.out.println(p.name);
		//p��ü�� eat() �޼��带 �����غ���.
		p.eat();
	}

}

package step5;
class Animal{
	int age;
	Animal(int age){
		this.age=age;
	}
}
class Person extends Animal{
	String name;
	Person(String name,int age){
		//super(); // �θ�������� �Ű������� �˸��� �����Ƿ� error
		// �Ʒ��� ���� super(age) �� ���� ����ؾ� �Ѵ� 
		super(age);
		this.name=name;
	}
}
public class TestSuper3 {
	public static void main(String[] args) {
		Person p=new Person("������",28);
		System.out.println(p.name+" "+p.age);
	}
}











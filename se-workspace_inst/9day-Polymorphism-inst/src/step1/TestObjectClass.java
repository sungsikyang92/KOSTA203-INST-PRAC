package step1;
//�Ʒ��� ���� ������ ��Ӱ��� ǥ���� ������ �ڵ����� 
//��Ӱ��踦 �ش�  extends Object 
class Parent{// extends Object
	Parent(){
		super(); // �θ� ������ ȣ�� 
		System.out.println("Parent ��ü����");
	}
}
class Child extends Parent{
	Child(){
		super();//�θ� ������ ȣ���Ͽ� �θ� ��ü ����
		System.out.println("Child ��ü����");
	}
}
class Car{ // ������ ��Ӱ��谡 ������ extends Object
	
}
public class TestObjectClass {
	public static void main(String[] args) {
		Child c=new Child();
		//Child �� ������ �޼��尡 ���ǵǾ� ���� ������ 
		//��ӹ��� Parent�� extends Object �ϰ� �־ 
		// Object class �� getClass() �� �ڽ��� �������
		// ����� �� �ִ� 
		System.out.println(c.getClass());
		Car car=new Car();
		//Object �ڽ��̹Ƿ� Object class�� getClass()�� ���
		//�� �� �ִ� 
		System.out.println(car.getClass());
	}
}










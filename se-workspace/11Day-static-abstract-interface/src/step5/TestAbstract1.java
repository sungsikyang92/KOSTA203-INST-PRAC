package step5;
//�߻��̱⿡ �����Ҽ� ���� ���� ����
//�Ϲ� �޼���� ����
//abstract method�� �ϳ� �̻� �����ϸ� �� Ŭ������ abstract��
//����Ǿ�� �Ѵ�.
abstract class Parent{
	Parent(){
		System.out.println("Parent ��ü ����");
	}
	public void eat() {
		System.out.println("�Դ�");
	}
	//abstract�޼���� ������({})�� ���� �� ����.
	//���� ���� ����
	public abstract void study();
}
class Child extends Parent{
	Child(){
		super();
		System.out.println("Child ��ü����");
	}
	@Override
	public void study() {
		System.out.println("Child �����ϴ�");
	}
}
public class TestAbstract1 {
	public static void main(String[] args) {
		//abstract class�̹Ƿ� ���� ��ü ������ �� ����.
		//Parent p=new Parent();
		Child c=new Child();
		c.study();
		c.eat();
	}
}

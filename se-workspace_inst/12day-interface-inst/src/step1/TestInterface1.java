package step1;
interface Flyer{
	//������ ������ ��� public static final �� �ȴ� 
	String ID="javaking";
	public void fly();//abstract �� ������ ������� �ʾƵ� �� 
}
class Animal{}
class Person extends Animal{}
class Bird extends Animal implements Flyer{
	@Override
	public void fly() {
		System.out.println("���� ����");
	}	
}
class Airplane implements Flyer{
	@Override
	public void fly() {
		System.out.println("����Ⱑ ����");
	}	
}
public class TestInterface1 {
	public static void main(String[] args) {
		//�������̽� ������ Ȯ���ϴ� ���� 
		//�Ʒ� �ڵ�� error, ���� Ÿ�Ը� ���� 
		//Animal a=new Airplane();
		//���� �������̽� Ÿ������ ���� ��ü�� ������ �� �ִ� 
		// �������� ����� 
		Flyer f1=new Bird();
		Flyer f2=new Airplane();
		f1.fly();
		f2.fly();
		System.out.println(Flyer.ID);
		//Flyer.ID="C"; // final ����̹Ƿ� error 
	}
}
















package step4;
class Animal{}
class Person extends Animal{}
class Car{}

public class TestPolymorphismArray1 {
	public static void main(String[] args) {
		Animal [] a=new Animal[3];
		//��Ģ������ �迭�� ������ ������Ÿ���� ������ ��´�.
		a[0]=new Animal();
		//�θ�Ÿ���� �迭�� �ڽİ�ü�� ���� �� �ִ�.(�������� �����ǹǷ�)
		a[1]=new Person();
		//a[2]=new Car();//Car�� Animal�� �ڽ��� �ƴϹǷ� ���� �� ����.
	}
}

package step5;
class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends Animal{
	public void eat() {
		System.out.println("����� �Դ�");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("���� �Դ�");
	}
}
public class TestPolymorphismArray2 {
	public static void main(String[] args) {
		Animal [] a= {new Animal(), new Person(), new Dog()};
		//for���� �̿��� �Ʒ��� ���� ����ϼ���
		/*�Դ�
		 * ����� �Դ�
		 * ���� �Դ�
		 */
		for(int i=0;i<a.length;i++) {
			a[i].eat();
		}
		System.out.println("*************************************************************");
		ZooService service=new ZooService();
		service.pass(a);
	}
}
class ZooService{
	public void pass(Animal[] ani) {
		for(int i=0;i<ani.length;i++ ) {
			ani[i].eat();
		}
	}
}


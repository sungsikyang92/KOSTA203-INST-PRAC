package Step2.method1;

public class Person {
	public void eat() {
		System.out.println("�Դ�");
	}
	//�޼��带 ȣ���� �����κ��� �����͸� ���޹ޱ� ���� �Ű�����(Parameter)�� ������ �޼��带 �ۼ��� ����.
	public void eat2(String menu) {
		System.out.println(menu+"�Դ�");
	}
	//void�� �޼��� ���ϰ��� ������ �˸��� �ڹٿ����
	public void eat3(String menu, int count) {
		System.out.println(menu+" "+count+"�� �Դ�");
	}//�Ʒ� eat4�� ���ϰ��� �����Ƿ� ���ϰ��� ������ Ÿ���� ����Ѵ�.
	//return �� ȣ���� ������ �����͸� ��ȯ�ϴ� �޼��带 ������ ����.
	public String eat4(String menu) {
		//Ư���� ���� ������ �� �����͸� ��ȯ�Ѵٰ� ��������~~
		return menu+"����~";
	}
}

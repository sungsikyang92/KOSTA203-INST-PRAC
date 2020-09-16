//��Ű���� �ǹ��ִ� ���丮���� Ŭ������ �з��ϱ� ���� ���
package step1;
//Ŭ������ �Ϲ������� ��ü ������ ���� Ʋ�� ���� �����Ѵ�.
public class Person {
	//�ν��Ͻ� ����(Instance Variable): ��ü�� �Ӽ� ������ ����
	//�ڹ� �޸� ���� �� HEap ����(���� �޸� ����)�� ����
	//�ν��Ͻ� ������ ���� �ص� �ڵ� �⺻ �ʱ�ȭ�ȴ�.
	//String�� �������̹Ƿ� null�� �ʱ�ȭ��.
	private String name;

	public String getName() {
		return name;//�ν��Ͻ� ������ ����Ų��.
	}
//�Ʒ��� name�� ������������ �Ű�����(parameter)�� �Ҹ�
	public void setName(String name) {
		//this.name: this�� ���� ��ü�� ����Ű�Ƿ� �ν��Ͻ� ���� name�� ��Ī�Ѵ�.
		//name: ������������ �Ű������� ����Ų��.
		this.name = name;
	}

	public void eat() {
		int count=2;//��������(Local Variable): �޼��� ���� ����
		//�� count ������ �޼��� ����ÿ� �Ͻ������� ���� �� �޸𸮿��� ����
		System.out.println(count+"�κ� �Դ�");
	}
	public void sleep() {
		//int time;
		//�������� time�� �ʱ�ȭ �Ǿ� ���� �����Ƿ� compile error
		//System.out.printIn(time);
		int time2=0;//�̿� ���� ����� �ʱ�ȭ�� �ʿ��ϴ�.
		System.out.println(time2);
	}
	public void testVariable() {
		//�ν��Ͻ� ���� name�� �����ؼ� ���
		System.out.println(name);
		//sleep() �޼��� ���������� time2�� �����غ���
		//time2 ���������� �ش� �޼��忡���� �ӽ÷� ����ϹǷ�
		//�ٸ� �޼��忡���� ����� �� ����.
		//System.out.println(time2);//compile error
		sleep();//�� �޼��忡�� �ٸ� �޼��� ȣ���� ����
	}
}

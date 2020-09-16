package step1;
/*
 *  Encapsulation ���� Ŭ���� 
 *  �ܺο� �������� ���� �κ��� private ���������ڸ� ��� 
 *  �ܺο� �����Ͽ� ������ �κ��� public ���������ڸ� ��� 
 */
public class Person {
	private String name;
	private int age=1;
	// setter �� �ܺο��� ������ �Ҵ�ޱ� ���� �޼��� 
	public void setName(String name) {
		// this �����(keyword)�� �ν��Ͻ� ������ ����Ű�� ���Ͽ�
		// ����Ѵ� 
		// this �� �̿��� �ν��Ͻ������� �Ű������� �����Ѵ� 
		this.name=name;
	}
	// getter  �ܺο��� ������ ��ȯ�ޱ� ���� �޼��� 
	public String getName() {
		return name;
	}
	/*
	 *  �Ű����� age�� ���޵� ���� 1 �̸��� ��� 
	 *  �߸��� �����̹Ƿ� �Ҵ��� �� �����ϴ�. 
	 *  1 �̻��̸� ��ü�� �ν��Ͻ� ���� age�� �Ҵ��Ѵ� 
	 */
	public void setAge(int age) {
		if(age>1) {
			this.age=age;
		}else{
			System.out.println("�߸��� �����̹Ƿ� �Ҵ��� �� �����ϴ�.");
		}
	}
	public int getAge() {
		return age;
	}
}











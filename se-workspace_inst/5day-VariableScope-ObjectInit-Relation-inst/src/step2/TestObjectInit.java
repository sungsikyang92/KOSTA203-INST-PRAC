package step2;
/*
 *  ��ü ���� �ʱ�ȭ �ܰ踦 �����ϴ� ���� 
 */
public class TestObjectInit {
	public static void main(String[] args) {
		/* Car : Ŭ���������� ������ ������ Ÿ�� 
		 * car : ���� ( �������� , �������� ) 
		 * = : �Ҵ� �Ǵ� ���� 
		 * new : �ڹ� ����� 
		 * Car() : ������ Constructor 
		 */
		Car car=new Car();
		// flag �� �ν��Ͻ� �����̹Ƿ� �⺻ �ʱ�ȭ�Ǿ�
		// false �� ��ȯ�ȴ� 
		System.out.println(car.isFlag());
		// price �� �Ǽ����̹Ƿ� �⺻ �ʱ�ȭ 0.0 
		System.out.println(car.getPrice());
		// model �� �������̹Ƿ� �⺻ �ʱ�ȭ null 
		System.out.println(car.getModel());
	}
}










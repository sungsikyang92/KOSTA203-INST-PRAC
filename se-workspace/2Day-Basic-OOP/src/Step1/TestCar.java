package Step1;
//�ڵ� ���� ����Ű ctrl + shift + f
public class TestCar {

	public static void main(String[] args) {
		//Car Ŭ������ �̿��� Car��ü�� �����Ѵ�.
		//��ü�� �ּҰ��� �����ϴ� �������� c�� �Ѵ�.
		Car c=new Car();
		System.out.println(c);//��ü �ּҰ� ���
		//���� ����Ű�� ctrl + F11
		//Car�� model �ν��Ͻ� ������ BMW�� �Ҵ��Ѵ�.
		c.model="BMW";
		System.out.println(c.model);//��ü model���� ���
		/*
		 * ���� �� �ּ�
		 * c1������ Car ��ü�� �����Ѵ�.
		 * ������ ��ü�� model �ν��Ͻ� ������ ����� �Ҵ��Ѵ�.
		 * �Ҵ��� model ������ ����غ���.	
		 */
		Car c1=new Car();
		c1.model="���";
		System.out.println(c1.model);
		c1.price=100;
		System.out.println(c1.price);
		//�޼��带 ȣ���ؼ� �����Ų��.
		c1.drive();//��� �����ϴ�
		c.drive();//BMW �����ϴ�
	}

}

package step5;

public class Person {
	/*
	 * Association ����( use a ) �� 
	 * ����� ��Ʈī�� ����ϴ� �� ���� Ư�� ��ü�� ��� ��ü�� 
	 * ����ϴ� ���踦 �ǹ��Ѵ�.
	 * �Ʒ� �޼��忡���� �Ͻ������� RentCar ��ü�� ����ϹǷ�
	 * association �����̴�. 
	 */
	public void tour(String item) {
		RentCar car=new RentCar(item);
		System.out.println(car.getModel()+" Ÿ�� �����ϴ�");
	}
}

package step2.relation;

public class TestComposition {
	public static void main(String[] args) {
		Car car=new Car("�ҳ�Ÿ");
		System.out.println(car.getModel());//�ҳ�Ÿ
		System.out.println(car.getEngine());// ���� �ּҰ� 
		System.out.println(car.getEngine().getType());//L4
		System.out.println(car.getEngine().getDisplacement());//2000
	}
}

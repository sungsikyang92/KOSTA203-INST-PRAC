package step2;

public class TestComposition {
	public static void main(String[] args) {
		Car car=new Car("�ҳ�Ÿ");
		System.out.println(car.getModel());
		System.out.println(car.getEngine());
		System.out.println(car.getEngine().getType());
		System.out.println(car.getEngine().getDisplacement());
	}
}

//�� Engine Ŭ������ �����Ҽ� ����?

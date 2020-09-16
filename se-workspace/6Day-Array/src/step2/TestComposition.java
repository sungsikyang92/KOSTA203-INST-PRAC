package step2;

public class TestComposition {
	public static void main(String[] args) {
		Car car=new Car("소나타");
		System.out.println(car.getModel());
		System.out.println(car.getEngine());
		System.out.println(car.getEngine().getType());
		System.out.println(car.getEngine().getDisplacement());
	}
}

//왜 Engine 클래스를 생성할수 없지?

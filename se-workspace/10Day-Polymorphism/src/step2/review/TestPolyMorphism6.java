package step2.review;

public class TestPolyMorphism6 {
	public static void main(String[] args) {
		ZooService service=new ZooService();
		service.execute(new Monkey());//원숭이가 나무타며 놀다
		service.execute(new Tiger());//호랑이가 사냥하며 놀다
		service.execute(new Person());
		//사람이 티켓을 구매하다
		//사람이 데이트하며 놀다
	}
}

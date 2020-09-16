package step2.review;

public class Person extends Animal{
	//오버라이딩 메서드
	public void play() {
		System.out.print("사람이 데이트하며 ");
		super.play();
	}
	//독자적인 메서드
	public void buy() {
		System.out.println("사람이 티켓을 구매하다");
	}
}


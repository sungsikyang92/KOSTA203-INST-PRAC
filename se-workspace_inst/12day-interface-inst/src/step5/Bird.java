package step5;
// Animal은 상속받고 Flyer 는 구현한다 
public class Bird extends Animal implements Flyer{
	@Override
	public void fly() {
		System.out.println("새가 날다");
	}
}

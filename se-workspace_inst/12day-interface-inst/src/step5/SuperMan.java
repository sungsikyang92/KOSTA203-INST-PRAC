package step5;
// SuperMan은 Fighter, Flyer를 구현한다 
public class SuperMan implements Fighter,Flyer{
	@Override
	public void fly() {
		System.out.println("수퍼맨이 날다");
	}
	@Override
	public void fight() {
		System.out.println("수퍼맨이 악당과 싸우다");
	}

}

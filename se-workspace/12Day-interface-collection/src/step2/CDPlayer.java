package step2;

public class CDPlayer implements Player{
	public void insertCd() {
		System.out.println("CD�� �ִ�");
	}
	
	@Override
	public void play() {
		System.out.println("CD�� ����ϴ�");	
	}
}

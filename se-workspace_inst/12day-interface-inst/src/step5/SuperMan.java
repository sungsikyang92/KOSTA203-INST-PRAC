package step5;
// SuperMan�� Fighter, Flyer�� �����Ѵ� 
public class SuperMan implements Fighter,Flyer{
	@Override
	public void fly() {
		System.out.println("���۸��� ����");
	}
	@Override
	public void fight() {
		System.out.println("���۸��� �Ǵ�� �ο��");
	}

}

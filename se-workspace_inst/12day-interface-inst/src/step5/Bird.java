package step5;
// Animal�� ��ӹް� Flyer �� �����Ѵ� 
public class Bird extends Animal implements Flyer{
	@Override
	public void fly() {
		System.out.println("���� ����");
	}
}

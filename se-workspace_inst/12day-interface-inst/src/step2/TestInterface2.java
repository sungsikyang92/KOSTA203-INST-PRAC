package step2;

public class TestInterface2 {
	public static void main(String[] args) {
		Player[] pa={new Youtube(),new CDPlayer()};
		pa[0].play();
		pa[1].play();
		//��ó�� ���� ����ü �ľ����� �ʾƵ� 
		// �������̽��� �ľ��ϸ� ��밡���ϴ� 
		for(int i=0;i<pa.length;i++)
			pa[i].play();
	}
}

package step3;

import java.util.Random;

// ������ ���� ��ȯ
public class TestRandom {
	public static void main(String[] args) {
		Random r=new Random();
		for(int i=0;i<5;i++) { // nextInt(3) -> 0 1 2 �� �������� ��ȯ
			System.out.println(r.nextInt(3));
		}
	}
}

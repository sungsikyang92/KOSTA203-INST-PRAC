package step2;

import java.util.Scanner;

// ����â���� Scanner ��ü�� �̿��� ������ �Է¹޾� ���� ���� 
public class TestScanner1 {
	public static void main(String[] args) {
		// ctrl + shift + o 
		Scanner s=new Scanner(System.in); //System.in ����â �Է� ��ü 
		while(true) {
		System.out.print("�̻���:");
		String info=s.nextLine();
		if(info.equals("�׸�")) {
			System.out.println("while���� �����մϴ�");
			break;
		}
		System.out.println("�Է¹��� �޼���:"+info);
		}
		s.close();//�ڿ��� ���� 
	}
}







package step5;

public class TestSwitch2 {
	public static void main(String[] args) {
		/* grade 1 �̸� �Ϲ��� 
		 * 2 �̸� �ϰ�� 
		 * 3,4,5 ī�ױ��� 
		 * ������ �������� 
		 */
		int grade=4;
		switch(grade) {
		case 1: System.out.println("�Ϲ���");
		break;
		case 2: System.out.println("�ϰ��");
		break;
		case 3: case 4: case 5:
			System.out.println("ī�ױ���");
			break;
		default:
			System.out.println("��������");
		}
	}
}









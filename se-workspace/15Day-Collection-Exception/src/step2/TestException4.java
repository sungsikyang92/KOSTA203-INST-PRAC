package step2;

public class TestException4 {
//Exception ���� �߻��� ������ �帧�� �˾ƺ��� ����
	public static void main(String[] args) {
		String age="�����ѻ�";
//		age="1";
		try {
			int intAge=Integer.parseInt(age);//Integer.parseInt()�� "������ ����"�� ������ȯ �����ش�
			System.out.println(intAge+1);
			System.out.println("d");
		}catch(NumberFormatException ne) {
			System.out.println("a");
		}catch(Exception e) {
			System.out.println("b");
		}
		System.out.println("c");
	}
}

package step3;

public class TestStatic3 {
	public static void main(String[] args) {
		String s1="1";
		int s2=8;
		// ���ڿ��� �տ� ������ ���� ������ ���ڿ��� �ν� 
		System.out.println(s1+s2); // 18
		// ���ڿ� String�� ������ ��ȯ 
		// java.lang.Integer �� static method�� parseInt(String s)
		//�� Ȱ���ؼ� ���ڿ��� ������ ��ȯ 
		int i=Integer.parseInt(s1);
		System.out.println(i+s2);
	}
}








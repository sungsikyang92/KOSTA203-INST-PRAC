package step2;

public class TestFinally {
	public static void main(String[] args) {
		String name=null;
		try {
		System.out.println(name.length());
		System.out.println("�߰��۾�");
		}catch(IndexOutOfBoundsException ie) {
			System.out.println("�����ʰ�");
		}catch(NullPointerException ne) {
			System.out.println("null �̹Ƿ� ����Ұ�");
		}finally {
			System.out.println("finally �׻� ����");
		}
		System.out.println("�������");
	}
}

package step3;
// ���������ڸ� �׽�Ʈ�ϴ� ���� 
public class TestAccess {
	public static void main(String[] args) {
		Account a=new Account();
		// public �̹Ƿ� ���ٰ��� 
		System.out.println(a.name);
		// default �̹Ƿ� ���ٰ��� ( ���� step3 ��Ű���̹Ƿ� ) 
		System.out.println(a.id);
		// private �̹Ƿ� ���ٺҰ� (�ٸ� Ŭ�����̹Ƿ�)
		//System.out.println(a.password);
	}
}








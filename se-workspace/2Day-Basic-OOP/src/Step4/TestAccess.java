package Step4;
//Import�� �ٸ� ��Ű���� �ڿ�(Ŭ����)�� �̿��� �� ����Ѵ�.
import Step3.Account;

//���������ڸ� �׽�Ʈ�ϴ� ����
public class TestAccess {
	public static void main(String[] args) {
		Account a=new Account();
		//public �̹Ƿ� ���ٰ���
		System.out.println(a.name);
		//default �̹Ƿ� ���ٰ���(�ٸ� ��Ű�� �̹Ƿ�)
		//System.out.println(a.id);
		//private �̹Ƿ� ���ٺҰ�(�ٸ� Ŭ���� �̹Ƿ�)
		//System.out.println(a.password);
	}

}

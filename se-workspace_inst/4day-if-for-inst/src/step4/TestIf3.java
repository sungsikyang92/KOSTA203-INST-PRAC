package step4;

public class TestIf3 {
	public static void main(String[] args) {
		MyAccount account=new MyAccount();
		account.setBalance(100);
		System.out.println(account.getBalance());//100
		account.setBalance(-1);// �߸��� �ݾ��Դϴ�  ( 0�� �ʰ��ؾ� �Ѵ� ) 
		System.out.println(account.getBalance());//100
		account.setBalance(500);
		System.out.println(account.getBalance());// 500 ��� 
		System.out.println("*******�Ա�*********");
		int money=100;
		account.deposit(money);
		System.out.println(account.getBalance());//600
		money=-1;
		account.deposit(money); // �߸��� �Աݾ��Դϴ�
		System.out.println(account.getBalance());//600
		System.out.println("********���***********");
		money=20;
		account.withdraw(money); 
		System.out.println(account.getBalance());//580
		money=-1;
		account.withdraw(money);// �߸��� ��ݾ��Դϴ�
		System.out.println(account.getBalance());//580
		money=600;
		account.withdraw(money);// �ܾ��� �����մϴ� 
		System.out.println(account.getBalance());//580
	}
}









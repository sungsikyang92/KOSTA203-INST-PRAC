package step4;

public class MyAccount {
	private int balance; // �ν��Ͻ� ������ ���� �� ��� �⺻ �ʱ�ȭ 0���� �Ҵ�
	public void setBalance(int balance) {
		if(balance>0)
			this.balance=balance;
		else
			System.out.println("�߸��� �ݾ��Դϴ�");
	}
	public int getBalance() {
		return balance;
	}
	// �Ա� �޼��� : ���� balance (�ܾ�) �� �ݾ��� �����Ѵ� 
	public void deposit(int money) {
		if(money>0)
			balance+=money; // balance = balance + money; 
		else
			System.out.println("�߸��� �Աݾ��Դϴ�");
	}
	public void withdraw(int money) {
		if(money<0)
			System.out.println("�߸��� ��ݾ��Դϴ�");
		else if(balance<money) // ��ݾ��� �ܾ׺��� Ŭ ��� 
			System.out.println("�ܾ��� �����մϴ�");
		else
			balance-=money;
	}
}

















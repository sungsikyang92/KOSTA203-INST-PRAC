package step4;

public class MyAccount {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>0)
		this.balance = balance;
		else
			System.out.println("�߸��� �ݾ��Դϴ�.");
	}

	public void deposit(int money) {
		if(money>0)
			balance+=money;//balance=balance+money;
		else
			System.out.println("�߸��� �Աݾ��Դϴ�.");
	}

	public void withdraw(int money) {
		if(money<0)
			System.out.println("�߸��� ��ݾ��Դϴ�.");
		else if(money>balance)//��ݾ��� �ܾ׺��� Ŭ ���
			System.out.println("�ܾ��� �����մϴ�.");
		else
			balance-=money;
	}
	

}

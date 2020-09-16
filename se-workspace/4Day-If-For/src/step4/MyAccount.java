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
			System.out.println("잘못된 금액입니다.");
	}

	public void deposit(int money) {
		if(money>0)
			balance+=money;//balance=balance+money;
		else
			System.out.println("잘못된 입금액입니다.");
	}

	public void withdraw(int money) {
		if(money<0)
			System.out.println("잘못된 출금액입니다.");
		else if(money>balance)//출금액이 잔액보다 클 경우
			System.out.println("잔액이 부족합니다.");
		else
			balance-=money;
	}
	

}

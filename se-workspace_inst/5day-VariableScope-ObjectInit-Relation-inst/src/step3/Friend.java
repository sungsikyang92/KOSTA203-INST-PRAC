package step3;

public class Friend {
	private String name;// �⺻ �ʱ�ȭ null 
	private int age=1; // ����� �ʱ�ȭ 1 
	// �ν��Ͻ� ������ ����� �ʱ�ȭ 
	private int money=10000;
	public Friend(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}

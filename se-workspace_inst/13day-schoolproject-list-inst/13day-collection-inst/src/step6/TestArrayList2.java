package step6;

import java.util.ArrayList;

class Friend{
	private String name;
	private String address;
	private int money;
	public Friend(String name, String address, int money) {
		super();
		this.name = name;
		this.address = address;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + ", address=" + address + ", money=" + money + "]";
	}
	
	
}
public class TestArrayList2 {
	public static void main(String[] args) {
		ArrayList<Friend> list=new ArrayList<Friend>();
		list.add(new Friend("�缺��", "��õ", 1000));
		//System.out.println(list);
		list.add(new Friend("������", "����", 2000));
		list.add(new Friend("�����", "��õ", 1500));
		// list �� ��� ��ü �� address�� ��õ�� ģ���� �̸��� ��� ��� 
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAddress().equals("��õ")) {
				System.out.println(list.get(i).getName());
			}//if
		}//for
		// ����Ʈ�� ������ ��Ҹ� ���� 			
		Friend f=list.remove(list.size()-1);
		System.out.println("������ ģ������:"+f);
		// list �� ��Ҹ� ��� ���� 
		list.clear();
		System.out.println(list);
	}
}














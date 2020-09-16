package step3;

import java.util.HashMap;

class Person{
	private String name;
	private String address;
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
}
public class TestMap1 {
	public static void main(String[] args) {
		HashMap<String,Person> map=new HashMap<String,Person>();
		map.put("a", new Person("�����","�Ͽ���"));
		System.out.println(map.size());
		System.out.println(map);
		map.put("b", new Person("������","���ֵ�"));
		Person p=map.get("a");//key�� �˻��ؼ� value�� ã�´� 
		System.out.println(p);
		System.out.println(map.get("c"));//�������� �ʴ� key�� ��ȸ�ϸ� null
		//���� key�� �߰��� ��� value�� ������Ʈ �ȴ� 
		map.put("a", new Person("�缺��","�︪��"));
		System.out.println(map.get("a"));
		// key�� �����ϴ� �� Ȯ�� 
		System.out.println(map.containsKey("a"));//true
		System.out.println(map.containsKey("s"));//false
		System.out.println(map.remove("a"));//���� �� ���������� ��ȯ 
		System.out.println(map);
		map.clear();//��� �����Ѵ� 
		System.out.println(map);
	}
}














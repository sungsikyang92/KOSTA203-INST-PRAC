package step6;

import java.util.ArrayList;

public class TestArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("������");
		list.add("��ȫ��");
		list.add("��ȫ��");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.size());
		list.set(2, "������"); //���� 
		System.out.println(list);
		String name=list.remove(1);//����
		System.out.println(name+" ��Ҹ� ����");
		System.out.println(list);		
	}
}








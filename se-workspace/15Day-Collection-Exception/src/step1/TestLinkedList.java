package step1;

import java.util.LinkedList;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list.size());
		System.out.println(list);
		//Ư�� ��ġ�� �߰�
		list.add(1, "d");//�ι�° ������ ��� �߰�
		System.out.println(list);
		//����
		list.addFirst("k");
		System.out.println(list);
		list.addLast("t");
		System.out.println(list);
		System.out.println(list.size());
	}
}

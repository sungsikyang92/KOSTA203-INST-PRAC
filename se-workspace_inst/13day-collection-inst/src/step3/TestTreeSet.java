package step3;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		// <String> -> Generic , Set�� �߰��� ����� Ÿ���� ����ϴ� ���� ����
		TreeSet<String> set=new TreeSet<String>();
		set.add("��ö");
		set.add("���ػ�");
		set.add("������");
		set.add("��ö");//�ߺ��� �������� ���� 
		set.add("��ö");//�ߺ� 
		System.out.println(set.size());//3
		// TreeSet�� Ư¡�� ���ı���� ����Ǿ� �ִ� 
		System.out.println(set);//toString() �������̵��Ǿ� ���� ��� ���		
		
	}
}



























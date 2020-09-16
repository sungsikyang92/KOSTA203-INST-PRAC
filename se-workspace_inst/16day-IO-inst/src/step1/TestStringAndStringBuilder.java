package step1;

import java.util.StringTokenizer;

public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String s1="������";		
		String s2="������";
		System.out.println(s1.concat("¯"));//�������� ���ڿ� �߰�
		System.out.println(s1);//���� s1 �� ��ȭ���� �ʴ´� 
		System.out.println(s1.replace("��", "��"));
		System.out.println(s1);//������ ������ �ʴ´� 
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//�̷��� ���ؾ� �Ѵ� 
		//������ �Ʒ��� ���ó�� ���ڿ��� ������� �ֱ� �����̴�
		String s3=new String("������");
		System.out.println(s1==s3);// false -> equals() �� ���ؾ� �Ѵ� 
		System.out.println(s1.equals(s3));
		StringBuilder sb=new StringBuilder("������");
		System.out.println(sb);		
		//System.out.println(s1==sb); // ��ü�� �� �ȵ� - Ÿ���� �ٸ� 
		System.out.println(s1==sb.toString());//false -> �̷��� ���ϸ� �ȵ� 
		System.out.println(s1.equals(sb.toString()));//true
		System.out.println(s1.contentEquals(sb));// Ÿ���� �޶� ������ �� true
		System.out.println(sb.append("��"));//���ڿ� ��ü�� ����ȴ� 
		System.out.println(sb);//�������� 
		StringBuffer sbf=new StringBuffer("�����尡����");
		System.out.println(sbf.reverse());
		System.out.println("*****StringTokenizer*******");
		String names="��ö,���ػ�,������";
		StringTokenizer stk=new StringTokenizer(names,",");
		while(stk.hasMoreTokens())
			System.out.println(stk.nextToken());
	}
}















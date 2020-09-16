package step1;

import java.util.StringTokenizer;

public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String s1="������";
		String s2="������";
		System.out.println(s1.concat("¯"));//�������� ���ڿ� �߰� �׷��� �Ͻ���
		System.out.println(s1);//���� concat���� ¯�� �������� �߰��Ͽ����� �Ͻ����̰� ���� s1�� ��ȭ���� �ʴ´�.
		System.out.println(s1.replace("��","��"));//"��"�ڸ� "��"�� ���� ���� �Ͻ��� ����
		System.out.println(s1);//"¯"�� ���� ���������� replace���� �Ͻ��� �����̸� ���� s1�� ��ȭ��Ű�� �ʴ´�.
		System.out.println(s1==s2);
		System.out.println(s1.contentEquals(s2));//11��° ���� ����̾ƴ� 12��° ������� ���Ͽ��� �Ѵ�.
		//������ �Ʒ��� ���ó�� ���ڿ��� ������� �ֱ� �����̴�.
		String s3=new String("������");
		System.out.println(s1==s3);//false �� equals()�� ���ؾ� �Ѵ�. ���� ���ڿ��� �߰��Ǿ����� �ٸ� ��ü��� ������� false�� ��.
		System.out.println(s1.equals(s3));
		System.out.println("**********************************");
		StringBuilder sb=new StringBuilder("������");
		System.out.println(sb);
		//System.out.println(s1==sb);//Ÿ���� �ٸ��Ƿ� �� ��ü�� ���� �ʴ´�.
		System.out.println(s1==sb.toString());// �̷��� ���ϸ� �ȵȴ�! equals()���!
		System.out.println(s1.equals(sb.toString()));
		System.out.println(s1.contentEquals(sb));//Ÿ���� �޶� ������ ���Ѵ�. ���� ������ �̹Ƿ� true
		System.out.println(sb.append("��"));//���ڿ� ��ü�� ����ȴ�.�ǵڿ� "��"�� �߰���
		System.out.println(sb);//���� sb�� append�� ���� �����.
		StringBuffer sbf=new StringBuffer("�����尡����");
		System.out.println(sbf.reverse());
		System.out.println("*****StringTokenizer*****");
		String names="��ö,���ػ�,��,������,����";
		StringTokenizer stk=new StringTokenizer(names,",");
		while(stk.hasMoreTokens())
			System.out.println(stk.nextToken());//�ϳ��� ������� �̾ƿͼ� ��µ�
	}
}

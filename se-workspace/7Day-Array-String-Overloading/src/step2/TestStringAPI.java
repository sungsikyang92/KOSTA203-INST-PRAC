package step2;
/*
 * java.lang ��Ű���� �⺻���� ��� �� �� �ִ� ��Ű����.
 * java.lang.String class�� �޼��带 ����� ���� ����
 */
public class TestStringAPI {
	public static void main(String[] args) {
		String str="������,������,����,��ö";
		System.out.println(str);
		//�� ���ڿ��� ,(comma)�� ������� �����ؼ� �迭�� �����ϰ�
		//�ʹٸ� String class���� �����ϴ� split()�� ����ϸ� �ȴ�.
		String sa[]=str.split(",");
		for(int i=0;i<sa.length;i++) {
			System.out.println(sa[i]);
		}//for
		String name1="���ϴ�";
		//name1�� ��� ���ڷ� �����Ǿ� �ִ°�?
		System.out.println(name1.length());
		//'��'���� ���۵Ǵ� ���ڿ����� ���� Ȯ�� true or false.
		System.out.println(name1.startsWith("��"));
		System.out.println(name1.startsWith("��"));
		System.out.println("*****�ڹ� ���ڿ� ��*****");
		String angel="������";
		String angel2="�˼���";
		System.out.println(angel==angel2);
		String angel3=new String("������");
		System.out.println(angel3);
		//���� ������ ���ڿ������� ����� ��Ŀ� ����
		//������ ���  true�� ��ȯ���� �ʴ´�.
		//�Ʒ� == �����ڴ� ���ڿ� �񱳿� �������� �ʴ�.
		System.out.println(angel==angel3);
		//�ڹ� ���ڿ� �񱳽ÿ��� �ݵ�� String���� �����ϴ�
		//equals() �޼��带 �̿��ؾ� �Ѵ�!!!!!
		System.out.println(angel.equals(angel3));
	}//main
}//class

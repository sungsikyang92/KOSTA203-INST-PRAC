package step5;

public class TestRefArray2 {
	public static void main(String[] args) {
		//�迭 ����, ����, �Ҵ� ���ÿ�
		Person[]p= {new Person("�˼���",22), new Person("������",28), new Person("�����",34)};
		System.out.println(p.length);//3
		System.out.println("**�迭 ����� name�� age�� ���**");
		//�˼��� 22
		//������ 28
		//����� 34
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].getName()+" "+p[i].getAge());
		}
		System.out.println("****�迭 ��� ���̸� 20�� ���Ѵ�****");
		//for���� �̿��� ���̸� 20���� ���Ѵ�.
		for(int i=0;i<p.length;i++) {
			int age=p[i].getAge();
			p[i].setAge(age+20);
		}
		for(int i=0;i<p.length;i++) {
		System.out.println(p[i].getName()+" "+p[i].getAge());
	}
	}
}

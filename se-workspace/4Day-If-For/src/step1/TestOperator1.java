package step1;
//�ڹ� ������ �׽�Ʈ
public class TestOperator1 {
	public static void main(String[] args) {
		int i=7;
		int j=3;
		System.out.println(i*j);//���ϱ�
		System.out.println(i/j);//������ - ��
		System.out.println(i%j);//������
		System.out.println(i=j);//�Ҵ�, ����
		System.out.println(i==j);//������ ��
		boolean flag=false;
		System.out.println(flag);
		System.out.println(!flag);
		System.out.println("******����������*****");
		int k=7;
		System.out.println(k++);//���� �� ����
		System.out.println(k);
		System.out.println(++k);//���� �� ����
		System.out.println(k);
		System.out.println(--k);//���� �� ����
		System.out.println(k--);//���� �� ����
		System.out.println(k);
		System.out.println("**********");
		int money=100;
		//money=money+200;
		//�� �ڵ带 �ٿ��� ǥ���ϸ�
		money+=200;
		System.out.println(money);
		money-=100;//money=money-100�� ������ ǥ��
		System.out.println(money);
		System.out.println("***********");
		//���׿�����
		//���ǽ�? ��1 : ��2
		//���ǽ��� ���̸� ��1�� ����ǰ�, �����̸� ��2�� ����ȴ�.
		int x=10;
		int result=(x>0) ?x+1: x+2;//�����̹Ƿ� ��1�� ����ȴ�
		System.out.println(result);
	}

}

package step3;
//��ü �ʱ�ȭ �ܰ� ���� ����
public class TestObjectInit2 {
	public static void main(String[] args) {
		Friend f=new Friend("�����",21);
		System.out.println(f.getName()+" "+f.getAge()+"��");
		//money�� ����� �ʱ�ȭ 10000�� �Ǿ� �����Ƿ� 10000�� ��ȯ�ȴ�.
		System.out.println(f.getMoney());
	}
}

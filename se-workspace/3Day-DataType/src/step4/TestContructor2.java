package step4;

public class TestContructor2 {
	public static void main(String[] args) {
		//�Ű��������� ����Ʈ �����ڰ� �����Ƿ� �Ʒ��� ���� ��ü ������ �� �� ����.
		//CreditCard c=new CreditCard();
		CreditCard c=new CreditCard("������ ��������");
		System.out.println(c.getCustomerInfo());
		c.setCustomerInfo("������ ��������");
		System.out.println(c.getCustomerInfo());
	}
}

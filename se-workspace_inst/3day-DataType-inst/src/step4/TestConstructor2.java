package step4;

public class TestConstructor2 {
	public static void main(String[] args) {
     // �Ű��������� ����Ʈ ������ �����Ƿ� �Ʒ��� ����
	// ��ü ������ �� ���� 
	//	CreditCard c=new CreditCard();
		CreditCard c=new CreditCard("������ ��������");
		System.out.println(c.getCustomerInfo());
		c.setCustomerInfo("������ ��������");
		System.out.println(c.getCustomerInfo());
	}
}










package step4;

public class CreditCard {
	private String customerInfo;
	//constructor
	//�����ڿ� �Ű������� ���ǵǾ 
	//��ü �����ÿ��� �Ű������� �˸´� ������ 
	//������ ���� ��ü ������ �� �ִ� 
	public CreditCard(String customerInfo) {
		this.customerInfo=customerInfo;
	}
	//getter 
	public String getCustomerInfo() {
		return customerInfo;
	}
	//setter
	public void setCustomerInfo(String customerInfo) {
		this.customerInfo=customerInfo;
	}
}



package step2;

public class Car {
	// �ν��Ͻ� �����̹Ƿ� ���� �ϸ� �⺻ �ʱ�ȭ false ( boolean Ÿ���̹Ƿ� )
	private boolean flag;
	// �ν��Ͻ� ����, �Ǽ����̹Ƿ� 0.0 ���� �⺻ �ʱ�ȭ 
	private double price;
	// �ν��Ͻ� ����, �������̹Ƿ� null �� �⺻ �ʱ�ȭ 
	private String model;
	// boolean ���� get�޼��尡 �ƴ϶� is�޼��带 �����Ѵ�.
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}	
	
}






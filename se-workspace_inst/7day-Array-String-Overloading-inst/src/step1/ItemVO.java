package step1;
/*	�ڹ� Ŭ������ ���� 
 *  VO : Value Object 
 *  Service : ����Ͻ� ������ ����ϴ� ��ü 
 *  DAO : Data Access Object ������ ���� ��ü 
 *  DTO : Data Transfer Object ������ ���� ��ü 
 */
public class ItemVO {
	private String model;
	private int price;
	public ItemVO(String model, int price) {	
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}











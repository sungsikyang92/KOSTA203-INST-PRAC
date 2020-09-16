package step1;

public class ItemVo {
	private String product;
	private int price;
	public ItemVo(String product, int price) {
		this.product=product;
		this.price=price;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

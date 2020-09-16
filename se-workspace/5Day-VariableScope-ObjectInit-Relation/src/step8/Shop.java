package step8;

public class Shop {
	private Product product;
	private String name;
	public Shop(Product product, String name) {
		this.product=product;
		this.name=name;
	}
	public Shop() {	
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product=product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}

package a_model;

public class MenuVO {
	private String id;
	private String menu;
	private int price;
	public MenuVO(String id, String menu, int price) {
		super();
		this.id = id;
		this.menu = menu;
		this.price = price;
	}
	public MenuVO() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

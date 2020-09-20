package org.study.model;

public class MenuVO {
	private String name;
	private int price;
	private String info;
	public MenuVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MenuVO(String name, int price, String info) {
		super();
		this.name = name;
		this.price = price;
		this.info = info;
	}
	public MenuVO(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "MenuVO [name=" + name + ", price=" + price + ", info=" + info + "]";
	}
	
}

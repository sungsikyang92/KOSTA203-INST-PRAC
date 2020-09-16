package step2;

public class Car {
	//인스턴스 변수이므로 선언만 하면 기본 초기화 false(boolean 타입이므로)
	private boolean flag;
	//인스턴스 변수, 실수형이므로 0.0으로 기본 초기화
	private double price;
	//인스턴스 변수, 참조형이므로 null로 기본 초기화
	private String model;
	//boolean 형은 get 메서드가 아니라 is 메서드를 정의한다. (is는 참 아니면 거짓의 의미)
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

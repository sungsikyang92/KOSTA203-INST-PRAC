package step2;

public class Car {
	private String model;
	private Engine engine;
	public Car(String model) {
		this.model=model;
		this.engine=new Engine("L4","2000");
	}
	public String getModel() {
		return model;
	}
	public void setModle(String model) {
		this.model=model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
}
	
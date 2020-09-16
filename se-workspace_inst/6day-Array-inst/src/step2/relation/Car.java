package step2.relation;

public class Car {
	private String model;
	private Engine engine;
	/*  Car �� Engine �� composition ���� ( consist of ~   �����Ǵ� ) 
	 *  Car ���� Engine�� �ʼ����� ��������̹Ƿ� 
	 *  Car ������ ( Car ��ü ������ ����Ǵ� ��� ) �� ����� �� 
	 *  ���� Engine ��ü���� �����ǵ��� �����Ѵ� 
	 */
	public Car(String model) {
		this.model=model;
		this.engine=new Engine("L4","2000");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}

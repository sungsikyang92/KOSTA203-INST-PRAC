package step6;

public class Person {
	private String name;
	private SmartPhone smartPhone;
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(SmartPhone smartPhone) {
		super();
		this.smartPhone = smartPhone;
	}

	public SmartPhone getSmartPhone() {
		return smartPhone;
	}

	public void setSmartPhone(SmartPhone smartPhone) {
		this.smartPhone = smartPhone;
	}
	
}

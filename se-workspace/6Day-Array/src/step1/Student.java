package step1;

public class Student {
	//아래 3줄 인스턴스 변수
	private String	id;
	private String name;
	private String address;
	//아래 4줄 생성자
	public Student(String id, String name, String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
}

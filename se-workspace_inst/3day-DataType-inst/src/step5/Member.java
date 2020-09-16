package step5;
// class 객체생성을 위한 틀 
public class Member {
	// instance variable 인스턴스변수 : 객체 속성 정보를 저장하는 공간 
	private String id;
	private String name;
	public Member(String id,String name) {
		this.id=id;
		this.name=name;
	}
	// setter / getter 를 툴로 생성해본다 
	// 단축키 alt  shift s 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}








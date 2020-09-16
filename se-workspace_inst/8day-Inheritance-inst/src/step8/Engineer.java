package step8;

public class Engineer extends Employee{
	private String skill;
	public Engineer(String empId, String name, int salary, String skill) {
		super(empId, name, salary);
		this.skill = skill;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	// 메서드 오버라이딩 : 부모 메서드를 자신에 맞게 재정의 
	public String getDetails() {
		// 아래와 같이 부모메서드를 이용하고 추가사항만 구현하면 된다 
		return super.getDetails()+" skill "+skill;
	}
}









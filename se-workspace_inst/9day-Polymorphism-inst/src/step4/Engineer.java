package step4;

public class Engineer extends Employee {
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

	@Override
	public String toString() {
		return "Engineer [skill=" + skill + ", getEmpId()=" + getEmpId() + ", getName()=" + getName() + ", getSalary()="
				+ getSalary() + "]";
	}

	

	
	
}












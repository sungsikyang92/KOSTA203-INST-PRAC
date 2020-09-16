package step4;

public class Manager extends Employee{
	private String department;

	public Manager(String empId, String name, int salary, String department) {
		super(empId, name, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + ", getEmpId()=" + getEmpId() + ", getName()=" + getName()
				+ ", getSalary()=" + getSalary() + "]";
	}
	
}









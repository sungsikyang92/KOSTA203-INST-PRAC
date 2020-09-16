package step4;

public class Manager extends Employee{
	private String department;
	public Manager(String empNo, String name, int salary, String department) {
		super(empNo, name, salary);
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	@Override
	public String toString() {
		return "Manager[ empNo="+super.getempNo()+", name="+super.getname()+", salary="+super.getSalary()+", department="+department+" ]";
	}
}

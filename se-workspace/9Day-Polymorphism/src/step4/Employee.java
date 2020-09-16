package step4;

public class Employee {
	private String empNo;
	private String name;
	private int salary;
	public Employee(String empNo, String name, int salary) {
		this.empNo=empNo;
		this.name=name;
		this.salary=salary;
	}
	public String getempNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo=empNo;
	}
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee[ empNo="+empNo+", name="+name+", salary="+salary+" ]";
	}
}

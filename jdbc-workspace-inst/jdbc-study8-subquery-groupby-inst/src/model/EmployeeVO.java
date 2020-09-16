package model;

public class EmployeeVO {
	private String empNo;
	private String name;
	private String job;
	private int salary;
	public EmployeeVO() {
		super();		
	}
	public EmployeeVO(String empNo, String name, String job, int salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeVO [empNo=" + empNo + ", name=" + name + ", job=" + job + ", salary=" + salary + "]";
	}
	
}

package step3;
class Employee{
	private String empId;
	private String name;
	public Employee(String empId, String name) {
		super();// Object ������ ȣ���Ͽ� ��ü ���� 
		this.empId = empId;
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}	
}
public class TestToString2 {
	public static void main(String[] args) {
		Employee e=new Employee("20", "�缺��");
		//Employee ����  toString() �� �������̵������Ƿ� 
		//�������̵��� �ڽ��� �޼��尡 ȣ��ȴ� 
		System.out.println(e);//println() �޼��尡 ���������� toString()�� ȣ��
		System.out.println(e.toString());
		//�� �� ������ ������ ����� ��� 
	}
}
















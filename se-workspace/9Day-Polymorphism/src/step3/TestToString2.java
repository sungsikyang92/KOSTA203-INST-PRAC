package step3;
class Employee{
	String empId;
	String name;
	public Employee(String empId, String name) {
		this.empId=empId;
		this.name=name;
	}
		@Override
		public String toString() {
			return "Employee [empId="+empId+", name="+name+"]";
		
	}
}
public class TestToString2 {
	public static void main(String[]args) {
		Employee e=new Employee("20", "�����̾�����");
		//Employee���� toString()�� �������̵� �����Ƿ�
		//�������̵��� �ڽ��� �޼��尡 ȣ��ȴ�.
		System.out.println(e);//println() �޼��尡 ���������� toString()�� ȣ��
		System.out.println(e.toString());
		//�� �� ������ ������ ����� ���
	}
}

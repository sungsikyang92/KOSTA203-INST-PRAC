package SH;

public class TestInheritance1 {
	public static void main(String[] args) {
		Employee e = new Employee("19","���ӽ�",1300);
		 System.out.println(e.getEmpNo()+" "+e.getName()+" "+e.getSalary());
		
	 Manager m = new Manager("20","�κ�Ʈ",1300,"���������");
	 System.out.println(m.getEmpNo()+" "+m.getName()+" "+m.getSalary()+" "+m.getDepartment());
	}
}

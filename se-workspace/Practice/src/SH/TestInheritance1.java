package SH;

public class TestInheritance1 {
	public static void main(String[] args) {
		Employee e = new Employee("19","제임스",1300);
		 System.out.println(e.getEmpNo()+" "+e.getName()+" "+e.getSalary());
		
	 Manager m = new Manager("20","로보트",1300,"기술지원부");
	 System.out.println(m.getEmpNo()+" "+m.getName()+" "+m.getSalary()+" "+m.getDepartment());
	}
}

package step3;

public class TestPolymorphism7 {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
			service.printDetailInfo(new Employee("������", 1000));
			service.printDetailInfo(new Engineer("�����", 1100,"java",500));
			service.printDetailInfo(new Manager("������", 1200,"���ߺ�"));
			service.printAnnualSalary(new Employee("������", 1000));
			service.printAnnualSalary(new Engineer("�����", 1100,"java",500));
			service.printAnnualSalary(new Manager("������", 1200,"���ߺ�"));		
	}
}

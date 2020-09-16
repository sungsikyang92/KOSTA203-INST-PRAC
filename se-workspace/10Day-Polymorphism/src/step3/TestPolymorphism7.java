package step3;

public class TestPolymorphism7 {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
			service.printDetailInfo(new Employee("강상훈", 1000));
			service.printDetailInfo(new Engineer("정재우", 1100,"java",500));
			service.printDetailInfo(new Manager("정세희", 1200,"개발부"));
			service.printAnnualSalary(new Employee("강상훈", 1000));
			service.printAnnualSalary(new Engineer("정재우", 1100,"java",500));
			service.printAnnualSalary(new Manager("정세희", 1200,"개발부"));		
	}
}

package step3;

public class CompanyService {

	public void printDetailInfo(Employee employee) {
		System.out.println(employee);
	}
	public void printAnnualSalary(Employee employee) {
		int money=employee.getSalary();
		if(employee instanceof Engineer) {
			money+=((Engineer) employee).getBonus();
		}
		System.out.println(money*12);
	}
}






	
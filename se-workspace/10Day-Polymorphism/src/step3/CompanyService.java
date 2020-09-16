package step3;

public class CompanyService {
	public void printDetailInfo(Employee e) {
		System.out.println(e.toString());
	}
	public void printAnnualSalary(Employee e) {
		if(e instanceof Engineer) {
			System.out.println((e.getSalary()+((Engineer)e).getBonus())*12);
		}else {
			System.out.println(e.getSalary()*12);
		}
	}
}

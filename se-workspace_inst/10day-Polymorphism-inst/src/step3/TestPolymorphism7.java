package step3;

public class TestPolymorphism7 {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
		//service.printDetailInfo(new Employee("강상훈",1000));
		// name:강상훈, salary:1000
		//service.printDetailInfo(new Engineer("정재우",1100,"java",500));
		// name:정재우, salary:1100, skill:java, bonus:500
		//service.printDetailInfo();
		// name:정세희, salary:1200, department:개발부 
		// 연봉을 계산해서 출력하는 메서드 ( salary 곱하기 12 ) 
		// 단 엔지니어는 salary 와 bonus 를 더해서 곱하기 12 
		service.printAnnualSalary(new Employee("강상훈",1000));//12000
		service.printAnnualSalary(new Manager("정세희",1200,"개발부"));
		service.printAnnualSalary(new Engineer("정재우",1100,"java",500));
	}
}













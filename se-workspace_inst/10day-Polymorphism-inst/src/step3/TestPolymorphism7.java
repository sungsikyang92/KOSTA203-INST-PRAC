package step3;

public class TestPolymorphism7 {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
		//service.printDetailInfo(new Employee("������",1000));
		// name:������, salary:1000
		//service.printDetailInfo(new Engineer("�����",1100,"java",500));
		// name:�����, salary:1100, skill:java, bonus:500
		//service.printDetailInfo();
		// name:������, salary:1200, department:���ߺ� 
		// ������ ����ؼ� ����ϴ� �޼��� ( salary ���ϱ� 12 ) 
		// �� �����Ͼ�� salary �� bonus �� ���ؼ� ���ϱ� 12 
		service.printAnnualSalary(new Employee("������",1000));//12000
		service.printAnnualSalary(new Manager("������",1200,"���ߺ�"));
		service.printAnnualSalary(new Engineer("�����",1100,"java",500));
	}
}













package step1.ex;

import step1.model.CompanyService;
import step1.model.Employee;
import step1.model.Engineer;
import step1.model.Manager;

public class TestEx {
	public static void main(String[] args) {		
		CompanyService service=new CompanyService(100);
		System.out.println("******�����Ͻ���********");
		service.add(new Manager("17","�����",700,"��ȹ��"));
		service.add(new Engineer("19", "������", 900, "spring"));
		service.add(new Employee("20", "������", 600));
		service.add(new Employee("21", "�̵���", 650));
		System.out.println("******�����ϳ�********");
		System.out.println("******��ü�������********");
		service.printAll(); 
		
		/*	 empId : 17 , name : ����� , salary : 700 , department : ��ȹ�� 
		 *   empId : 19 , name : ������ , salary : 900 , skill : spring
		 *   empId : 20 , name : ������ , salary : 600 
		 *   empId : 21 , name : �̵��� , salary : 650 
		 */
		//System.out.println("******������̵�� �˻�********");
		//Employee e=service.findById("20");
		//System.out.println(e);
		// empId : 20 , name : ������ , salary : 600 
		
		System.out.println("****������̵� �ش��ϴ� �迭��� ��ġ ã��****");
		
		System.out.println(service.findIndexByEmpId("20"));//2 
		
		System.out.println("*****������̵�� ����*****");
		service.removeById("20");
		service.printAll();
		/*	 empId : 17 , name : ����� , salary : 700 , department : ��ȹ�� 
		 *   empId : 19 , name : ������ , salary : 900 , skill : spring		
		 *   empId : 21 , name : �̵��� , salary : 650 
		 */
	}
}












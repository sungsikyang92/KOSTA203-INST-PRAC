package step6.ex;

import step6.model.CompanyService;
import step6.model.Employee;
import step6.model.Engineer;
import step6.model.Manager;

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
		//System.out.println("*****������̵�� ����*****");
		//service.removeById("20");
		//service.printAll();
		/*	 empId : 17 , name : ����� , salary : 700 , department : ��ȹ�� 
		 *   empId : 19 , name : ������ , salary : 900 , skill : spring		
		 *   empId : 21 , name : �̵��� , salary : 650 
		 */
	}
}












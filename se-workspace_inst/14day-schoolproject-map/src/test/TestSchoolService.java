package test;

import model.Employee;
import model.Person;
import model.SchoolService;
import model.Student;
import model.Teacher;

/*
 * ����Ͻ� ������ ����ϴ� SchoolService�� ���� �׽�Ʈ�ϴ� Ŭ����
 */
public class TestSchoolService {
	public static void main(String[] args) {
		SchoolService service=new SchoolService();
		/*
		System.out.println("**������ ���� �߰� ����**");
		  service.addPerson(new Student("0101231234","������","����","17"));
		  service.addPerson(new Teacher("0101231235","�ż�ȣ","����","����"));
		  service.addPerson(new Student("0101231236","������","����","16"));
		  service.addPerson(new Employee("0101231237","�ۿ���","ȭ��","�繫��"));
		  service.addPerson(new Student("0101231238","������","����","18"));
		  service.addPerson(new Teacher("0101231239","����","����","����"));
		System.out.println("**������ ���� �߰� �Ϸ�**");
		System.out.println("**�߰��� �ߺ�Ȯ��**");		
		//�����ϴ� ��ȭ��ȣ�� �������� �߰��Ƿ��� �� �� 
		service.addPerson(new Student("0101231234","������","����","19"));
		//���� ���� ������ tel�� ���� �������� �߰����� �� 
		// tel �� �ߺ��Ǿ� �߰��� �� �����ϴ�! �޼��� ����ϰ� �߰����� �ʴ´� 
		System.out.println("**�ߺ��׽�Ʈ �� ����Ʈ Ȯ��**");
		service.printAll();
		System.out.println("**������ ��ü ���**");
		service.printAll();		
		*/
		/*		
		System.out.println("**tel�� �˻��޼��� �׽�Ʈ**");
		Person p=service.findPersonByTel("0101231236");
		System.out.println("�˻����:"+p);
		System.out.println("**���� �׽�Ʈ**");
		Person rp=service.removePersonByTel("0101231236");
		System.out.println("�������:"+rp);
		System.out.println("**���� �� ����Ʈ Ȯ��**");
		service.printAll();
		service.updatePerson(new Teacher("0101231237","�ۿ���","����","�ڹ�"));
		System.out.println("**���� �� ����Ʈ Ȯ��**");
		service.printAll();
		*/
	}
}




















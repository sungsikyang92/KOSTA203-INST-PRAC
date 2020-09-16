package test;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestSchoolService {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		service.addPerson(new Student("0101231234", "������", "����", "17"));
		service.addPerson(new Teacher("0101231235", "�ż�ȣ", "����", "����"));
		service.addPerson(new Student("0101231236", "������", "����", "16"));
		service.addPerson(new Employee("0101231237", "�ۿ���", "ȭ��", "�繫��"));
		service.addPerson(new Student("0101231238", "������", "����", "18"));
		service.addPerson(new Teacher("0101231239", "����", "����", "����"));
		service.printAll();
		// �ߺ��׽�Ʈ
		/*
		 * service.addPerson(new Student("0101231234","������","���","18"));// tel �� �ߺ��Ǿ�
		 * �߰��� �� �����ϴ� System.out.println("***�б� ������ ��� �Ϸ�***"); service.printAll();//6��
		 * ��� System.out.println("***��ü ������ ��� �Ϸ�***"); String tel="0101231235"; Person
		 * p=service.findPersonByTel(tel); System.out.println("�˻����:"+p); // tel�� �ش��ϴ�
		 * �������� ������ ����ϰ� ������ null�� ��µ� System.out.println("***�˻��Ϸ�***");
		 * System.out.println("**���� �� ���**"); service.printAll();//6�� ��� Person
		 * p=service.deletePersonByTel("0101231239"); System.out.println("��������:"+p);
		 * System.out.println("**���� �� ���**"); service.printAll();//5�� ���
		 */
	}
}
package step1.review;

public class School {
	/*
	 *  �ν��Ͻ� ���� : ��ü �Ӽ� ���� ���� , Heap �޸� ����
	 *  ���� �ص� �⺻ �ʱ�ȭ �ȴ�. 
	 *  �Ʒ��� String ������ ������Ÿ���̹Ƿ� null 
	 */
	private String name;
	private Student student;
	/*
	 * �����ڿ� ����� name�� ������������ �Ű������̴� 
	 * this Ű����� ���� ��ü �� �ν��Ͻ��� ����Ų�� 
	 */
	public School(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}








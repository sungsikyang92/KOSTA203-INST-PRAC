package step1;

public class School {
	/*
	 * �ν��ϼ� ����: ��ü �Ӽ� ���� ����, Heap �޸� ����
	 * ���� �ص� �⺻ �ʱ�ȭ �ȴ�.
	 * �Ʒ��� String ������ ������Ÿ���̹Ƿ� null
	 */
	private String name;
	/*
	 * �����ڿ� ����� name�� ������������ �Ű������̴�.
	 * this Ű����� ���� ��ü, �� �ν��Ͻ��� ����Ų��.
	 */
	public School(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	private Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student=student;
	}
}

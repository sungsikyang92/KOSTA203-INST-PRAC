package step1.review;

public class TestReview {
	public static void main(String[] args) {
		School school=new School("�ڽ�Ÿ���б�");
		System.out.println(school.getName());
		// School �� Student �� aggregation ����� ǥ�� 
		Student stu=new Student("20","������","�Ǳ�");
		school.setStudent(stu);
		System.out.println(school.getStudent().getId());//20
		System.out.println(school.getStudent().getName());//������
		System.out.println(school.getStudent().getAddress());//�Ǳ�
	}
}








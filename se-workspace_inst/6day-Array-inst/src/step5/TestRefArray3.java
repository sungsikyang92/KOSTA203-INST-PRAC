package step5;

import step1.review.Student;

public class TestRefArray3 {
	public static void main(String[] args) {
		School school=new School();
		Student[] stuArray= {
				new Student("20","������","�Ǳ�"),
				new Student("19","�˼���","����"),
				new Student("11","�����","����")
		};
		school.printAll(stuArray);
		
	}
}











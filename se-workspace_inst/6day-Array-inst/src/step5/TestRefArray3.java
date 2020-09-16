package step5;

import step1.review.Student;

public class TestRefArray3 {
	public static void main(String[] args) {
		School school=new School();
		Student[] stuArray= {
				new Student("20","아이유","판교"),
				new Student("19","옹성우","용인"),
				new Student("11","장기하","제주")
		};
		school.printAll(stuArray);
		
	}
}











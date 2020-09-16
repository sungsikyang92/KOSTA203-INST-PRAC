package step5;

import step1.Student;

public class School {

	public void printAll(Student[] stuArray) {
		for(int i=0;i<stuArray.length;i++) {
			System.out.println("학번"+stuArray[i].getId()+"이름"+stuArray[i].getName()+"주소"+stuArray[i].getAddress());
		}
	}

}

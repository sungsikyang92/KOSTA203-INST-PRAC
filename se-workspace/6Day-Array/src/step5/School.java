package step5;

import step1.Student;

public class School {

	public void printAll(Student[] stuArray) {
		for(int i=0;i<stuArray.length;i++) {
			System.out.println("�й�"+stuArray[i].getId()+"�̸�"+stuArray[i].getName()+"�ּ�"+stuArray[i].getAddress());
		}
	}

}

package step6.model;

public class CompanyService {
	private Employee[] array;
	private int index;
	public CompanyService(int length) {
		array=new Employee[length];
	}
	public void add(Employee e) {
		// �����ü�� ���޵� ������ �迭 ��ҷ� ��� index�� �ϳ��� ������Ų�� 
		array[index++]=e;
	}
	public void printAll() {
		for(int i=0;i<index;i++) {
			System.out.println(array[i]);
		}
	}
}








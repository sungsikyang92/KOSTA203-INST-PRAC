package step6.model;

public class CompanyService {
	private Employee[] array;
	private int index;
	public CompanyService(int length) {
		array=new Employee[length];
	}
	public void add(Employee e) {
		// 사원객체가 전달될 때마다 배열 요소로 담고 index를 하나씩 증가시킨다 
		array[index++]=e;
	}
	public void printAll() {
		for(int i=0;i<index;i++) {
			System.out.println(array[i]);
		}
	}
}








package step3;
class Employee{
	String empId;
	String name;
	public Employee(String empId, String name) {
		this.empId=empId;
		this.name=name;
	}
		@Override
		public String toString() {
			return "Employee [empId="+empId+", name="+name+"]";
		
	}
}
public class TestToString2 {
	public static void main(String[]args) {
		Employee e=new Employee("20", "빡빡이아저씨");
		//Employee에서 toString()을 오버라이딩 했으므로
		//오버라이딩한 자신의 메서드가 호출된다.
		System.out.println(e);//println() 메서드가 내부적으로 toString()을 호출
		System.out.println(e.toString());
		//위 두 라인은 동일한 결과를 출력
	}
}

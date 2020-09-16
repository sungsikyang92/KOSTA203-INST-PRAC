package step2;
class Employee{
	
}
class Employee2{
	String empId;
	String name;
	public Employee2(String empId, String name) {
		this.empId=empId;
		this.name=name;
	}
	@Override
	public String toString() {
		return "empId:"+empId+"name:"+name;
	}
}
public class TestToString {
	public static void main(String[]args) {
		Employee e=new Employee();
		//Object의 자식이므로 toString() 사용가능
		System.out.println(e.toString());//Employee 객체 주소값이 반환되어 출력된다. 기본기능은 주소값
		//println 내부에서 참조변수가 들어오면 toString()을 호출하므로
		//아래와 같이 사용할수도 있다.
		System.out.println(e);
		Employee2 e2=new Employee2("20", "김수민");
		System.out.println(e2);
	}
}

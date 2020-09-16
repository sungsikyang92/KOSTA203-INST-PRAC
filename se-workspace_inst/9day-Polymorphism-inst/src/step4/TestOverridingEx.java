package step4;

public class TestOverridingEx {
	public static void main(String[] args) {
		Employee e=new Employee("18","이진욱",900);
		System.out.println(e);
		// Employee[ empNo=18, name=이진욱, salary=900 ]
		Engineer en=new Engineer("19","배율휘",1000,"java");
		System.out.println(en);
		// Engineer[ empNo=18, name=배율휘, salary=1000, skill=java ]
		Manager m=new Manager("13","송영섭",1500,"개발");
		System.out.println(m);
		// Manager[ empNo=13 , name=송영섭, salary=1500, department=개발 ]
	}
}









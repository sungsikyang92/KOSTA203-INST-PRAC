package step4;

public class TestOverridingEx {
	public static void main(String[] args) {
		Employee e=new Employee("18","������",900);
		System.out.println(e);
		// Employee[ empNo=18, name=������, salary=900 ]
		Engineer en=new Engineer("19","������",1000,"java");
		System.out.println(en);
		// Engineer[ empNo=18, name=������, salary=1000, skill=java ]
		Manager m=new Manager("13","�ۿ���",1500,"����");
		System.out.println(m);
		// Manager[ empNo=13 , name=�ۿ���, salary=1500, department=���� ]
	}
}









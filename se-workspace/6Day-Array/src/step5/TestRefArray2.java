package step5;

public class TestRefArray2 {
	public static void main(String[] args) {
		//배열 선언, 생성, 할당 동시에
		Person[]p= {new Person("옹성우",22), new Person("아이유",28), new Person("장기하",34)};
		System.out.println(p.length);//3
		System.out.println("**배열 요소의 name과 age를 출력**");
		//옹성우 22
		//아이유 28
		//장기하 34
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].getName()+" "+p[i].getAge());
		}
		System.out.println("****배열 요소 나이를 20을 더한다****");
		//for문을 이용해 나이를 20세씩 더한다.
		for(int i=0;i<p.length;i++) {
			int age=p[i].getAge();
			p[i].setAge(age+20);
		}
		for(int i=0;i<p.length;i++) {
		System.out.println(p[i].getName()+" "+p[i].getAge());
	}
	}
}

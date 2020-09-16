package step2;

public class TestIf {
	public static void main(String[] args) {
		int age=14;
		if(age>18) {//18세를 초과하면
			System.out.println(age+"세 성인");
		}else if(age>13) {//13세를 초과하면
			System.out.println(age+"세 청소년");
		}else {
			System.out.println(age+"세 미성년자");
		}//else
	}//main
}//class

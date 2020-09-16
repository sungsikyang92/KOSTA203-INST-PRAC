package step2;

public class TestException4 {
//Exception 예외 발생시 실행의 흐름을 알아보는 예제
	public static void main(String[] args) {
		String age="스물한살";
//		age="1";
		try {
			int intAge=Integer.parseInt(age);//Integer.parseInt()는 "문자형 숫자"를 정수변환 시켜준다
			System.out.println(intAge+1);
			System.out.println("d");
		}catch(NumberFormatException ne) {
			System.out.println("a");
		}catch(Exception e) {
			System.out.println("b");
		}
		System.out.println("c");
	}
}

package step3;
/*
 * static 초기화 블럭 테스트 예제
 * main 보다 먼저 실행된다
 */
public class TestStatic5 {
	public static void main(String[] args) {
		System.out.println("main 메서드 실행");
	}static {//프로그램 사전작업
		System.out.println("static 초기화 영역 실행");
	}
}

package step2;

public class TestFinally {
	public static void main(String[] args) {
//		String name="개똥"; ← 정상수행
		String name=null;
		try {
			System.out.println(name.length());
			System.out.println("추가작업");
		}catch(IndexOutOfBoundsException ie) {
			System.out.println("범위초과");
		}catch(NullPointerException ne) {
			System.out.println("null 이므로 실행불가");
		}finally {
			System.out.println("finally 항상 수행");
		}
		System.out.println("정상수행");
	}
}

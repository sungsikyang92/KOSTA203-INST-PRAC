package step7;

public class TestFor3 {
	public static void main(String[] args) {
		/*		1	2	3	4	5
		 *      1	2	3	4	5
		 *      1	2	3	4	5
		 */
		int row=3;//행
		int col=5;//열 
		/*
		 * System.out.print("아  \t이유"); System.out.print("킹"); System.out.println();
		 * System.out.print("박  \t보검"); System.out.print("킹");
		 */
		// 중첩 반복문 
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}










package step7;

public class TestFor3 {
	public static void main(String[] args) {
		int row=3;
		int col=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}

package step7;

public class TestFor4 {
	public static void main(String[] args) {
		int row=3;
		int col=2;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print("\t@");
			}
			System.out.println();
		}
	}
}

package jH;

public class Pyramid {
	public static void main(String[] args) {
		for(int i=0;i<=18;i++) {
			if(i<10) {
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
			}else if(i>9){
				for(int k=0;k<=18-i;k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			for(int k=9;k<18-i;k--) {
//				System.out.print("*");
//		}
	}
}

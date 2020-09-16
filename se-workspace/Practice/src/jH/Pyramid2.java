package jH;

public class Pyramid2 {
	public static void main(String[] args) {
		for(int a=0;a<6;a++) {
			if(a<3) {
				for(int b=0;b<3;b++) {
					for(int c=0;c<=b;c++) {
						System.out.print(" ");
					}
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

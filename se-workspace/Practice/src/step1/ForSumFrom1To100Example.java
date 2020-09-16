package step1;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
	
//		int sum=0;
//		for(int i=1,j=1;i<=100&&j<=50;i++,j++) {
//			sum+=i;
//		}
//		System.out.println("1~100 гу : "+sum );
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+= i;
		}
		System.out.println("1~100 гу : "+ sum);
	}
}

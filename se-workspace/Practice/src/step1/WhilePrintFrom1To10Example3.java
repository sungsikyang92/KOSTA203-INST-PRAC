package step1;

public class WhilePrintFrom1To10Example3 {
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("1~"+(i-1)+"��:"+sum);
	}
}

package step4;

public class TestArray4 {
	public static void main(String[] args) {
		int price[] = {7000,4500,5000,12000};
		// price �迭 ��Ҹ� ��� ����ϵ� 10000 �̸��� ����Ѵ� 
		for(int i=0;i<price.length;i++) {
			if(price[i]<10000) {
			System.out.println(price[i]);
			}//if
		}//for
	}
}

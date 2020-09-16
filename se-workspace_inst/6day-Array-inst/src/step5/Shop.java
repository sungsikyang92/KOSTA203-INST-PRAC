package step5;

public class Shop {
	public void printAvgPrice(Product[] p) {
		int sum=0;
		for(int i=0;i<p.length;i++) {
			sum+=p[i].getPrice();
		}
		System.out.println("상품평균가격 "+sum/p.length+"원");
	}
}

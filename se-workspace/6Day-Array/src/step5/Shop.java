package step5;

public class Shop {

	public void printAvgPrice(Product[] p) {
		int sum=0;
		int avg=0;
		for(int i=0;i<p.length;i++) {
			sum+=p[i].getPrice();
		}
		avg=sum/p.length;
		System.out.println("»ïÇ³Æò±Õ°¡°Ý"+avg+"¿ø");
	}

}

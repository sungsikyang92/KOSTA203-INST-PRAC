package step5;

public class Shop {
	public void printAvgPrice(Product[] p) {
		int sum=0;
		for(int i=0;i<p.length;i++) {
			sum+=p[i].getPrice();
		}
		System.out.println("��ǰ��հ��� "+sum/p.length+"��");
	}
}

package step5;

public class TestRefArray4 {
	public static void main(String[] args) {
		Product[] p={
				new Product("����",3000),
				new Product("����",7000),
				new Product("���ɸ�",2000)
		};
		Shop shop=new Shop();
		shop.printAvgPrice(p); // ��ǰ��հ���  4000�� 
	}
}








package step8;

public class TestAggregration3 {
	public static void main(String[] args) {
		Shop shop=new Shop();
		shop.setName("�������̽�������");
		shop.setProduct(new Product("�����", "���", 1000));
		System.out.println(shop.getName());//�������̽�������
		System.out.println(shop.getProduct().getName());//�����
		System.out.println(shop.getProduct().getMaker());//���
		System.out.println(shop.getProduct().getPrice());//1000
		//����� ������ 1200���� �����غ���.
		shop.getProduct().setPrice(1200);
		System.out.println(shop.getProduct().getPrice());//1200
		
	}
}

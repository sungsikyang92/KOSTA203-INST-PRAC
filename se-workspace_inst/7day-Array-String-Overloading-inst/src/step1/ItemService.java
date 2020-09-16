package step1;

public class ItemService {
	public void printAllModel(ItemVO[] item) {
		for(int i=0;i<item.length;i++) {
			System.out.println(item[i].getModel());
		}
	}

	public void printMaxPrice(ItemVO[] item) {
		int maxPrice=Integer.MIN_VALUE;
		for(int i=0;i<item.length;i++) {
			if(maxPrice<item[i].getPrice()) {
				maxPrice=item[i].getPrice();
			}//if
		}//for
		System.out.println("������ �ְ�:"+maxPrice);
	}//method
}//class








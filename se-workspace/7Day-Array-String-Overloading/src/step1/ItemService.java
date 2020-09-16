package step1;

public class ItemService {
	

	public void printMaxPrice(ItemVo[] item) {
		int maxPrice=item[0].getPrice();
		for(int i=0;i<item.length;i++) {
			if(maxPrice<item[i].getPrice()) {
				maxPrice=item[i].getPrice();
			}
			System.out.println(maxPrice);
		}
	}

	public void printAllModel(ItemVo[] item) {
		for(int i=0;i<item.length;i++) {
			System.out.println(item[i].getProduct());
		}
	}

}

package step1;

public class TestRefArray5 {
	public static void main(String[] args) {
		ItemVO[] item= {
				new ItemVO("������9", 100),
				new ItemVO("������8", 110),
				new ItemVO("G7", 50)
		};
		ItemService service=new ItemService();
		//service.printAllModel(item);
		// ������ �ְ��� ����Ѵ� 
		service.printMaxPrice(item); // 110
	}
}















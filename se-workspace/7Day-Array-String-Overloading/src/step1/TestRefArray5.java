package step1;

public class TestRefArray5 {
	public static void main(String[] args) {
		ItemVo[]item= {
				new ItemVo("갤럭시9",100),
				new ItemVo("아이폰8",110),
				new ItemVo("G7",50)
		};
		ItemService service=new ItemService();
		service.printAllModel(item);
		service.printMaxPrice(item);
	}
}

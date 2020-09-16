package org.kosta.controller;
/*
 * 컨트롤러 객체의 생성을 전담하는 Factory 클래스 
 * : 시스템 상에서 하나만 존재하면 되므로 Singleton pattern을 적용해 
 *   단 한번 생성되고 , 이를 여러 곳에서 공유해서 사용할 수 있도록 한다 
 */
public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller=null;
		if(command.contentEquals("totalCount"))
			controller=new TotalProductCountController();
		else if(command.contentEquals("findproductbyid"))
			controller=new FindProductByIdController();
		else if(command.contentEquals("getallproductlist"))
			controller=new ProductListController();
		else if(command.contentEquals("getmakerlist"))
			controller=new MakerKindController();
		else if(command.contentEquals("findproductlistbymaker"))
			controller=new FindProductListByMakerController();
		else if(command.contentEquals("registerproduct")) {
			controller=new RegisterProductController();
		}
		return controller;
	}
}
















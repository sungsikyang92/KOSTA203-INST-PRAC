package org.kosta.controller;
/*
 * Factory 객체 : 컨트롤러 객체 생성을 전담 
 */
public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance; 
	}
	public Controller create(String command) {
		Controller controller=null;
		if(command.contentEquals("register"))
			controller=new RegisterProductController();
		else if(command.contentEquals("list"))
			controller=new ProductListController();
		else if(command.contentEquals("detailproduct"))
			controller=new ProductDetailController();
		return controller;
	}
}












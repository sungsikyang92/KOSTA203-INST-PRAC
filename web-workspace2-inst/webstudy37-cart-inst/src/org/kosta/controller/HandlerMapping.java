package org.kosta.controller;

public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller=null;
		if(command.contentEquals("home")) {
			controller=new HomeController();
		}else if(command.contentEquals("ItemDetail")) {
			controller=new ItemDetailController();
		}else if(command.contentEquals("login")) {
			controller=new LoginController();
		}else if(command.contentEquals("logout")) {
			controller=new LogoutController();
		}else if(command.contentEquals("RegisterItemForm")) {
			controller=new RegisterItemFormController();
		}else if(command.contentEquals("RegisterItem")) {
			controller=new RegisterItemController();
		}else if(command.contentEquals("addcart")) {
			controller=new AddCartController();
		}else if(command.contentEquals("cartview")) {
			controller=new CartViewController();
		}else if(command.contentEquals("deletecart")) {
			controller=new DeleteCartItemController();
		}
		return controller;
	}
}























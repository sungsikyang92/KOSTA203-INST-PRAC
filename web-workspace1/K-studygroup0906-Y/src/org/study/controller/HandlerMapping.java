package org.study.controller;

public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller=null;
		if(command.contentEquals("adminsignin"))
			controller=new AdminLoginController();
		if(command.contentEquals("menuregister"))
			controller=new RegisterMenuController();
		if(command.contentEquals("logout"))
			controller=new UserLogoutController();
		return controller;
	}
}

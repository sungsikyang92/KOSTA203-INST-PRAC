package org.kosta.controller;
/*
 * 개별 컨트롤러 객체 생성을 전담하는 팩토리 클래스 
 */
public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller controller=null;
		if(command.contentEquals("findmemberbyid"))
			controller=new FindMemberByIdController();
		else if(command.contentEquals("login"))
			controller=new LoginController();
		else if(command.contentEquals("logout"))
			controller=new LogoutController();
		else if(command.contentEquals("updateMember"))
			controller=new UpdateMemberController();
		else if(command.contentEquals("register"))
			controller=new RegisterController();
		else if(command.contentEquals("idcheck"))
			controller=new IdCheckController();
		return controller;
	}
}


































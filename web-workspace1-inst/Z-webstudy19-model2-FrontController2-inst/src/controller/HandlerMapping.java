package controller;
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
		Controller c=null;
		if(command.contentEquals("selectCar"))
			c=new SelectCarController();
		else if(command.contentEquals("registerCar"))
			c=new RegisterCarController();
		else if(command.contentEquals("deleteCar"))
			c=new DeleteCarController();
		return c;
	}
}












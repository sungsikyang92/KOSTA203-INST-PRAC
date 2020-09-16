package step5;

public class TestSwitch3 {
	public static void main(String[] args) {
		int month=7;
		DateService service=new DateService();
		service.printLastDay(month);
		// 7월 마지막 일은 31일입니다. 
		month=2;
		service.printLastDay(month);
		// 2월 마지막 일은 28일입니다.
		month=33;
		service.printLastDay(month);
		// 잘못된 입력값입니다.
	}
}







package step5;

public class TestSwitch3 {
	public static void main(String[] args) {
		int month=7;
		DateService service=new DateService();
		service.printLastDay(month);
		month=2;
		service.printLastDay(month);
		month=33;
		service.printLastDay(month);
	}
}

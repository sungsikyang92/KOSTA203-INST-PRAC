package step5;

public class TestSwitch3 {
	public static void main(String[] args) {
		int month=7;
		DateService service=new DateService();
		service.printLastDay(month);
		// 7�� ������ ���� 31���Դϴ�. 
		month=2;
		service.printLastDay(month);
		// 2�� ������ ���� 28���Դϴ�.
		month=33;
		service.printLastDay(month);
		// �߸��� �Է°��Դϴ�.
	}
}







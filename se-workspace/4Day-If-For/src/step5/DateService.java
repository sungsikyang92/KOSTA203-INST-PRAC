package step5;

public class DateService {

	public void printLastDay(int month) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month+"월 마지막 일은 31일 입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month+"월 마지막 일은 30일 입니다.");
			break;
		case 2:
			System.out.println(month+"월 마지막 일은 28일 입니다.");
			break;
		default:
			System.out.println(month+"월은 잘못된 입력값 입니다.");
		}
	}

}

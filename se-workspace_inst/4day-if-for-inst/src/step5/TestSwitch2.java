package step5;

public class TestSwitch2 {
	public static void main(String[] args) {
		/* grade 1 이면 하버드 
		 * 2 이면 북경대 
		 * 3,4,5 카네기멜론 
		 * 나머지 스탠포드 
		 */
		int grade=4;
		switch(grade) {
		case 1: System.out.println("하버드");
		break;
		case 2: System.out.println("북경대");
		break;
		case 3: case 4: case 5:
			System.out.println("카네기멜론");
			break;
		default:
			System.out.println("스탠포드");
		}
	}
}









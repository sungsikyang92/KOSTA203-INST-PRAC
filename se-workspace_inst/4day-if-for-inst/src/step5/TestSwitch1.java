package step5;

public  class TestSwitch1 {
	public static void main(String[] args) {
		//switch case 문 연습 
		int grade=5;
		switch(grade) {
		case 1:
			System.out.println("하버드");
			break; // 실행문을 벗어나는 자바 예약어 
		case 2:
			System.out.println("옥스퍼드");
			break;
		default: // 위 case 에 해당되는 않은 경우에 default 실행
			System.out.println("MIT");
		}
	}//main
}//class







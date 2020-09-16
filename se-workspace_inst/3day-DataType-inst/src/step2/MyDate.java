package step2;

public class MyDate {
	private int day=1;
	public void setDay(int day) {
		if(day<32) {
			this.day=day;
		}else {
			System.out.println(day+"일은 잘못된 입력값입니다");
		}
	}
	public int getDay() {
		return day;
	}
}

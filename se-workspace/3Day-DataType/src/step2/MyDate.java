package step2;

public class MyDate {
	private int date=1;
			public void setDay(int date) {
		if(date<32) {
			this.date=date;
		}else {
			System.out.println("32�� �߸��� �Է°��Դϴ�.");
		}
	}
	public int getDay() {
		return date;
	}
	public int getDay1() {
		return date;
	}
	
}

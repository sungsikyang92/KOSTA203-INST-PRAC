package step3;

public class MyDate {
	private int month=1;
	public void setMonth(int month) {
		// 1 �̻� 12 �����϶� 
		if(month>=1&&month<=12) {
			this.month=month;
		}else {
			System.out.println("�߸��� �Է°��Դϴ�");
		}
	}
	public int getMonth() {
		return month;
	}
}

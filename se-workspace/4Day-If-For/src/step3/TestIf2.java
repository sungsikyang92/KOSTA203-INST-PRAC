package step3;

public class TestIf2 {
	public static void main(String[] args) {
		MyDate date=new MyDate();
		int month=13;//month�� 1~12����
		date.setMonth(month);//�߸��� �Է°��Դϴ�.
		System.out.println(date.getMonth());//1
		month=7;
		date.setMonth(month);
		System.out.println(date.getMonth());//7
	}
}

package step2;
/*
 *  �Ʒ� �ڵ忡 �����Ǵ� Ŭ������ �����غ��� ���� 
 */
public class TestEncapsulation {
	public static void main(String[] args) {
		MyDate d=new MyDate();
		// d.day=2; // ���ٺҰ� 
		d.setDay(10);
		System.out.println(d.getDay()+"��");//10��
		System.out.println("*********");
		MyDate d2=new MyDate();
		d2.setDay(32); // 32�� �߸��� �Է°��Դϴ�
		System.out.println(d2.getDay()+"��"); //1�� 
	}
}







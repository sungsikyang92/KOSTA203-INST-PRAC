package step0;
/*	Nested Class : ��ø Ŭ���� or Inner class 
 *  Ŭ���� ���� Ŭ������ ���� 
 *  ���� Ŭ������ �����ϴ� ������ Outer class�� 
 *  private member�� ���� ������ ����� �� �ֱ� ������ �ַ� ���� 
 * 
 */
class Outer{
	private String password="abcd";
	public void outTest() {	
		Inner in=new Inner();
		in.innerTest();
	}
	class Inner{
		public void innerTest() {
			//Outer class �� private ������ ���� ������ ����� �� ����
			System.out.println(password);
		}
	}
}
public class TestNestedClass {
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.outTest();
		// Inner class�� �̿��� ��ü �����ϰ� �޼��带 ȣ�� 
		Outer.Inner in=new Outer().new Inner();
		in.innerTest();
	}
}




















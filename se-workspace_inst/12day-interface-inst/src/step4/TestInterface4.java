package step4;
interface A{
	public void a();
	//jdk 1.8�� �߰��� default method 
	// �������̽��� Ȯ�强�� ����ؼ� �����θ� ������ 
	// default �޼��� ������ �߰��ϰ� �Ǿ��� 
	public default void aa(){
		System.out.println("�����θ� ������ default method");
	}
}
// �������̽������� ����� �ȴ� 
interface B extends A{
	public void b();
}
// B�� ������ Test Ŭ������ a()�� b()�� ��� �����ؾ� �Ѵ� 
class Test implements B{
	@Override
	public void a() {}
	@Override
	public void b() {}
	
}
public class TestInterface4 {
	public static void main(String[] args) {
		Test t=new Test();
		t.aa();
	}
}









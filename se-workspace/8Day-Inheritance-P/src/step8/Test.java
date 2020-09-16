package step8;
class A{
	public String a() {
		return 2+2+"A"+1+1;
	}
}
public class Test {
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.a());
	}


}

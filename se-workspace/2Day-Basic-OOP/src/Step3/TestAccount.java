package Step3;
//접근제어자를 테스트하는 예제
public class TestAccount {

	public static void main(String[] args) {
		Account a=new Account();
		//public 이므로 접근가능
		System.out.println(a.name);
		//default 이므로 접근가능 (같은 step3 팩키지이므로)
		System.out.println(a.id);
		//private 이므로 접근불가(다른 클래스이므로)
		//System.out.println(a.password);
	}

}

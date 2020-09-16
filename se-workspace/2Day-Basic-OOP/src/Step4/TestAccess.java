package Step4;
//Import는 다른 팩키지의 자원(클래스)를 이용할 떄 명시한다.
import Step3.Account;

//접근제어자를 테스트하는 예제
public class TestAccess {
	public static void main(String[] args) {
		Account a=new Account();
		//public 이므로 접근가능
		System.out.println(a.name);
		//default 이므로 접근가능(다른 팩키지 이므로)
		//System.out.println(a.id);
		//private 이므로 접근불가(다른 클래스 이므로)
		//System.out.println(a.password);
	}

}

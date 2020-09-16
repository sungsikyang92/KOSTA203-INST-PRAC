package step2;

import org.kosta.Bank; // 다른 패키지의 자원을 사용

class KostaBank extends Bank{
	public void test() {
		publicTest();
		// protected 로 선언된 아래 메서드는 
		// 상속 관계에 있을 때 , 다른 팩키지라도 접근 가능
		protectedTest();		
	}
}
public class TestAccessModifier {
	public static void main(String[] args) {
		// import 단축키 ctrl + shift + o
		Bank bank=new Bank();
		bank.publicTest();
		//bank.protectTest(); // 다른 팩키지이므로 x 
		//bank.defaultTest();
		//bank.privateTest();
	}
}






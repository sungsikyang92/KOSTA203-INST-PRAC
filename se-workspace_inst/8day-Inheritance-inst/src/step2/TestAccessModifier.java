package step2;

import org.kosta.Bank; // �ٸ� ��Ű���� �ڿ��� ���

class KostaBank extends Bank{
	public void test() {
		publicTest();
		// protected �� ����� �Ʒ� �޼���� 
		// ��� ���迡 ���� �� , �ٸ� ��Ű���� ���� ����
		protectedTest();		
	}
}
public class TestAccessModifier {
	public static void main(String[] args) {
		// import ����Ű ctrl + shift + o
		Bank bank=new Bank();
		bank.publicTest();
		//bank.protectTest(); // �ٸ� ��Ű���̹Ƿ� x 
		//bank.defaultTest();
		//bank.privateTest();
	}
}






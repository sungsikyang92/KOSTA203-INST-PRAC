package step1;
/*�޼��忡 ���ϰ��� ������ void�� ����� ����� ����
 * �޼��忡 ����Ÿ���� ��õǰ� ���ϰ��� ���� �� ���Ǵ�
 * ����� Ư¡�� �����ϴ� ����
 */
class ATM{
	int money=100;
	//�Ա��ϴ� �޼��� - ���ϰ��� �ʿ䰡 �����Ƿ� void�� ����
	public void deposit(int money) {
		this.money+=money;
	}
	//����ϴ� �޼��� - ���ϰ��� �ʿ�(���� ����ؾ� �ϴϱ�), money�� type�� int�̹Ƿ�
	//void ��� ���ϰ��� ���� ����Ѵ�.
	public int withdraw(int money) {
		this.money-=money;
		return money;
	}	
}
public class TestATM {
	public static void main(String[] args) {
		ATM atm=new ATM();
		//���� 200�� �Ա��ϴ�
//		//void�̹Ƿ� return value�� �����Ƿ� ��ºҰ� error
//		System.out.println(atm.deposit(200));
//		int d=atm.deposit(200);//void�̹Ƿ� error
		atm.deposit(200);//void �޼���� �����ϰ� ��ȯ���� ����
		//���� ���� ����Ѵ�
		//���ϰ��� �����Ƿ� ��ݾ��� ��ȯ����
		int m=atm.withdraw(100);
		System.out.println("ATM�⿡�� ����� ���׼�:"+m);
		//�Ʒ��� ���� �ٷ� ��ȯ�޾� ��°���
		System.out.println("ATM�⿡�� ����� �ݾ׼�:"+atm.withdraw(20));
	}
}

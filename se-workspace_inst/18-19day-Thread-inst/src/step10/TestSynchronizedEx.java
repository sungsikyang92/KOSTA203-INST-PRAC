package step10;
/**
 * synchronized �ʿ伺�� Ȯ���ϴ� ���� 
 * �ϳ��� �ڿ��� �ټ��� �����尡 ����Ǿ� �ڿ��� �����ϴ� ���
 * �߻��� �� �ִ� �������� Ȯ���ϴ� ���� 
 * @author KOSTA
 */
class Toilet implements Runnable{
	//�� �������� �����ڿ�
	private boolean seat;//�ν��Ͻ� ������ �⺻ �ʱ�ȭ false �Ҵ� 
	@Override
	public void run() {
		try {
			use(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	public void use(String user) throws InterruptedException {
		if(seat==false) {
			Thread.sleep(1000);
			seat=true;
			System.out.println(user+" ����");
			System.out.println(user+" ���");
			Thread.sleep(3000);
			System.out.println(user+" ����");
			seat=false;
		}else {// seat �� true�̸� ȭ����� ����ϴ� �����̹Ƿ� ����Ұ�
			System.out.println(user+"�� ȭ��� ������̹Ƿ� ����Ұ�");
		}
	}
}
public class TestSynchronizedEx {
	public static void main(String[] args) {
		Toilet toilet=new Toilet();
		Thread t1=new Thread(toilet,"������������");
		Thread t2=new Thread(toilet,"����ν�����");
		t1.start();
		t2.start();
	}
}




package step5;
/*	�ϳ��� Ŭ������ �̿��� �ټ��� �����带 �����ؼ� �����ϴ� ���� 
 *  ä�� ������ �����ϰ� ���� ������ �����ϳ� 
 *  ������ �ټ��� Ŭ���̾�Ʈ���� ���ÿ� ���� �ϱ� ���� 
 *  �ټ��� �����带 �����Ͽ� �����ϵ��� �����غ��� 
 * 
 */
// ä�� ���񽺸� �����ϴ� Ŭ���� 
class ServerWorker implements Runnable{
	@Override
	public void run() {
		try {
			service();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
	public void service() throws InterruptedException{
		//���� �������� ������ �̸��� ��ȯ�޴´� 
		String name=Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+"������ ä�ü��� ����"+i);
			Thread.sleep(500);
		}
	}
}
public class TestThread5 {
	public static void main(String[] args) {
		System.out.println("**main thread ����**");
		ServerWorker worker=new ServerWorker();
		//������ ������ �������� name�� �Բ� �Ҵ��Ѵ� 
		Thread t1=new Thread(worker,"�����");
		t1.start();
		//���� ������ �����ϹǷ� ServerWorker �ϳ��� �ټ��� �����带
		//�����ؼ� start ��Ų�� 
		Thread t2=new Thread(worker,"������");
		t2.start();
		Thread t3=new Thread(worker,"������");
		t3.start();
		System.out.println("**main thread ����**");
	}
}










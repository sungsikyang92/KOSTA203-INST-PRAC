package step2;
// step1 ���Ͻ����� ������ �������� ���� ���� 
// step2 TestThread2 �� main �� WorkerThread �� �ΰ��� 
// �����尡 ���۵Ǵ� ���� 
// �����带 ����� ù��° ����� extends Thread�̴� 
class Worker extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Worker ���ϴ� "+i);
	}	
}
public class TestThread2 {
	public static void main(String[] args) {
		System.out.println("**main thread ����**");
		//Worker Thread ���� �� ���� -> run() �޼��� �����Ű�� ����
		//�ƴϰ� start() ��� Thread Ŭ������ �޼��带 
		//�����ؾ� �Ѵ� 
		Worker w=new Worker();
		w.start();// �����带 �����Ű�� ���� �ƴ϶� ���డ�ɻ��·� ������ 
		System.out.println("**main thread ����**");
	}
}


















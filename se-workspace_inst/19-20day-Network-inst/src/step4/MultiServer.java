package step4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  1 �� �� , �� �ټ��� Ŭ���̾�Ʈ���� ���������� �޾Ƹ� �����ϴ� ���� 
 */
public class MultiServer {
	/* ServerSocket ���� 
	 * while loop 
	 * accept() : Socket  �� ���� ���Ӵ�� 
	 * �����ϸ� Socket �� ��ȯ 
	 * ServerWorker Thread�� ������ �� �����ڿ� �ش� Socket�� �Ҵ� 
	 * start() �� �̿��� �ش罺���带 ���డ�ɻ��·� ������ 
	 */
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**step4.MultiServer**");
			while(true) {//�ټ��� Ŭ���̾�Ʈ���� �����ؾ� �ϱ� ������ �ݺ����� �����Ѵ� 
			//Ŭ���̾�Ʈ �����ϸ� ���� , �Ϲݼ���(Ŭ���̾�Ʈ�� ����ϴ� ��ü)�� ��ȯ�Ѵ� 
				Socket socket=serverSocket.accept();
				System.out.println(socket.getInetAddress()+"�� �����߽��ϴ�");
				//���� Ŭ���̾�Ʈ�� ����� ��ü �����ÿ� ������ �Ҵ��Ѵ� 
				ServerWorker serverWorker=new ServerWorker(socket);
				Thread thread=new Thread(serverWorker);
				thread.start();
			}//while
		}finally {
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new MultiServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
















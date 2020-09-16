package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
// step3 �޾Ƹ� ���� ���� 
public class TestServer {
	public void go() throws IOException {
		ServerSocket serverSocket=null;//��ǥ��ȭ
		Socket socket=null;//������ȭ
		BufferedReader br=null;//������ȭ��ȭ�� - �Է�
		PrintWriter pw=null;//������ȭ��ȭ��  - ��� 
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**���� ����-Ŭ���̾�Ʈ ���Ӵ����**");
			socket=serverSocket.accept();//Ŭ���̾�Ʈ�� �����ϸ�( Ŭ���̾�Ʈ ���� �����Ǹ� )
			//���� ��ȭ(�Ϲ� Socket)�� accept() �� �����Ѵ� 
			System.out.println(socket.getInetAddress()+"�� �����߽��ϴ�!");
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);//true autoflush 
			while(true) {
				String message=br.readLine();//Ŭ���̾�Ʈ �޼����� �Է� 
				//trim() �� �翩���� ���� (���� ������ ����)
				if(message==null||message.equals("null")||message.trim().equals("����")) {
					System.out.println("**������ �����մϴ�**");
					break;
				}
				System.out.println("client�κ��� �Է��� �޼���:"+message);
				pw.println(message+"*server*");// autoflush�̹Ƿ� �ٷ� ��� 
			}//while			
		}finally {
			if(socket!=null)
				socket.close();
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new TestServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}










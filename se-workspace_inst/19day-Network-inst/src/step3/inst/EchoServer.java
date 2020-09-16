package step3.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		Socket socket=null;
		BufferedReader br=null;//Ŭ���̾�Ʈ�κ��� �Է¹޴� ��Ʈ�� 
		PrintWriter pw=null;//Ŭ���̾�Ʈ�� ����ϴ� ��Ʈ�� 
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**EchoServer ������**");
			//����ϴٰ� Ŭ���̾�Ʈ �����ϸ� ����, Socket�� ��ȯ
			socket=serverSocket.accept();
			String user=socket.getInetAddress().toString();//������ Ŭ���̾�Ʈ ip�� ��ȯ
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true); //autoflush 
			while(true) {
				String message=br.readLine();//client�κ��� �޼����� �Է� 
				System.out.println(user+"���� �޼���:"+message);
				pw.println(message+"*server*");//client�� �޼����� ��� 
			}
		}finally {
			if(socket!=null)
				socket.close();
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new EchoServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}












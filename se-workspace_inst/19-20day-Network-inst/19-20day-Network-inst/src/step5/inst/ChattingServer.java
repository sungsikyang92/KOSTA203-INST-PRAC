package step5.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChattingServer {
	// ������ Ŭ���̾�Ʈ�� ����� ServerWorker ��ü���� ����� ����Ʈ
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**ä�ü���**");
			while (true) {
				Socket socket = serverSocket.accept();
				ServerWorker serverWorker = new ServerWorker(socket);
				list.add(serverWorker);
				System.out.println(socket.getInetAddress() + "�� �����ϼ̽��ϴ�");
				new Thread(serverWorker).start();
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}
	// ������ ��� Ŭ���̾�Ʈ���� �޼����� ��� 
	public void brocast(String message) {
		for(int i=0;i<list.size();i++) {
			list.get(i).pw.println(message);
		}
	}
	public static void main(String[] args) {
		try {
			new ChattingServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// inner class
	class ServerWorker implements Runnable {
		private Socket socket;
		private BufferedReader br;
		private PrintWriter pw;		
		private String clientIp;
		public ServerWorker(Socket socket) {
			super();
			this.socket = socket;
			clientIp=socket.getInetAddress().toString();
		}
		public void chatting() throws IOException {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);//autoflush
			while(true) {
				String message=br.readLine();//Ŭ���̾�Ʈ �޼����� �Է�
				if(message==null||message.equals("null")||message.equals("����")) {
					break;
				}
				brocast(clientIp+"���� �޼���:"+message);//��� Ŭ���̾�Ʈ���� ��� 
			}//while
		}//chatting
		@Override
		public void run() {
			try {
				chatting();
			} catch (IOException e) {
				System.out.println(clientIp+" �� ���� ���������Ͽ� ����");
			}finally {
				list.remove(this);
				System.out.println(clientIp+" �������ϴ�");
				brocast(clientIp+" �������ϴ�");
				if(socket!=null) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}//if
			}//finally
		}// run
	}// inner class
}// class











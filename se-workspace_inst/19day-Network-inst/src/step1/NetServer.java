package step1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		PrintWriter pw = null;
		try {
			serverSocket = new ServerSocket(5432);// ��ǥ��ȭ
			System.out.println("**��������**");
			while(true) {
			try {
			// Ŭ���̾�Ʈ ���� ����ϴ� �����ϸ� ����, �Ϲݼ����� ��ȯ
			socket = serverSocket.accept();
			//������ Ŭ���̾�Ʈ ������ ��ȯ 
			System.out.println("**"+socket.getInetAddress()+" client ���ӵ�**");
			// Ŭ���̾�Ʈ���� �����͸� �����ϱ� ���� ��彺Ʈ���� ��ȯ
			OutputStream os = socket.getOutputStream();
			pw = new PrintWriter(os);
			pw.println("�氡�氡");
			}finally {
				if (pw != null)
					pw.close();
				if (socket != null)
					socket.close();
			}
			}//while
		} finally {
			
			if (serverSocket != null)
				serverSocket.close();
		}
	}

	public static void main(String[] args) {
		try {
			new NetServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

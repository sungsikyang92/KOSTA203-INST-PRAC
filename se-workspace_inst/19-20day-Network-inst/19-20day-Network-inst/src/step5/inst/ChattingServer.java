package step5.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChattingServer {
	// 접속한 클라이언트와 통신할 ServerWorker 객체들이 저장된 리스트
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**채팅서버**");
			while (true) {
				Socket socket = serverSocket.accept();
				ServerWorker serverWorker = new ServerWorker(socket);
				list.add(serverWorker);
				System.out.println(socket.getInetAddress() + "님 입장하셨습니다");
				new Thread(serverWorker).start();
			}
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}
	}
	// 접속한 모든 클라이언트에게 메세지를 출력 
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
				String message=br.readLine();//클라이언트 메세지를 입력
				if(message==null||message.equals("null")||message.equals("종료")) {
					break;
				}
				brocast(clientIp+"님의 메세지:"+message);//모든 클라이언트에게 출력 
			}//while
		}//chatting
		@Override
		public void run() {
			try {
				chatting();
			} catch (IOException e) {
				System.out.println(clientIp+" 이 분이 강제종료하여 나감");
			}finally {
				list.remove(this);
				System.out.println(clientIp+" 나갔습니다");
				brocast(clientIp+" 나갔습니다");
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











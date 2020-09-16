package step4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  1 대 다 , 즉 다수의 클라이언트에게 지속적으로 메아리 서비스하는 서버 
 */
public class MultiServer {
	/* ServerSocket 생성 
	 * while loop 
	 * accept() : Socket  을 통해 접속대기 
	 * 접속하면 Socket 이 반환 
	 * ServerWorker Thread를 생성할 때 생성자에 해당 Socket을 할당 
	 * start() 를 이용해 해당스레드를 실행가능상태로 보낸다 
	 */
	public void go() throws IOException {
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**step4.MultiServer**");
			while(true) {//다수의 클라이언트에게 서비스해야 하기 때문에 반복문을 수행한다 
			//클라이언트 접속하면 실행 , 일반소켓(클라이언트와 통신하는 객체)을 반환한다 
				Socket socket=serverSocket.accept();
				System.out.println(socket.getInetAddress()+"님 접속했습니다");
				//실제 클라이언트와 통신할 객체 생성시에 소켓을 할당한다 
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
















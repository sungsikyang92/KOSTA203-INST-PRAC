package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 서버는 클라이언트 접속 대기하다가 접속해서 메세지를 전송하면 
 * 그 메세지를 자신의 콘솔에 ip와 함께 출력하고 다시 대기 
 */
public class NetServer {
	public void go() throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("**step2.NetServer서버실행**");
			while (true) {
				Socket socket = null;
				BufferedReader br=null;
				try {
					socket = serverSocket.accept();
					br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
					String info=socket.getInetAddress()+"님의 메세지:"+br.readLine();
					System.out.println(info);
				}catch(Exception e) {
					System.out.println(socket.getInetAddress()+"님 에러주범~~~!!!!");
				}finally {
					if(socket!=null)
						socket.close();
				}//finally
			} // while
		} finally {
			if (serverSocket != null)
				serverSocket.close();
		}//finally
	}//go method

	public static void main(String[] args) {
		try {
			new NetServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

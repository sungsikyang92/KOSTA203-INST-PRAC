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
		BufferedReader br=null;//클라이언트로부터 입력받는 스트림 
		PrintWriter pw=null;//클라이언트에 출력하는 스트림 
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**EchoServer 실행중**");
			//대기하다가 클라이언트 접속하면 실행, Socket을 반환
			socket=serverSocket.accept();
			String user=socket.getInetAddress().toString();//접속한 클라이언트 ip를 반환
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true); //autoflush 
			while(true) {
				String message=br.readLine();//client로부터 메세지를 입력 
				System.out.println(user+"님의 메세지:"+message);
				pw.println(message+"*server*");//client로 메세지를 출력 
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












package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
// step3 메아리 서버 복습 
public class TestServer {
	public void go() throws IOException {
		ServerSocket serverSocket=null;//대표전화
		Socket socket=null;//직원전화
		BufferedReader br=null;//직원전화수화기 - 입력
		PrintWriter pw=null;//직원전화송화기  - 출력 
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**서버 실행-클라이언트 접속대기중**");
			socket=serverSocket.accept();//클라이언트가 접속하면( 클라이언트 소켓 생성되면 )
			//직원 전화(일반 Socket)를 accept() 는 리턴한다 
			System.out.println(socket.getInetAddress()+"님 접속했습니다!");
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw=new PrintWriter(socket.getOutputStream(),true);//true autoflush 
			while(true) {
				String message=br.readLine();//클라이언트 메세지를 입력 
				//trim() 은 양여백을 제거 (양쪽 공란을 제거)
				if(message==null||message.equals("null")||message.trim().equals("종료")) {
					System.out.println("**서버를 종료합니다**");
					break;
				}
				System.out.println("client로부터 입력한 메세지:"+message);
				pw.println(message+"*server*");// autoflush이므로 바로 출력 
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










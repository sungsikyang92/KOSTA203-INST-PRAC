package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

//step3 EchoClient 복습 
public class TestClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket=null;//클라이언트 전화기 
		Scanner scanner=null;//콘솔에서 입력받는 객체 
		PrintWriter pw=null; //서버에 출력할 스트림 
		BufferedReader br=null;//서버에서 입력받는 스트림 
		try {
			socket=new Socket(IP.LOCAL,5432);//소켓이 정상적 생성되면 서버와 접속 
			System.out.println("**클라이언트가 서버에 접속**");
			scanner=new Scanner(System.in);//콘솔창에 입력받기 위한 객체 
			pw=new PrintWriter(socket.getOutputStream(),true);//autoflush : 서버에 출력
			//서버에서 입력 
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) { // 콘솔에서 입력받아 서버에 출력하고 서버에서 입력받아 콘솔에 출력 
				System.out.print("서버에 보낼 메세지:");
				String message=scanner.nextLine();//콘솔에서 입력
				pw.println(message);//서버에 출력 
				if(message==null||message.trim().equals("종료")) {
					System.out.println("**클라이언트 종료**");
					break;
				}
				System.out.println("서버에서 받은 메세지:"+br.readLine());//서버에서 입력 
			}
		}finally {
			if(scanner!=null)
				scanner.close();
			if(socket!=null)
				socket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new TestClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}









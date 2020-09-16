package step3.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class EchoClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket=null; //서버와 통신할 소켓 
		Scanner scanner=null;//콘솔에서 입력받을 객체 
		PrintWriter pw=null;//콘솔에서 입력받은 메세지를 서버에 출력하는 스트림 
		BufferedReader br=null;//서버에서 입력받을 스트림 
		try {
			socket=new Socket(IP.LOCAL,5432);
			System.out.println("**EchoClient가 서버에 접속**");
			scanner=new Scanner(System.in);
			pw=new PrintWriter(socket.getOutputStream(),true);//autoflush
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {// 콘솔에서 입력받아 서버에 출력하고 서버에서 입력받아 콘솔에 출력
				System.out.print("서버에 보낼 메세지:");
				String message=scanner.nextLine();
				pw.println(message);
				String result=br.readLine();
				System.out.println("서버에서 입력받은 메세지:"+result);
			}
		}finally {
			if(scanner!=null)
				scanner.close();
			if(socket!=null)
				socket.close();
		}//finally
	}//go method
	public static void main(String[] args) {
		try {
			new EchoClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}











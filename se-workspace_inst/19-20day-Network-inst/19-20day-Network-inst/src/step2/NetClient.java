package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

/*
 * Ŭ���̾�Ʈ�� ������ �����ؼ� �����͸� �����ϰ� �����Ѵ� 
 * Scanner �����ؼ� �ֿܼ��� ������ ���� �޼����� �Է¹޾� ������ ����Ѵ� 
 */
public class NetClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket=null;
		PrintWriter pw=null;
		Scanner scanner=null;
		try {
			scanner=new Scanner(System.in);
			socket=new Socket(IP.LOCAL,5432);
			pw=new PrintWriter(socket.getOutputStream(),true);//true : autoflush 
			String message=scanner.nextLine();
			pw.println(message);
			System.out.println("**������ �����ؼ� �޼��� ����**"+message);
		}finally {
			if(scanner!=null)
				scanner.close();
			if(pw!=null)
				pw.close();	
			if(socket!=null)
				socket.close();
		}
	}
	public static void main(String[] args) {
		try {
			new NetClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}











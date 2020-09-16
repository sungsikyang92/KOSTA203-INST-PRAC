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
		Socket socket=null; //������ ����� ���� 
		Scanner scanner=null;//�ֿܼ��� �Է¹��� ��ü 
		PrintWriter pw=null;//�ֿܼ��� �Է¹��� �޼����� ������ ����ϴ� ��Ʈ�� 
		BufferedReader br=null;//�������� �Է¹��� ��Ʈ�� 
		try {
			socket=new Socket(IP.LOCAL,5432);
			System.out.println("**EchoClient�� ������ ����**");
			scanner=new Scanner(System.in);
			pw=new PrintWriter(socket.getOutputStream(),true);//autoflush
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) {// �ֿܼ��� �Է¹޾� ������ ����ϰ� �������� �Է¹޾� �ֿܼ� ���
				System.out.print("������ ���� �޼���:");
				String message=scanner.nextLine();
				pw.println(message);
				String result=br.readLine();
				System.out.println("�������� �Է¹��� �޼���:"+result);
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











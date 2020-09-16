package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

//step3 EchoClient ���� 
public class TestClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket=null;//Ŭ���̾�Ʈ ��ȭ�� 
		Scanner scanner=null;//�ֿܼ��� �Է¹޴� ��ü 
		PrintWriter pw=null; //������ ����� ��Ʈ�� 
		BufferedReader br=null;//�������� �Է¹޴� ��Ʈ�� 
		try {
			socket=new Socket(IP.LOCAL,5432);//������ ������ �����Ǹ� ������ ���� 
			System.out.println("**Ŭ���̾�Ʈ�� ������ ����**");
			scanner=new Scanner(System.in);//�ܼ�â�� �Է¹ޱ� ���� ��ü 
			pw=new PrintWriter(socket.getOutputStream(),true);//autoflush : ������ ���
			//�������� �Է� 
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) { // �ֿܼ��� �Է¹޾� ������ ����ϰ� �������� �Է¹޾� �ֿܼ� ��� 
				System.out.print("������ ���� �޼���:");
				String message=scanner.nextLine();//�ֿܼ��� �Է�
				pw.println(message);//������ ��� 
				if(message==null||message.trim().equals("����")) {
					System.out.println("**Ŭ���̾�Ʈ ����**");
					break;
				}
				System.out.println("�������� ���� �޼���:"+br.readLine());//�������� �Է� 
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









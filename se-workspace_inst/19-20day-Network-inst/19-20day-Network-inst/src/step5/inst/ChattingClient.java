package step5.inst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class ChattingClient {
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	private Scanner scanner;
	public void go() throws UnknownHostException, IOException{
		try {
		socket = new Socket(IP.INST,5432);
		br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw=new PrintWriter(socket.getOutputStream(),true);
		scanner=new Scanner(System.in);
		ReceiverWorker worker=new ReceiverWorker();
		Thread thread=new Thread(worker);
		// �� ChattingClient�� ����Ǹ� ReceiverWorker thread�� �Բ� ����
		thread.setDaemon(true);
		thread.start();
		
		while(true) {				
			String message=scanner.nextLine();
			pw.println(message);			
			if(message==null||message.equals("����")) {
				System.out.println("*ä��Ŭ���̾�Ʈ ����*");
				break;
			}					
		}
		}finally {
			closeAll();
		}//finally		
	}//go
	public void closeAll() throws IOException {
		if(scanner!=null)
		scanner.close();
		if(socket!=null)
		socket.close();
	}
	public static void main(String[] args) {
		try {
			new ChattingClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// �������� ���� �޼����� �Է¹޴� ������ 
	class ReceiverWorker implements Runnable{
		@Override
		public void run() {
			try {
				receive();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//run
		public void receive() throws IOException {
			while(true) {				
				String message=br.readLine();				
				if(message==null)
					break;			
				System.out.println(message);					
			}
		}//receive method 
	}//inner class
}//class












package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
/*
 *  ���� Ŭ���̾�Ʈ�� �޼����� �ް� �� ��ü 
 */
public class ServerWorker implements Runnable{
	private Socket socket;
	public ServerWorker(Socket socket) {
		super();
		this.socket = socket;
	}
	@Override
	public void run() {
		try {
			echo();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(socket!=null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}//finally
	}//run
	/*  ������ Ŭ���̾�Ʈ�� ���������� ��� 
	 *  �Է¹޾� �ٽ� ����ϰ� ����޼����� ���� 
	 *   close �۾� ���� �� run() �޼��� ���� -> ������ ���� 
	 */
	public void echo() throws IOException {
		BufferedReader br=
				new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);//autoflush
		String user=socket.getInetAddress().toString();
		while(true) { //�Է� ����� �ݺ��Ѵ� 
			try {
				String message=br.readLine();
				if(message==null||message.equals("null")||message.trim().equals("����")) {
					System.out.println(user+"�� �����̽��ϴ�");
					break;
				}
				System.out.println(user+"�� �޼���:"+message);
				pw.println(message);
			}catch(Exception e) {
				System.out.println(user+"�� �����̽��ϴ�");
				break;
			}//catch			
		}//while
	}//method	
}//class









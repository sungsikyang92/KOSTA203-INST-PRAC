package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class NetClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		BufferedReader br=null;
		try {
			socket = new Socket(IP.INST, 5432);
			System.out.println("**NetClient�� ������ ����**");
			//�����κ��� ������ �Է¹ޱ� ���� ��Ʈ���� �������κ��� �޴´�
			InputStream is=socket.getInputStream();
			//8bit ��Ʈ���� 16bit ���� ��Ʈ������ �����ϴ� ���μ��� ��Ʈ��
			InputStreamReader ir=new InputStreamReader(is);
			//�Ѷ��ξ� �д� ����� �����ϴ� ���μ��� ��Ʈ�� 
			br=new BufferedReader(ir);
			System.out.println("������ ���� �޼���:"+br.readLine());
		} finally {
			if(br!=null)
			br.close();
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

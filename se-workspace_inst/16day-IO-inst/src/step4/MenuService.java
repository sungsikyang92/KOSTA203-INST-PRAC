package step4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuService {

	public void order(String path) throws IOException {//throws 
		Scanner s=new Scanner(System.in);//�ֿܼ� �ԷµǴ� ��Ʈ�� 
		//���Ͽ� ����� ��Ʈ�� 
		PrintWriter pw=new PrintWriter(new FileWriter(path),true);//true : autoflush
		System.out.println("**���ɸ޴�**");
		// �ֹ��� �޼����� �Էµ� ������ ��� �ݺ��Ѵ� 
		while(true) {
		System.out.println("�޴��� �Է��ϼ���");
		String menu=s.nextLine();
		if(menu.equals("�ֹ���"))
			break;
		pw.println(menu);//���Ͽ� ��� 		 
		}
		System.out.println("**�ֹ��Ϸ�**");
		System.out.println(path+"�� �ֹ������ ����Ǿ����ϴ�^^");
		s.close();
		pw.close();
	}
}







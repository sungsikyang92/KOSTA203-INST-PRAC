package step2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestOutput2 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("������");
		list.add("�缺��");
		list.add("�����");
		// C:\\kosta203\\iotest\\friend.txt
		//FileWriter �� PrintWriter�� �̿��ؼ� list�� ����� ���Ͽ� ���
		String path="C:\\kosta203\\iotest\\friend.txt";
		try {
			FileWriter fw=new FileWriter(path,true);
			PrintWriter pw=new PrintWriter(fw);
			for(int i=0;i<list.size();i++) {
				pw.println(list.get(i));
			}
			pw.close();
			System.out.println("����� ���!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}










package step5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput1 {
	public static void main(String[] args) {
		String path=
				"C:"+File.separator+"kosta203"
		+File.separator+"iotest2"+File.separator+"order.txt";
		// ���Ϸκ��� ������ �Է¹޴� ��Ʈ�� ���� 
		try {
			//���Ͽ� ����Ǿ� �Է¹޴� ��彺Ʈ�� 
			FileReader fr=new FileReader(path);
			//������ ������ �Է¹޴� ���μ��� ��Ʈ�� 
			BufferedReader br=new BufferedReader(fr);
			/*
			 * System.out.println(br.readLine()); System.out.println(br.readLine());
			 * System.out.println(br.readLine());//������ null
			 */
			//while �� �̿��ؼ� ������ ���� ������ �ݺ��ϸ� ��� 
			//String str=br.readLine();
			//while(str!=null) {
			//	System.out.println(str);
			//	str=br.readLine();
			//}			
			System.out.println("**************");
			/*
			 * String str2; 
			 * while((str2=br.readLine())!=null) { 
			 * System.out.println(str2); 
			 * }
			 */
			System.out.println("***************");
			while(br.ready()) {
				System.out.println(br.readLine());
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}












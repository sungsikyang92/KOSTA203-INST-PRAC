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
		// 파일로부터 정보를 입력받는 스트림 예제 
		try {
			//파일에 연결되어 입력받는 노드스트림 
			FileReader fr=new FileReader(path);
			//파일의 정보를 입력받는 프로세스 스트림 
			BufferedReader br=new BufferedReader(fr);
			/*
			 * System.out.println(br.readLine()); System.out.println(br.readLine());
			 * System.out.println(br.readLine());//없으면 null
			 */
			//while 문 이용해서 정보가 있을 때까지 반복하며 출력 
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












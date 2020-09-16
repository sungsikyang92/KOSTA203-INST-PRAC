package step2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestOutput2 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("강상훈");
		list.add("양성식");
		list.add("정재우");
		// C:\\kosta203\\iotest\\friend.txt
		//FileWriter 와 PrintWriter를 이용해서 list의 명단을 파일에 기록
		String path="C:\\kosta203\\iotest\\friend.txt";
		try {
			FileWriter fw=new FileWriter(path,true);
			PrintWriter pw=new PrintWriter(fw);
			for(int i=0;i<list.size();i++) {
				pw.println(list.get(i));
			}
			pw.close();
			System.out.println("명단을 출력!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}










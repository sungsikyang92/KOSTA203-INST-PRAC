package step6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class IOService {
	/**
	 * path를 이용해 디렉토리 생성하고 
	 * 파일 생성하여 매개변수 리스트의 정보를 파일에 출력하는 메서드 
	 * @param path
	 * @param list
	 * @throws IOException 
	 */
	public void saveFile(String path, ArrayList<String> list) throws IOException {
		File file=new File(path);
		//상위 디렉토리를 반환받아 생성 
		File dir=file.getParentFile();
		dir.mkdirs();
		PrintWriter pw=new PrintWriter(new FileWriter(path));
		for(int i=0;i<list.size();i++)
			pw.println(list.get(i));
		pw.close();
	}
	/**
	 * path 에 전달된 파일의 내용을 입력받아 ArrayList로 반환하는 메서드
	 * @param path
	 * @return
	 * @throws IOException 
	 */
	public ArrayList<String> readFile(String path) throws IOException {
		ArrayList<String> list=new ArrayList<String>();
		FileReader fr=new FileReader(path);
		BufferedReader br=new BufferedReader(fr);
		while(br.ready())
			list.add(br.readLine());
		br.close();
		return list;
	}

}




















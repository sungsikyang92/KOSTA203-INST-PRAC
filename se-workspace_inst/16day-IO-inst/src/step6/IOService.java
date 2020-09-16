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
	 * path�� �̿��� ���丮 �����ϰ� 
	 * ���� �����Ͽ� �Ű����� ����Ʈ�� ������ ���Ͽ� ����ϴ� �޼��� 
	 * @param path
	 * @param list
	 * @throws IOException 
	 */
	public void saveFile(String path, ArrayList<String> list) throws IOException {
		File file=new File(path);
		//���� ���丮�� ��ȯ�޾� ���� 
		File dir=file.getParentFile();
		dir.mkdirs();
		PrintWriter pw=new PrintWriter(new FileWriter(path));
		for(int i=0;i<list.size();i++)
			pw.println(list.get(i));
		pw.close();
	}
	/**
	 * path �� ���޵� ������ ������ �Է¹޾� ArrayList�� ��ȯ�ϴ� �޼���
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




















package step7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyAndPasteService {
	public void execute(String copyPath, String pastePath) throws IOException {
		new File(pastePath).getParentFile().mkdirs();
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader(copyPath));
			pw = new PrintWriter(new FileWriter(pastePath));
			while (br.ready())
				pw.println(br.readLine());
		} finally { //���� �߻��ÿ��� �ݵ�� ��Ʈ���� �ݾ��ش� 
			if(br!=null)
			br.close();
			if(pw!=null)
			pw.close();
		}
	}
}





package step6;

import java.io.IOException;
import java.util.ArrayList;

public class TestIOService {
	public static void main(String[] args) {
		String path="C:\\kosta203\\iotest3\\test.txt";
		IOService service=new IOService();
		ArrayList<String> list=new ArrayList<String>();
		list.add("�밡��"); list.add("��ġ"); list.add("����");
		//try
		try {
			service.saveFile(path,list);
			System.out.println(path+"���Ͽ� ����Ʈ ����");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}











package step7;

import java.io.IOException;

public class TestCopyAndPasteService {
	public static void main(String[] args) {
		String copyPath="C:\\kosta203\\iotest3\\test.txt";
		String pastePath="C:\\kosta203\\iotest4\\���纻-test.txt";
		CopyAndPasteService service=new CopyAndPasteService();
		try {
			service.execute(copyPath,pastePath);
			System.out.println("���ٿϷ�!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package step8;

import java.io.IOException;

public class TestImageService {
	public static void main(String[] args) {
		String copyPath="C:\\kosta203\\iotest4\\iu.jpg";
		String pastePath="C:\\kosta203\\iotest3\\복사본-iu.jpg";
		ImageService service=new ImageService();
		try {
			service.copyAndPasteImage(copyPath,pastePath);
			System.out.println("이미지복붙완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}







package step3;

import java.io.FileNotFoundException;
import java.io.FileReader;
class MemoService{
	public String readMemo(String filePath) throws FileNotFoundException{
		try {
			FileReader fr=new FileReader(filePath);
			System.out.println("�����ϴ� �����̹Ƿ� �Է��۾�����");
		}finally {
			System.out.println("finally");//���� �߻� ���� �� ó���� ������� �׻� ����
		}
		return filePath+"���� ������";
	}
}
public class TestThrows1 {
	public static void main(String[] args) {
		MemoService service=new MemoService();
		String filePath="C://kosta203//a.txt"; //�����ϴ� ���� - �������
		filePath="C://kosta203//b.txt"; //�������� �ʴ� ����
		try {
			System.out.println(service.readMemo(filePath));
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}

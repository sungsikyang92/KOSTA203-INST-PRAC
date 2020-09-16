package step1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Person;

public class TestObjectOutput {
	public static void main(String[] args) {
		String savePath="C:\\kosta203\\iotest\\person.obj";
		try {
			//��彺Ʈ�� : ��ġ�� ����, FileOutputStream�� ���Ͽ� ����Ǵ� ��彺Ʈ��
			FileOutputStream fos=new FileOutputStream(savePath);
			//���μ�����Ʈ�� : ����� ���� , ObjectOutputStream�� ��ü ����ȭ�� ����
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Person p=new Person("������","�Ǳ�","javaking");
			oos.writeObject(p);
			System.out.println("**��ü ����ȭ�Ͽ� ���Ͽ� Person ��ü����**");
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}











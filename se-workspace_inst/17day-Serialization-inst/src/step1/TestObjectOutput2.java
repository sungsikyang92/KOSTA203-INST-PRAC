package step1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Person2;

public class TestObjectOutput2 {
	public static void main(String[] args) {
		String savePath="C:\\kosta203\\iotest\\person2.obj";
		try {
			FileOutputStream fos=new FileOutputStream(savePath);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Person2 p=new Person2("������","�Ǳ�","javaking");
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











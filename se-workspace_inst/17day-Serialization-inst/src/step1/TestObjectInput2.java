package step1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.Person2;

public class TestObjectInput2 {
	public static void main(String[] args) {
		String savePath="C:\\kosta203\\iotest\\person2.obj";
		try {
			FileInputStream fis=new FileInputStream(savePath);
			ObjectInputStream ois=new ObjectInputStream(fis);
			//Object Ÿ������ ��ȯ�ǹǷ� ��ü ĳ������ �̿��ؼ� ������ Ȯ�� 
			Person2 p=(Person2)ois.readObject();
			System.out.println(p.getName());
			System.out.println(p.getAddress());
			//password�� transient modifier �� �����Ǿ� �־� ����ȭ ��󿡼�
			//���ܵǾ����Ƿ� null �� ��ȯ�ȴ� 
			System.out.println(p.getPassword());
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}









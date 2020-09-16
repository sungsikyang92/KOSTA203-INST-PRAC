package step1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.Person;

public class TestObjectInput {
	public static void main(String[] args) {
		String savePath="C:\\kosta203\\iotest\\person.obj";
		try {
			//NodeStream�迭 : FileInputStream �� file�� ���� 
			FileInputStream fis=new FileInputStream(savePath);
			//ProcessingStream �迭 : ObjectInputStream �� ��ü ������ȭ�� ���� 
			ObjectInputStream ois=new ObjectInputStream(fis);
			//Object Ÿ������ ��ȯ�ǹǷ� ��ü ĳ������ �̿��ؼ� ������ Ȯ�� 
			Person p=(Person)ois.readObject();
			System.out.println(p.getName());
			System.out.println(p.getAddress());
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









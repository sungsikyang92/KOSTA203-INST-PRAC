package step2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import model.Product;

public class TestObjectInputList {
	public static void main(String[] args) {
		String savePath="C:\\kosta203\\iotest\\productList.obj";
		// FileInputStream �� ObjectInputStream readObject()�� 
		// �̿��ؼ� ArrayList ��ȯ�ް� ��Ҹ� ����غ��� 
		try {
			FileInputStream fis=new FileInputStream(savePath);
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked") //üũ���� ���� ���꿡 ���� ��� ����
			ArrayList<Product> list=(ArrayList<Product>) ois.readObject();
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));
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









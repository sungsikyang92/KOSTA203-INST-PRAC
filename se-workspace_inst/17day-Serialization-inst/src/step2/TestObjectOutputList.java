package step2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Product;

public class TestObjectOutputList {
	public static void main(String[] args) {
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(new Product("a","���̽�","����"));
		list.add(new Product("b","ī��","����"));
		list.add(new Product("c","ó��ó��","�Ե�"));
		String savePath="C:\\kosta203\\iotest\\productList.obj";
		// FileOutputStream , ObjectOutputStream writeObject()�� 
		// �̿��� list�� ����ȭ�Ͽ� �� savePath�� ���Ϸ� ����  
		try {
			FileOutputStream fos=new FileOutputStream(savePath);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(list);
			System.out.println("list�� ���Ͽ� ����");
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}












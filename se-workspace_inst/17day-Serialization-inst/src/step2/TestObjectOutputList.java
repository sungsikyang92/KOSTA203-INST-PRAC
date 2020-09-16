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
		list.add(new Product("a","참이슬","진로"));
		list.add(new Product("b","카스","진로"));
		list.add(new Product("c","처음처럼","롯데"));
		String savePath="C:\\kosta203\\iotest\\productList.obj";
		// FileOutputStream , ObjectOutputStream writeObject()을 
		// 이용해 list를 직렬화하여 위 savePath에 파일로 저장  
		try {
			FileOutputStream fos=new FileOutputStream(savePath);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(list);
			System.out.println("list를 파일에 저장");
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}












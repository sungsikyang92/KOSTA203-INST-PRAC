package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.MemberVO;

public class TestObjectSerial {
	public static void main(String[] args) {
		String filePath="C:\\kosta203\\test.obj";		
		try {
			//객체 직렬화
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filePath));
			MemberVO vo=new MemberVO("아이유","판교");
			oos.writeObject(vo);
			//객체 역직렬화 
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filePath));
			MemberVO vo2=(MemberVO)ois.readObject();
			System.out.println(vo2);
			oos.close();
			ois.close();
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		}		
	}
}










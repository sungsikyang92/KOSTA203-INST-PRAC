package step3;

import java.io.FileReader;
import java.util.Scanner;

// ����� ���� Exception ����� 
class AgeException extends Exception{
	AgeException(){
		super("���������� ������ �ֽ��ϴ�!");
	}
	AgeException(String message){
		super(message);
	}
}
class MovieService{
	// age ������ 1�̸��� ���� AgeException�� �߻���Ű��
	// ȣ���� ������ AgeException�� ������(�����Ѵ�)
	public String enter(int age) throws AgeException {
		if(age<1)
			throw new AgeException();
		System.out.println("���̰� �������̹Ƿ� ��ȭ���� ����");
		return "��ȭ";
	}
	public String enterAdultMovie(int age) throws AgeException {
		if(age<1)
			throw new AgeException();//Exception �߻� 
		if(age<20)
			throw new AgeException("�̼������̹Ƿ� �����Ұ�!");
		System.out.println("���ο�ȭ����");
		return "���ο�ȭ";
	}
	
}
public class TestThrows2 {
	public static void main(String[] args) {
		MovieService service=new MovieService();
		/*
		 * try { System.out.println(service.enter(age)); } catch (AgeException e) {
		 * System.out.println(e.getMessage()); }
		 */
		Scanner s=new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���:");
		int age=s.nextInt();
		try {  
			service.enterAdultMovie(age);
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷� �������");
	}
}







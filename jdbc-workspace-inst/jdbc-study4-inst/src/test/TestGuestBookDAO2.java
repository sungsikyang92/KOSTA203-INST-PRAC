package test;

import model.GuestBookDAO;
import model.GuestBookDTO;

public class TestGuestBookDAO2 {
	public static void main(String[] args) {
		try {			
			GuestBookDAO dao = new GuestBookDAO();
			//�Ʒ� �޼���� ���ܹ߻� 
			//System.out.println(dao.getCurrentSequence());
			GuestBookDTO dto=new GuestBookDTO("�������ð�","Į��!!");
			dao.register2(dto);
			System.out.println(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}










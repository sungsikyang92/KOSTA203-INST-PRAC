package test;

import java.util.ArrayList;

import model.GuestBookDAO;
import model.GuestBookDTO;

public class TestGuestBookDAO {
	public static void main(String[] args) {
		try {
			GuestBookDTO dto = new GuestBookDTO("�׽�Ʈ", "��ĥ �ð��� �ٰ��Խ��ϴ�!");
			GuestBookDAO dao = new GuestBookDAO();
			dao.register(dto);
			System.out.println(dto + " ��ϿϷ�!");
			// �ֱټ� (��������)

			ArrayList<GuestBookDTO> list = dao.getAllGuestBookListOrderByNoDesc();
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

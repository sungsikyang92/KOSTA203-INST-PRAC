package test;

import java.sql.SQLException;

import model.MemberDAO;
import model.MemberVO;

//MemberDAO�� findMemberByID(id)�� �����غ��� ����
//primary key�� id�� �̿��� MEMBER TABLE�� ȸ�������� �����ϴ� ID�� ���յǸ�
//MemberVO ��ü�� ��ȯ�ް� ID�� �ش��ϴ� ȸ���� ������ null�� ��ȯ�޴� ����
public class TestMemberDAO {
	public static void main(String[] args) {
		MemberDAO dao;
		try {
			dao = new MemberDAO();
			String id = "java";
			MemberVO vo = dao.findMemberById(id);
			if (vo == null) {
				System.out.println(id + "���̵� �ش��ϴ� ȸ�������� �����ϴ�.");
			} else {
				System.out.println("�˻����: " + vo);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}

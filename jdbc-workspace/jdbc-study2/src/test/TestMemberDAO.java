package test;

import java.sql.SQLException;

import model.MemberDAO;
import model.MemberVO;

//MemberDAO의 findMemberByID(id)를 구현해보는 예제
//primary key인 id를 이용해 MEMBER TABLE의 회원정보가 전달하는 ID에 부합되면
//MemberVO 객체를 반환받고 ID에 해당하는 회원이 없으면 null을 반환받는 예제
public class TestMemberDAO {
	public static void main(String[] args) {
		MemberDAO dao;
		try {
			dao = new MemberDAO();
			String id = "java";
			MemberVO vo = dao.findMemberById(id);
			if (vo == null) {
				System.out.println(id + "아이디에 해당하는 회원정보가 없습니다.");
			} else {
				System.out.println("검색결과: " + vo);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}

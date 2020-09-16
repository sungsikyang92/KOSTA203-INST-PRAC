package test;

import java.util.ArrayList;

import model.MemberDAO;
import model.MemberVO;
/*  MemberDAO 의 getAllMemberList() 를 구현하는 예제 
 *  MEMBER TABLE에 있는 모든 회원 정보를  ArrayList<MemberVO> 타입의 list로 
 *  정보를 반환받아 보는 연습 
 */
public class TestMemberDAO2 {
	public static void main(String[] args) {
		try {
			MemberDAO dao=new MemberDAO();
			ArrayList<MemberVO> list=dao.getAllMemberList();
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}//class








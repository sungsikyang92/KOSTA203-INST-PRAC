package test;

import java.util.ArrayList;

import model.MemberDAO;
import model.MemberVO;
/*  MemberDAO �� getAllMemberList() �� �����ϴ� ���� 
 *  MEMBER TABLE�� �ִ� ��� ȸ�� ������  ArrayList<MemberVO> Ÿ���� list�� 
 *  ������ ��ȯ�޾� ���� ���� 
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








package test;

import model.MovieDAO;
import model.MovieVO;

public class TestMovieDAO {
	public static void main(String[] args) {
		try {
			MovieDAO dao=new MovieDAO();
			MovieVO vo=new MovieVO();
			vo.setTitle("���ͽ��ڶ�");
			vo.setAttendance(100);
			dao.register(vo);
			System.out.println("��ȭ�������ok "+vo);//�߱޵� id���� ��� ���
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}











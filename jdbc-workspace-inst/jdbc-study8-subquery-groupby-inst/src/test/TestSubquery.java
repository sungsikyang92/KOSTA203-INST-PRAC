package test;

import java.util.ArrayList;

import model.EmployeeDAO;
import model.EmployeeVO;

public class TestSubquery {
	public static void main(String[] args) {
		try {
		EmployeeDAO dao=new EmployeeDAO();
		/*	
		 *  �ѹ� �μ��� ����� �� ���� ���� ������ �޴� ��� ������ ��ȸ 
		 */
		ArrayList<EmployeeVO> list=dao.getEmpByLowSal("�ѹ�");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}











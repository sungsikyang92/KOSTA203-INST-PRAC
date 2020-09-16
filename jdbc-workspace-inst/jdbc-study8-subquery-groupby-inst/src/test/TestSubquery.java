package test;

import java.util.ArrayList;

import model.EmployeeDAO;
import model.EmployeeVO;

public class TestSubquery {
	public static void main(String[] args) {
		try {
		EmployeeDAO dao=new EmployeeDAO();
		/*	
		 *  총무 부서인 사원들 중 가장 낮은 월급을 받는 사원 정보를 조회 
		 */
		ArrayList<EmployeeVO> list=dao.getEmpByLowSal("총무");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}











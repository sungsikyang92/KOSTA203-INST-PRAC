package test;

import java.sql.SQLException;

import model.Employee;
import model.EmployeeDAO;

public class TestJoin {
	public static void main(String[] args) {
		EmployeeDAO dao;
		try {
			dao = new EmployeeDAO();
		
		/*  k_employee 와 department 테이블을 조인(결합)해서 
		 *  1번 사원번호를 가진 사원의 사원정보와 부서정보를 조회하고자 한다 
		 *  ( 이 형태는 빈번하게 사용되고, 때로는 사원정보만 조회해서 화면 제공하고
		 *     때로는 부서정보만 조회해서 화면 제공되기도 한다 ) 
		 *  -> UML ( Class Diagram ) 을 정의해보자 
		 * 
		 */
		String empno="1";
		// empno 에 해당하는 ename,sal,deptno,dname,loc,tel 을 조회하여 출력 
		Employee e=dao.findEmpAndDeptInfo(empno); // join sql 실행해서 결과를 반환 
		System.out.println("사원번호:"+empno);
		System.out.println("사원명:"+e.getEname());
		System.out.println("사원월급:"+e.getSal());
		System.out.println("부서번호:"+e.getDepartment().getDeptno());
		System.out.println("부서명:"+e.getDepartment().getDname());
		System.out.println("지역:"+e.getDepartment().getLoc());
		System.out.println("부서전화번호:"+e.getDepartment().getTel());
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
}












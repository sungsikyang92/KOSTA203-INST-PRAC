package test;

import java.sql.SQLException;

import model.Employee;
import model.EmployeeDAO;

public class TestJoin {
	public static void main(String[] args) {
		EmployeeDAO dao;
		try {
			dao = new EmployeeDAO();
		
		/*  k_employee �� department ���̺��� ����(����)�ؼ� 
		 *  1�� �����ȣ�� ���� ����� ��������� �μ������� ��ȸ�ϰ��� �Ѵ� 
		 *  ( �� ���´� ����ϰ� ���ǰ�, ���δ� ��������� ��ȸ�ؼ� ȭ�� �����ϰ�
		 *     ���δ� �μ������� ��ȸ�ؼ� ȭ�� �����Ǳ⵵ �Ѵ� ) 
		 *  -> UML ( Class Diagram ) �� �����غ��� 
		 * 
		 */
		String empno="1";
		// empno �� �ش��ϴ� ename,sal,deptno,dname,loc,tel �� ��ȸ�Ͽ� ��� 
		Employee e=dao.findEmpAndDeptInfo(empno); // join sql �����ؼ� ����� ��ȯ 
		System.out.println("�����ȣ:"+empno);
		System.out.println("�����:"+e.getEname());
		System.out.println("�������:"+e.getSal());
		System.out.println("�μ���ȣ:"+e.getDepartment().getDeptno());
		System.out.println("�μ���:"+e.getDepartment().getDname());
		System.out.println("����:"+e.getDepartment().getLoc());
		System.out.println("�μ���ȭ��ȣ:"+e.getDepartment().getTel());
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
}












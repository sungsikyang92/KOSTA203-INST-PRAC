package test;

import java.util.ArrayList;

import model.Employee;
import model.EmployeeDAO;

public class TestJoin2 {
	public static void main(String[] args) {		
		try {
			EmployeeDAO dao = new EmployeeDAO();				
			ArrayList<Employee> list=dao.getEmpAndDeptInfoList();  		
			for(int i=0;i<list.size();i++)
				System.out.println(list.get(i));//����� ����� ���� �μ� ������ ��� 
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
}












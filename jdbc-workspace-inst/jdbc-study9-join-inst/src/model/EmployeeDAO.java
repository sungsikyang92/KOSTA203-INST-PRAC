package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.DbInfo;

public class EmployeeDAO {
	public EmployeeDAO() throws ClassNotFoundException {
		Class.forName(DbInfo.DRIVER_NAME);
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public Employee findEmpAndDeptInfo(String empno) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Employee employee=null;
		try { 
			con=DriverManager.getConnection(DbInfo.URL,DbInfo.USER, DbInfo.PASS);
			StringBuilder sql=new StringBuilder();
			sql.append("SELECT e.ename,e.sal,d.deptno,d.dname,d.loc,d.tel ");
			sql.append("FROM k_employee e,department d ");
			sql.append("WHERE e.deptno=d.deptno AND e.empno=?");
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setString(1, empno);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				Department department=new Department();
				department.setDeptno(rs.getString("deptno"));
				department.setDname(rs.getString("dname"));
				department.setLoc(rs.getString("loc"));
				department.setTel(rs.getString("tel"));
				employee=new Employee(empno, rs.getString("ename"), rs.getInt("sal"), department);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return employee;
	}
	public ArrayList<Employee> getEmpAndDeptInfoList() throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<Employee> list=new ArrayList<Employee>();
		try { 
			con=DriverManager.getConnection(DbInfo.URL,DbInfo.USER, DbInfo.PASS);
			StringBuilder sql=new StringBuilder();
			sql.append("SELECT e.empno,e.ename,e.sal,d.deptno,d.dname,d.loc,d.tel ");
			sql.append("FROM k_employee e,department d ");
			sql.append("WHERE e.deptno=d.deptno");
			pstmt=con.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Department department=new Department();
				department.setDeptno(rs.getString("deptno"));
				department.setDname(rs.getString("dname"));
				department.setLoc(rs.getString("loc"));
				department.setTel(rs.getString("tel"));
				Employee employee=new Employee(rs.getString("empno"), rs.getString("ename"), rs.getInt("sal"), department);
				list.add(employee);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}

}

















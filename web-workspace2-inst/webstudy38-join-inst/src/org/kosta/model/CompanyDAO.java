package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class CompanyDAO {
	private static CompanyDAO instance=new CompanyDAO();
	private DataSource dataSource;
	private CompanyDAO() {
		dataSource=DataSourceManager.getInstance().getDataSource();
	}
	public static CompanyDAO getInstance() {
		return instance;
	}
	public void closeAll(PreparedStatement pstmt,Connection con) throws SQLException {
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		closeAll(pstmt, con);
	}
	public ArrayList<EmployeeVO> getAllEmployeeList() throws SQLException{
		ArrayList<EmployeeVO> list=new ArrayList<EmployeeVO>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=dataSource.getConnection();
			StringBuilder sql=new StringBuilder();
			sql.append("select e.empno,e.ename,e.sal,d.deptno,d.dname,d.loc,d.tel ");
			sql.append("from mvc_employee e, mvc_department d ");
			sql.append("where e.deptno=d.deptno order by e.empno desc");
			pstmt=con.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				EmployeeVO emp=new EmployeeVO();
				emp.setEmpno(rs.getString(1));
				emp.setEname(rs.getString(2));
				emp.setSal(rs.getInt(3));
				DeptVO dept=new DeptVO();
				dept.setDeptno(rs.getString(4));
				dept.setDname(rs.getString(5));
				dept.setLoc(rs.getString(6));
				dept.setTel(rs.getString(7));
				emp.setDeptVO(dept);
				list.add(emp);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}





















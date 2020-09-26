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
	public ArrayList<EmployeeVO> employeeList() throws SQLException {
		ArrayList<EmployeeVO> list=new ArrayList<EmployeeVO>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=dataSource.getConnection();
			StringBuilder sql=new StringBuilder();
			sql.append("");
			sql.append("");
			sql.append("");
		}finally {
			closeAll(rs,pstmt,con);
		}
		return list;
	}
}





















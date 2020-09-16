package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

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
	public ArrayList<EmployeeVO> getEmpByLowSal(String job) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<EmployeeVO> list=new ArrayList<EmployeeVO>();
		try {
			con=DriverManager.getConnection(DbInfo.URL, DbInfo.USER, DbInfo.PASS);
			StringBuilder sql=new StringBuilder();
			sql.append("select empno,name,job,salary ");
			sql.append("from employee where salary= ");
			sql.append("(select min(salary) from employee where job=?)");
			pstmt=con.prepareStatement(sql.toString());			
			pstmt.setString(1, job);
			rs=pstmt.executeQuery();
			while(rs.next())
				list.add(new EmployeeVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	public ArrayList<HashMap<String, Object>> getJobGroupInfoGroupByJob() 
			throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<HashMap<String, Object>> list=
				new ArrayList<HashMap<String, Object>>();
		try {
			con=DriverManager.getConnection(DbInfo.URL, DbInfo.USER, DbInfo.PASS);
			StringBuilder sql=new StringBuilder();
			sql.append("SELECT job, MAX(salary) as highsal ");
			sql.append("FROM employee ");
			sql.append("GROUP BY job ");
			sql.append("ORDER BY highsal DESC");
			pstmt=con.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				// 결과의 한 행(row)에 대한 정보를 VO 대신 Map으로 담는다 
				HashMap<String,Object> map=new HashMap<String,Object>();
				map.put("job", rs.getString(1));
				map.put("highsal", rs.getInt(2));
				list.add(map);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	public ArrayList<String> getJobKind() throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<String> list=new ArrayList<String>();
		try {
			con=DriverManager.getConnection(DbInfo.URL,DbInfo.USER,DbInfo.PASS);
			String sql="SELECT DISTINCT(job) FROM employee";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				list.add(rs.getString(1));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}






















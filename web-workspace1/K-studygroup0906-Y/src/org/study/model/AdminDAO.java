package org.study.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username="scott";
	private String userpass="tiger";
	private static AdminDAO instance=new AdminDAO();
	private AdminDAO() {
		try {
			Class.forName(driver);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static AdminDAO getInstance() {
		return instance;
	}
	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		closeAll(pstmt,con);
	}
	public AdminVO adminLogin(AdminVO adminvo) throws SQLException {
		AdminVO avo=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql="SELECT name, department FROM study_admin WHERE id=? and password=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, adminvo.getId());
			pstmt.setString(2, adminvo.getPassword());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				avo=new AdminVO(adminvo.getId(),adminvo.getPassword(),rs.getString(1),rs.getString(2));
			}
		}finally {
			closeAll(rs,pstmt,con);
		}
		
		return avo;
	}
}

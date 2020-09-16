package org.kosta.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username="scott";
	private String userpass="tiger";
	private static MemberDAO instance=new MemberDAO();
	private MemberDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static MemberDAO getInstance() {
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
		closeAll(pstmt,con);
	}
	public MemberVO findMemberById(String id) throws SQLException {
		MemberVO vo=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql="SELECT name,address FROM web_member WHERE id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				vo=new MemberVO(id,null,rs.getString(1),rs.getString(2));
			}
		}finally {
			closeAll(rs,pstmt,con);
		}
		return vo;
	}
	public MemberVO login(MemberVO vo) throws SQLException {
		MemberVO mvo=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql="SELECT id,password,name,address FROM web_member WHERE id=? and password=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPassword());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				mvo=new MemberVO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
		}finally {
			closeAll(rs,pstmt,con);
		}
		return vo;
	}
}

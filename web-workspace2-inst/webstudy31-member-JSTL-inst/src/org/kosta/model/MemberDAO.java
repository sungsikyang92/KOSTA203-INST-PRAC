package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class MemberDAO {
	private static MemberDAO instance=new MemberDAO();
	private DataSource dataSource;//DBCP
	private MemberDAO() {
		this.dataSource=DataSourceManager.getInstance().getDataSource();
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
		closeAll(pstmt, con);
	}
	public MemberVO findMemberById(String id) throws SQLException {
		MemberVO vo=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=dataSource.getConnection();
			String sql="select name,address from web_member where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next())
				vo=new MemberVO(id,null,rs.getString(1),rs.getString(2));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
	public ArrayList<String> getAddressKind() throws SQLException{
		ArrayList<String> list=new ArrayList<String>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=dataSource.getConnection();
			String sql="select distinct(address) from web_member";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next())
				list.add(rs.getString(1));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}

























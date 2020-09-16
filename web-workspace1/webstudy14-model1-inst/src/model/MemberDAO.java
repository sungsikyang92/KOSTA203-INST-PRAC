package model;

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
	public MemberDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public int getAllMemberCount() throws SQLException {
		int count=0;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql="select count(*) from web_member";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next())
				count=rs.getInt(1);
		}finally {
			closeAll(rs, pstmt, con);
		}
		return count;
	}
	public MemberVO findMemberById(String id) throws SQLException {
		MemberVO memberVO=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url, username, userpass);
			String sql="select name,address from web_member where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next())
				memberVO=new MemberVO(id,null,rs.getString(1),rs.getString(2));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return memberVO;
	}
}













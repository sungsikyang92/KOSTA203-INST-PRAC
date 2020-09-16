package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 *  DAO : Data Access Object 
 *  �����ͺ��̽� ���� ������ ������ �ִ� ��ü 
 */
public class MemberDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String dbUrl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user="scott";
	private String pass="tiger";
	public MemberDAO() throws ClassNotFoundException {//throws�� ����ó���� �����Ѵ� 
		Class.forName(driver);
	}
	/*	1. Connection
	 *  2. Sql ���� 
	 *  3. PreparedStatement : setString(1,id)
	 *  4. Sql ���� : executeQuery()
	 *  5. ResultSet  if(rs.next()) : id�� primary key�̹Ƿ�  if ���� ���� 
	 *  6. getString(1) ........   -> MemberVO ��ü ���� 
	 *  7. return vo
	 */
	public MemberVO findMemberById(String id) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		MemberVO vo=null;
		try {
			con=DriverManager.getConnection(dbUrl, user, pass);
			String sql
			="SELECT PASSWORD,NAME,ADDRESS FROM MEMBER WHERE ID=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				vo=new MemberVO(id,rs.getString(1),rs.getString(2),rs.getString(3));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}	
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public ArrayList<MemberVO> getAllMemberList() throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<MemberVO> list=new ArrayList<MemberVO>();
		try {
			con=DriverManager.getConnection(dbUrl,user,pass);
			String sql="SELECT ID,PASSWORD,NAME,ADDRESS FROM MEMBER";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				list.add(
					new MemberVO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}







































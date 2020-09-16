package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "scott";
	private String pass = "tiger";
	
	public MovieDAO() throws ClassNotFoundException {
		Class.forName(driver);
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
	/*	Connection 
	 *  String sql : insert 구문  시퀀스명.nextval 
	 *  PreparedStatement 
	 *  SQL 실행 -> executeUpdate() 
	 *  pstmt.close() 
	 *  sql : select  시퀀스명.currval 
	 *  PreparedStatement 
	 *  SQL 실행 -> executeQuery() 
	 *  ResultSet -> vo.setId() 
	 *  closeAll() 
	 */
	public void register(MovieVO vo) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(dbUrl, user, pass);
			StringBuilder sql=new StringBuilder();
			sql.append("INSERT INTO movie(id,title,attendance) ");		
			sql.append(" VALUES(movie_seq.nextval,?,?)");
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setInt(2, vo.getAttendance());
			pstmt.executeUpdate();
			pstmt.close();
			// 발급된 영화아이디(시퀀스값)을 할당받기 위해 SQL을 한번 더 실행한다 
			sql=new StringBuilder();
			sql.append("SELECT movie_seq.currval FROM DUAL");
			pstmt=con.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			if(rs.next())
				vo.setId(rs.getInt(1));
		}finally {
			closeAll(rs, pstmt, con);
		}//finally		
	}//register
}















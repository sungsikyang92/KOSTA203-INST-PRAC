package step4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 *  DML - DELETE  , address 가 워싱턴 인 회원정보를 모두 삭제 
 */
public class TestJDBC4 {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String dbUrl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(dbUrl, "scott", "tiger");
			String address="워싱턴";
			String sql="DELETE FROM member WHERE address=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, address);
			//executeUpdate() : 영향을 준 row 수 
			int result=pstmt.executeUpdate();
			// result 는 삭제한 row 행의 수를 반환 
			System.out.println("delete ok  삭제한 회원수:"+result);
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}










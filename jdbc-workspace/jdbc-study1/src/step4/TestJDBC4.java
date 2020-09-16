package step4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//DML - DELETE, address가 '워싱턴'인 회원정보를 모두 삭제한다.
public class TestJDBC4 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(dbUrl,"scott","tiger");
			String address="워싱턴";
			String sql="DELETE FROM member WHERE address=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, address);
			int result=pstmt.executeUpdate();
			System.out.println("delete ok, 삭제한 회원수: "+result);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

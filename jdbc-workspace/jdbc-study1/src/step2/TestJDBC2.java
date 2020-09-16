package step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBC2 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(dbUrl,"scott","tiger");
			String address="©Ж╫лео";
			String sql="SELECT ID, NAME FROM MEMBER WHERE ADDRESS=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, address);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("ID")+" "+rs.getString("name"));
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

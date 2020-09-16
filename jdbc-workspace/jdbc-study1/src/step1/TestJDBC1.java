package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Oracle DB�� �����ϴ� �ڹ� ���ø����̼� �׽�Ʈ
 * SELECT ������ ������ ����� ��ȸ�Ͽ� ����ϴ� ����
 * 
 * JDBC ���α׷��� ���� �ܰ�
 * 1. �����ͺ��̽� ������ ���� jdbc driver loading
 * 2. Connection
 * 3. SQL ���� �� PreparedStatement
 * 4. SQL ���� executeQuery()
 * 5. ResultSet:	next():boolean, getString() or getInt()
 * 6. close
 */
public class TestJDBC1 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver);
			System.out.println("oracle driver loading ok!");
			Connection con = DriverManager.getConnection(dbUrl, "scott", "tiger");
			System.out.println("db connect ok!" + con);
			String sql = "SELECT ID, PASSWORD, NAME, ADDRESS FROM MEMBER";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString(1);
				String password = rs.getString(2);
				String name = rs.getString(3);
				String address = rs.getString(4);
				System.out.println(id + " " + password + " " + name + " " + address);
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

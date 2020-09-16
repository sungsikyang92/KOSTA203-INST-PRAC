package step4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 *  DML - DELETE  , address �� ������ �� ȸ�������� ��� ���� 
 */
public class TestJDBC4 {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String dbUrl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(dbUrl, "scott", "tiger");
			String address="������";
			String sql="DELETE FROM member WHERE address=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, address);
			//executeUpdate() : ������ �� row �� 
			int result=pstmt.executeUpdate();
			// result �� ������ row ���� ���� ��ȯ 
			System.out.println("delete ok  ������ ȸ����:"+result);
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}










package step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 *  INSERT SQL �� �̿��� MEMBER TABLE�� ȸ�� ������ ���� 
 */
public class TestJDBC3 {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String dbUrl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//1. DB ������ ���� Driver loading 
		try {
			Class.forName(driver);
		//2. Connection
			Connection con=DriverManager.getConnection(dbUrl,"scott","tiger");
			System.out.println(con);
		//3. SQL ���� , PreparedStatement �̿��� SQL ���� 
			String sql=
				"INSERT INTO MEMBER(ID,PASSWORD,NAME,ADDRESS) VALUES(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, "ajax");// id ? �� �Ҵ�  1�� ù��° ����ǥ�� �ǹ� 
			pstmt.setString(2, "1111");
			pstmt.setString(3, "�����");
			pstmt.setString(4, "��Ʈ��");			
		//4. executeUpdate() : int -> ������ �� row �� 
			// insert, delete , update �ÿ��� executeUpdate() �� ����ϰ� 
			// select �ÿ��� ����� ��ȯ�ޱ� ���� executeQuery() �� �̿��� ResultSet�� ��ȯ�޴´�
			int result=pstmt.executeUpdate();
			System.out.println("insert ok row:"+result);
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}










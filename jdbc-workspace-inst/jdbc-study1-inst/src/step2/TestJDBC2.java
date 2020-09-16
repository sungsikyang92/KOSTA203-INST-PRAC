package step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 *   SELECT 조회시 조건절 WHERE 을 이용해 조회 
 */
public class TestJDBC2 {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String dbUrl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(dbUrl, "scott", "tiger");
			//sql 문 정의 
			String address="워싱턴";
			String sql="SELECT ID,NAME FROM MEMBER WHERE ADDRESS=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, address);//1 은 첫번째 물음표를 의미한다 , ?에 변수정보를 할당
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) { 
				// getString(column index) or getString(ColumnLabel) 
				System.out.println(rs.getString("ID")+" "+rs.getString("NAME"));
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









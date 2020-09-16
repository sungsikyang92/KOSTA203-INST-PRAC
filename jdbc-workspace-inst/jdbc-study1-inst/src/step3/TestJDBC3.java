package step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 *  INSERT SQL 을 이용해 MEMBER TABLE에 회원 정보를 저장 
 */
public class TestJDBC3 {
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		String dbUrl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//1. DB 연동을 위한 Driver loading 
		try {
			Class.forName(driver);
		//2. Connection
			Connection con=DriverManager.getConnection(dbUrl,"scott","tiger");
			System.out.println(con);
		//3. SQL 정의 , PreparedStatement 이용해 SQL 실행 
			String sql=
				"INSERT INTO MEMBER(ID,PASSWORD,NAME,ADDRESS) VALUES(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, "ajax");// id ? 에 할당  1은 첫번째 물음표를 의미 
			pstmt.setString(2, "1111");
			pstmt.setString(3, "손흥민");
			pstmt.setString(4, "토트넘");			
		//4. executeUpdate() : int -> 영향을 준 row 수 
			// insert, delete , update 시에는 executeUpdate() 를 사용하고 
			// select 시에는 결과를 반환받기 위해 executeQuery() 를 이용해 ResultSet을 반환받는다
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










package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/* DAO: Data Access Object
 * 데이터베이스 연동 로직을 정의한 객체
 */
public class ProductDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "scott";
	private String pass = "tiger";
	// 생성자에서 드라이버 로딩
	public ProductDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}

	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if (rs != null)
			rs.close();
		this.closeAll(pstmt, con);
	}

	public ProductDTO findProductById(String id) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ProductDTO dto = null;
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			String sql = "SELECT name,maker,price FROM PRODUCT WHERE id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new ProductDTO(id, rs.getString(1), rs.getString(2), rs.getInt(3));
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return dto;
	}

	public int getTotalCount() throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int totalCount=0;
		try {
			con=DriverManager.getConnection(dbUrl,user,pass);
			String sql="SELECT COUNT(*)FROM PRODUCT";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				totalCount=rs.getInt(1);
			}
		}finally {
			closeAll(rs,pstmt,con);
		}
		return totalCount;
	}

	public boolean isExistProduct(String id) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		boolean flag=false;
		try {
			con=DriverManager.getConnection(dbUrl,user,pass);
			String sql="SELECT ID FROM PRODUCT WHERE ID=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			
		}finally {
			closeAll(rs,pstmt,con);
		}
		return false;
	}

	

}

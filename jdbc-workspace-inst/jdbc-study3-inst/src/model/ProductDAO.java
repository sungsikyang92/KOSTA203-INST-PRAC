package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*	DAO : Data Access Object 
 *  데이터베이스 연동 로직을 정의한 객체 
 */
public class ProductDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "scott";
	private String pass = "tiger";

	/*
	 * 생성자에서 드라이버 로딩
	 */
	public ProductDAO() throws ClassNotFoundException {
		Class.forName(driver);
	}

	// closeAll
	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	}

	// closeAll overloading
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
			String sql = "SELECT name,maker,price FROM product WHERE id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next())
				dto = new ProductDTO(id, rs.getString(1), rs.getString(2), rs.getInt(3));
		} finally {
			closeAll(rs, pstmt, con);
		}
		return dto;
	}

	public int getTotalCount() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int totalCount = 0;
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			String sql = "SELECT COUNT(*) FROM product";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next())
				totalCount = rs.getInt(1);
		} finally {
			closeAll(rs, pstmt, con);
		}
		return totalCount;
	}

	public boolean isExistProduct(String id) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			String sql = "SELECT COUNT(*) FROM product WHERE id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			rs.next();// count 함수는 무조건 한 row행을 반환하므로 next()를 실행

			/*
			 * int result = rs.getInt(1); if (result == 1) flag = true;
			 */
			// 위 코드를 삼항 연산자로 변경해본다 
			// 조건식에 부합하면 식1 이 수행, 부합되지 않으면 식2가 수행 
			flag=(rs.getInt(1)==0) ? false : true;
		} finally {
			closeAll(rs, pstmt, con);
		}
		return flag;
	}

	public void registerProduct(ProductDTO dto) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=DriverManager.getConnection(dbUrl, user, pass);
			String sql="INSERT INTO product(id,name,maker,price) VALUES(?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getMaker());
			pstmt.setInt(4, dto.getPrice());
			pstmt.executeUpdate();
		}finally {
			closeAll(pstmt, con);
		}
	}

	public ArrayList<ProductDTO> getProductListByPriceOrderByDesc(int lowPrice, int highPrice) 
			throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<ProductDTO> list=new ArrayList<ProductDTO>();
		try {
			con=DriverManager.getConnection(dbUrl, user, pass);
			String sql=
	       "SELECT name,price FROM product WHERE price BETWEEN ? AND ? ORDER BY price DESC";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, lowPrice);
			pstmt.setInt(2, highPrice);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				ProductDTO dto=new ProductDTO();
				dto.setName(rs.getString(1));
				dto.setPrice(rs.getInt(2));
				list.add(dto);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}

	public ArrayList<ProductDTO> getProductListDiscountPrice(int percent) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<ProductDTO> list=new ArrayList<ProductDTO>();
		try {
			StringBuilder sb=new StringBuilder();
			sb.append("SELECT name,price-(price*?/100) as 할인가 ");
			sb.append("FROM product ");
			sb.append("ORDER BY price ASC");
			con=DriverManager.getConnection(dbUrl, user, pass);
			pstmt=con.prepareStatement(sb.toString());
			pstmt.setInt(1, percent);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				ProductDTO dto=new ProductDTO();
				dto.setName(rs.getString(1));
				dto.setPrice(rs.getInt(2));
				list.add(dto);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}





















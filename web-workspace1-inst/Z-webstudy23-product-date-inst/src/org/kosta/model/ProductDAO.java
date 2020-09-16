package org.kosta.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username="scott";
	private String userpass="tiger";
	private static ProductDAO instance=new ProductDAO();
	private ProductDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		}
	}
	public static ProductDAO getInstance() {
		return instance;
	}
	public void closeAll(PreparedStatement pstmt,Connection con) throws SQLException {
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		closeAll(pstmt, con);
	}
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, userpass);
	}
	public void register(ProductVO productVO) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=getConnection();
			StringBuilder sql=new StringBuilder();
			sql.append("insert into mvc_product(id,name,maker,price,regdate) ");
			sql.append("values(mvc_product_seq.nextval,?,?,?,sysdate)");
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setString(1, productVO.getName());
			pstmt.setString(2, productVO.getMaker());
			pstmt.setInt(3, productVO.getPrice());
			pstmt.executeUpdate();
		}finally {
			closeAll(rs, pstmt, con);
		}
	}
	public ArrayList<ProductVO> getAllProductList() throws SQLException{
		ArrayList<ProductVO> list=new ArrayList<ProductVO>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=getConnection();
			StringBuilder sql=new StringBuilder();
			sql.append("select id,name,to_char(regdate,'YYYY/MM/DD') from mvc_product order by id desc");			
			pstmt=con.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				ProductVO pvo=new ProductVO();
				pvo.setId(rs.getString(1));
				pvo.setName(rs.getString(2));
				pvo.setRegDate(rs.getString(3));
				list.add(pvo);
			}				
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	public ProductVO findProductById(String id) throws SQLException {
		ProductVO vo=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=getConnection();
			StringBuilder sql=new StringBuilder();
			sql.append("select name,maker,price,to_char(regdate,'YYYY/MM/DD HH24:MI:SS') ");
			sql.append(" from mvc_product where id=?");
			pstmt=con.prepareStatement(sql.toString());
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next())
				vo=new ProductVO(id,rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
}



















package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class ItemDAO {
	private static ItemDAO instance=new ItemDAO();
	private DataSource datasource;
	private ItemDAO() {
		this.datasource=DataSourceManager.getInstance().getDataSource();
	}
	public static ItemDAO getInstance() {
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
	public ArrayList<ItemDTO> getAllItemList() throws SQLException{
		ArrayList<ItemDTO> list=new ArrayList<ItemDTO>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=datasource.getConnection();
			String sql="SELECT item_no,name,maker,price,detail FROM item ORDER BY item_no desc";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				list.add(new ItemDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5)));
			}
		}finally {
			closeAll(rs,pstmt,con);
		}
		return list;
	}
	public ItemDTO getItemDetail(String name) throws SQLException {
		ItemDTO dto=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=datasource.getConnection();
			String sql="SELECT item_no,name,maker,price,detail FROM item WHERE name=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto=new ItemDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
			}
		}finally {
			closeAll(rs,pstmt,con);
		}
		return dto;
	}
}
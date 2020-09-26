package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class ItemDAO {
	private static ItemDAO instance=new ItemDAO();
	private DataSource dataSource;
	private ItemDAO() {
		this.dataSource=DataSourceManager.getInstance().getDataSource();
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
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<ItemDTO> list=new ArrayList<ItemDTO>();
		try {
			con=dataSource.getConnection();
			String sql="select item_no,name,maker from item order by item_no desc";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				ItemDTO dto=new ItemDTO();
				dto.setItemNo(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setMaker(rs.getString(3));
				list.add(dto);
			}
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	public ItemDTO findItemByNO(String itemNo) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ItemDTO dto=null;
		try {
			con=dataSource.getConnection();
			String sql="select name,maker,price,detail from item where item_no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, itemNo);
			rs=pstmt.executeQuery();
			if(rs.next())
				dto=new ItemDTO(itemNo,rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return dto;
	}
	public void registerItem(ItemDTO dto) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=dataSource.getConnection();
			String sql="insert into item(item_no,name,maker,price,detail) values(item_seq.nextval,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getMaker());
			pstmt.setInt(3, dto.getPrice());
			pstmt.setString(4, dto.getDetail());
			pstmt.executeUpdate();
		}finally {
			closeAll(pstmt, con);
		}
	}
}























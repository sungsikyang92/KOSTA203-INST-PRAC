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
	public ItemDTO findItemByNO(String itemNo) {
		return null;
	}
}























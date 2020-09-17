package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

/*
 * 	DAO: Data Access Object: 시스템 상에서 단 한번 객체를 생성하고 여러 곳에서 공유해서 사용하도록 한다.
 */
public class CarDAO2 {
	private static CarDAO2 instance=new CarDAO2();
	private DataSource dataSource;
	private CarDAO2() {
		this.dataSource=DataSourceManager.GetInstance().getDataSource();
	}
	public static CarDAO2 getInstance() {
			return instance;
		}
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public CarDTO findCarByNo(String carNo) throws SQLException {
		CarDTO carDTO=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=dataSource.getConnection();
			String sql="SELECT model,price FROM mvc_car WHERE car_no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, carNo);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				carDTO=new CarDTO(carNo,rs.getString(1),rs.getInt(2));
			}
		}finally {
			closeAll(rs,pstmt,con);
		}
		return carDTO;
		
	}
		
}

	
package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

/*
 * DBCP 를 이용해 컨넥션을 빌려오고 반납받는다 
 * 
 * DAO : Data Access Object 
 * 
 * DAO에 Singleton Design Pattern을 적용한다 
 * : 시스템 상에서 단 한번 객체 생성하고 여러 곳에서 공유해서 사용하도록 한다 
 */
public class CarDAO2 {	
	private static CarDAO2 instance=new CarDAO2();	
	private DataSource dataSource;
	private CarDAO2() {
		this.dataSource=DataSourceManager.getInstance().getDataSource();
	}
	public static CarDAO2 getInstance() {
		return instance;
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();//컨넥션을 dbcp에 반납한다(소멸시키는 것이 아님)
	}
	public CarDTO findCarByNo(String carNo) throws SQLException {
		CarDTO carDTO=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//dbcp로부터 컨넥션을 빌려온다 ( 생성하는 것이 아님 ) 
			con=dataSource.getConnection();
			String sql="select model,price from mvc_car where car_no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, carNo);
			rs=pstmt.executeQuery();
			if(rs.next())
				carDTO=new CarDTO(carNo,rs.getString(1),rs.getInt(2));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return carDTO;
	}	
	public ArrayList<CarDTO> getAllCarList() throws SQLException{
		ArrayList<CarDTO> list=new ArrayList<CarDTO>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=dataSource.getConnection();//컨넥션풀로부터 컨넥션을 빌려온다 
			String sql="select car_no,model from mvc_car order by car_no desc";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next())
				list.add(new CarDTO(rs.getString(1),rs.getString(2),0));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
}























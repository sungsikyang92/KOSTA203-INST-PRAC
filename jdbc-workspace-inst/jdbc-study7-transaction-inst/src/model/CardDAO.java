package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.DbInfo;

/**
 * ī��� ����Ʈ ������ �Բ� ����ϴ� �޼��带 ���� 
 * -> Ʈ����� ó���� �ʿ伺�� Ȯ�� 
 * @author KOSTA
 *
 */
public class CardDAO {
	//������ , closeAll 
	public CardDAO() throws ClassNotFoundException{
		Class.forName(DbInfo.DRIVER_NAME);
	}
	public void closeAll(PreparedStatement pstmt,Connection con) throws SQLException {
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public void registerCardAndPoint(String id, String name, String pointType, int point) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			String insertCardSql="INSERT INTO CARD(id,name) VALUES(?,?)";
			String insertPointSql="INSERT INTO POINT(id,point_type,point) VALUES(?,?,?)";
			con=DriverManager.getConnection(DbInfo.URL, DbInfo.USER, DbInfo.PASS);
			pstmt=con.prepareStatement(insertCardSql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			int result=pstmt.executeUpdate();
			System.out.println("card insert success "+result);
			pstmt.close();
			pstmt=con.prepareStatement(insertPointSql);
			pstmt.setString(1, id);
			pstmt.setString(2, pointType);
			pstmt.setInt(3, point);
			int result2=pstmt.executeUpdate();
			System.out.println("point insert success "+result2);
		}finally {
			closeAll(pstmt, con);
		}
	}
}













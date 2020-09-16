package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.DbInfo;

/**
 * CardDAO1 ������ ī�尡 ��ϵǰ�, ����Ʈ ��Ͻ� ������ �߻��ϴ��� 
 * ī��� ���� DB�� ������ ��ϵǴ� ���� ������ �߻��ߴ�. 
 * Ʈ����� ó���� ���� �ϳ��� �۾�����( ī�� ��ϰ� ����Ʈ ���)�� ��� �������� 
 * �� ����Ǿ��� ���� ���� �����ͺ��̽��� ��ϵǵ��� ó���� �غ��� 
 * ���� �߻��ÿ��� ��� �۾��� ��ҵǵ��� ó���Ѵ�. 
 * 
 * @author KOSTA
 *
 */
public class CardDAO2 {
	//������ , closeAll 
	public CardDAO2() throws ClassNotFoundException{
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
			String insertPointSql="INSERT6678 INTO POINT(id,point_type,point) VALUES(?,?,?)";
			con=DriverManager.getConnection(DbInfo.URL, DbInfo.USER, DbInfo.PASS);
			// Ʈ����� ó���� ���� ����Ŀ�� ��带 �����Ѵ�. 
			con.setAutoCommit(false);
			
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
			// ī�� �߱� �۾��� ��� ���������� ����Ǿ��� �� ���� �����ͺ��̽��� ������ ��� 
			con.commit();
			System.out.println("ī�� �߱��� ��� �۾��� ���������� ����Ǿ� Ŀ��!!");
		}catch(Exception e) {
			con.rollback();
			System.out.println("ī�� �߱� �۾��� ���� �߻��Ͽ� �۾� ����ϰ� �ǵ����� ROLLBACK");
			//����� �ڵ�(client code) ���� ���� ��Ȳ�� �˸��� ���� �ٽ� ���ܸ� �߻����� 
			// ȣ���� ������ �����ϱ� ���� �Ʒ� �ڵ带 �ۼ��Ѵ� 
			throw e;
		}finally {
			closeAll(pstmt, con);
		}
	}
}













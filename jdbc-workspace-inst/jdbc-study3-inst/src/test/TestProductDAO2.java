package test;

import model.ProductDAO;
// �� ��ǰ���� ��ȯ�޴� ���� : ResultSet �� getInt() �� �̿��ϸ� �ȴ� 
public class TestProductDAO2 {
	public static void main(String[] args) {
		try {
			ProductDAO dao=new ProductDAO();
			int totalCount=dao.getTotalCount();
			System.out.println("�ѻ�ǰ��:"+totalCount);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}











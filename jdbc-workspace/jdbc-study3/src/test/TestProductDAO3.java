package test;

import model.ProductDAO;

//���̵� ���� ��ǰ�� �����ϴ��� ������ ��ȯ�Ѵ�
public class TestProductDAO3 {
	public static void main(String[] args) {
		try {
			ProductDAO dao=new ProductDAO();
			String id="1";
			boolean flag=dao.isExistProduct(id);
			if(flag)
				System.out.println(id+"���̵� �ش��ϴ� ��ǰ����");
			else
				System.out.println(id+"���̵� �ش��ϴ� ��ǰ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

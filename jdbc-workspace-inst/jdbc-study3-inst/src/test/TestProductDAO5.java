package test;

import java.util.ArrayList;

import model.ProductDAO;
import model.ProductDTO;

// PRODUCT TABLE�� ��ǰ������ ��ȸ�ϴ� ���� 
// ������ �̿� WHERE  ,  ���� 
public class TestProductDAO5 {
	public static void main(String[] args) {
		try {
			ProductDAO dao=new ProductDAO();
			int lowPrice=2000; // 2000 �̻� 
			int highPrice=3000; // 3000 ���� 
			//��ǰ price�� 2000 �̻� 3000 ���� ��ǰ�� name �� ���� price �� ����Ʈ�� ��ȸ 
			//��ǰ price �������� 
			ArrayList<ProductDTO> list=
					dao.getProductListByPriceOrderByDesc(lowPrice,highPrice);
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).getName()+" "+list.get(i).getPrice());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}











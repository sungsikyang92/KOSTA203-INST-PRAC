package test;

import model.ProductDAO;
import model.ProductDTO;

public class TestProductDAO1 {
	public static void main(String[] args) {
		try {
		ProductDAO dao=new ProductDAO();
		String id="a";
		ProductDTO dto=dao.findProductById(id);
		if(dto==null)
			System.out.println(id+"���̵� �ش��ϴ� ��ǰ�� �����ϴ�");
		else
			System.out.println("�˻����: "+dto);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

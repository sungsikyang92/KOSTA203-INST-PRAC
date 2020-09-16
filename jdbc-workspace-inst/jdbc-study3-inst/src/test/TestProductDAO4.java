package test;

import model.ProductDAO;
import model.ProductDTO;

// PRODUCT TABLE�� ��ǰ������ ����ϴ� ���� 
public class TestProductDAO4 {
	public static void main(String[] args) {
		try {
			ProductDAO dao=new ProductDAO();
			//����� ��ǰ������ü 
			ProductDTO dto=new ProductDTO("4","���̽�","����",3000);
			if(dao.isExistProduct(dto.getId())) {
				System.out.println(dto.getId()+"���̵� ���� ��ǰ�� �����ϹǷ� ��ϺҰ�");
			}else {
				dao.registerProduct(dto);
				System.out.println("insert ok:"+dao.findProductById(dto.getId()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}











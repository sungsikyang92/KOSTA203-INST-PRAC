package test;

import model.ProductDAO;
import model.ProductDTO;
// primary key인 product id로 상품정보를 검색하는 예제 
public class TestProductDAO1 {
	public static void main(String[] args) {
		try {
			ProductDAO dao=new ProductDAO();
			String id="a";//없습니다
			//id="1";//상품정보
			ProductDTO dto=dao.findProductById(id);
			if(dto==null)
				System.out.println(id+"아이디에 해당하는 상품이 없습니다");
			else
				System.out.println("검색결과:"+dto);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}











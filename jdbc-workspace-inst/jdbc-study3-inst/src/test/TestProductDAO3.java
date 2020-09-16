package test;

import model.ProductDAO;
// 아이디에 대한 상품이 존재하는 지 유무를 반환한다  
public class TestProductDAO3 {
	public static void main(String[] args) {
		try {
			ProductDAO dao=new ProductDAO();
			String id="1";//있는 아이디 
			//id="kk";//없는 아이디
			boolean flag=dao.isExistProduct(id);
			if(flag)
				System.out.println(id+" 아이디에 해당하는 상품있음");
			else
				System.out.println(id+" 아이디에 해당하는 상품없음");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}











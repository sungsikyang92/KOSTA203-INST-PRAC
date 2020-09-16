package test;

import java.util.ArrayList;

import model.ProductDAO;
import model.ProductDTO;

// PRODUCT TABLE에 상품정보를 조회하는 예제 
// 조건절 이용 WHERE  ,  정렬 
public class TestProductDAO5 {
	public static void main(String[] args) {
		try {
			ProductDAO dao=new ProductDAO();
			int lowPrice=2000; // 2000 이상 
			int highPrice=3000; // 3000 이하 
			//상품 price가 2000 이상 3000 이하 상품명 name 과 가격 price 의 리스트를 조회 
			//상품 price 내림차순 
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











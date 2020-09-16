<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find-product.jsp</title>
</head>
<body>
<%--
			FindProductByIdServlet <--> ProductDAO
											  findProductById(id) : ProductVO 
			 | 상품있으면   		 상품없으면 
			 find_ok.jsp  		or   find_fail.jsp 	
			 table로 상품정보제공 								
 --%>
<form action="FindProductByIdServlet">
상품아이디 <input type="number" name="productId" required="required">
<input type="submit" value="검색">
</form>
</body>
</html>













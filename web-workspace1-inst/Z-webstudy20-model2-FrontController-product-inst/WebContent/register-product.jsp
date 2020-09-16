<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register-product.jsp</title>
</head>
<body>
<%--
	register-form -- command=registerproduct --  RegisterProductController -- ProductDAO
																						 registerProduct(ProductVO)
		 							|
		 							| redirect 
		 							register-product-result.jsp 															 
 --%>
<form method="post" action="front">
<input type="hidden" name="command" value="registerproduct">
상품명 <input type="text" name="productName" required="required"><br>
제조사 <input type="text" name="productMaker" required="required"><br>
가격 <input type="number" name="productPrice" required="required"><br>
<input type="submit" value="등록">
</form>
</body>
</html>














<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품검색</title>
</head>
<body>
<%--
			find-product-form.jsp --request-- front(DispatcherServlet) <-->HandlerMapping<-->FindProductByIdController<--> ProductDAO : findProductById(id)
														|
														| forward 
													find-ok.jsp
													or
													find-fail.jsp 	
			command=findproductbyid 										
 --%>
<form action="front">
<input type="hidden" name="command" value="findproductbyid">
상품아이디 <input type="text" name="productId">
<input type="submit" value="검색">
</form>
</body>
</html>















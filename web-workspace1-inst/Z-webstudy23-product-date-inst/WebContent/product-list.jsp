<%@page import="org.kosta.model.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품리스트</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<a href="register-form.jsp">상품등록</a>
<hr>
<%	 @SuppressWarnings("unchecked")
	 ArrayList<ProductVO> list=(ArrayList<ProductVO>)request.getAttribute("list");
%>
<table>
<% for(ProductVO pvo:list){ %>
	<tr>
		<td><%=pvo.getId() %></td>
		<%-- 상품 상세 정보 링크를 제공 										ProductDAO
				command=detailproduct --> ProductDetailController <--> findProductById(id)
					|
				 detail-product.jsp 	
		 --%>
		<td><a href="front?command=detailproduct&id=<%=pvo.getId()%>"><%=pvo.getName() %></a></td>
		<td><%=pvo.getRegDate() %></td>
	</tr>
<%} %>	
</table>
</div>
</body>
</html>












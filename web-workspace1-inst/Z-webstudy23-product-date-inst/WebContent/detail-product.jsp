<%@page import="org.kosta.model.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품상세정보</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>
<hr>
<%
		ProductVO pvo=(ProductVO)request.getAttribute("pvo");
%>
<table>
<tr>
	<td>상품번호</td><td><%=pvo.getId() %></td>
</tr>
<tr>
	<td>상품명</td><td><%=pvo.getName() %></td>
</tr>
<tr>
	<td>제조사</td><td><%=pvo.getMaker() %></td>
</tr>
<tr>
	<td>가격</td><td><%=pvo.getPrice() %></td>
</tr>
<tr>
	<td>등록일시</td><td><%=pvo.getRegDate() %></td>
</tr>
</table>
</div>
</body>
</html>













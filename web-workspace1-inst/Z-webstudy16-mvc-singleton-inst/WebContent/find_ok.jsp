<%@page import="model.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품상세정보</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<%
		ProductVO pvo=(ProductVO)request.getAttribute("pvo");
%>
<table>
	<thead>
		<tr>
			<th>ID</th><th>NAME</th><th>MAKER</th><th>PRICE</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><%=pvo.getId() %></td>
			<td><%=pvo.getName() %></td>
			<td><%=pvo.getMaker() %></td>
			<td><%=pvo.getPrice() %></td>
		</tr>
	</tbody>
</table>
</body>
</html>




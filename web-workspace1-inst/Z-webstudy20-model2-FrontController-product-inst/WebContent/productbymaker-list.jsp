<%@page import="org.kosta.model.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제조사별 상품리스트</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<table>
	<thead>
		<tr>
			<th>ID</th><th>NAME</th><th>MAKER</th><th>PRICE</th>
		</tr>
	</thead>
	<tbody>
		<%-- for loop --%>
		<% 
			@SuppressWarnings("unchecked")
			ArrayList<ProductVO> list=(ArrayList<ProductVO>)request.getAttribute("list");
			for(int i=0;i<list.size();i++){
		%>
				<tr>
					<td><%=list.get(i).getId() %></td><td><%=list.get(i).getName() %></td>
					<td><%=list.get(i).getMaker() %></td><td><%=list.get(i).getPrice() %></td>
				</tr>
		<%} %>
	</tbody>
</table>
</body>
</html>












<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디검색성공</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>
<hr>
<table>
	<thead>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>ADDRESS</th>
		</tr>
	</thead>
	<tbody>
	<%
		MemberVO vo=(MemberVO)request.getAttribute("vo");
	%>
		<tr>
			<td><%=vo.getId() %></td>
			<td><%=vo.getName() %></td>
			<td><%=vo.getAddress() %></td>
		</tr>
	</tbody>
</table>
</div>
</body>
</html>
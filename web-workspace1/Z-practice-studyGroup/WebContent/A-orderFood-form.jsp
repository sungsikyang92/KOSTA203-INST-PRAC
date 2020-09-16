<%@page import="a_model.MenuVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>음식주문</title>
</head>
<body>
<form action="front">
<input type="hidden" name="command" value="orderMenu">
<table>
	<%ArrayList<MenuVO> list=(ArrayList<MenuVO>)request.getAttribute("list");%><%-- 일단 여기부터 문제.... --%>
	<thead>
		<tr>
			<th>번호</th><th>메뉴</th><th>가격</th>
		</tr>
	</thead>
	<tbody>
			<%for(MenuVO vo:list){ %>
		<tr>
			<td><%=vo.getId() %></td>
			<td><%=vo.getMenu() %></td>
			<td><%=vo.getPrice() %></td>
		</tr>
		<%} %>
	</tbody>
</table>
주문번호입력<input type="number" name="menuId">
<input type="submit" value="주문하기">
</form>
</body>
</html>
<%@page import="model.CarVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 ok</title>
</head>
<body>
<%
		CarVO car=(CarVO)request.getAttribute("car");
%>		아이디 <%=car.getId() %><br>
		차주명 <%=car.getOwner() %><br>
		모델명 <%=car.getModel() %><br>
		주소 <%=car.getAddress() %>
</body>
</html>






















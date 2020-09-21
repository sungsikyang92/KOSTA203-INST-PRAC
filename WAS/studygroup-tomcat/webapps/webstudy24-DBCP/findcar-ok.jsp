<%@page import="org.kosta.model.CarDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car Search Result</title>
</head>
<body>
<%
	CarDTO dto=(CarDTO)request.getAttribute("carDTO");
%>
차번호:<%=dto.getCarNo() %><br>
모델명:<%=dto.getModel() %><br>
가격:<%=dto.getPrice() %><br>
</body>
</html>
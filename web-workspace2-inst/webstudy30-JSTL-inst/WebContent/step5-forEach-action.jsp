<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%  //post방식 한글처리
	  request.setCharacterEncoding("utf-8");	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step5-forEach-action</title>
</head>
<body>
주문자명 ${param.customerName} <br>
<c:forEach items="${paramValues.menu}" var="food" varStatus="order">
${order.count}.${food}<br>
</c:forEach>
</body>
</html>












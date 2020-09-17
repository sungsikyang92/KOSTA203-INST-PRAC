<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step4 forEach (jstl for loop)</title>
</head>
<body>
<%
		String friends[]={"진용현","손흥민","RM"};
		request.setAttribute("fa", friends);
%>
<%--
		jstl forEach : jstl for loop 
		items : 대상 배열 또는 컬렉션 
		var : 요소를 저장할 변수 
		varStatus : index와 count 속성이 있다 
					  index는 0부터 시작 
					  count는 1부터 시작 
 --%>
<c:forEach items="${requestScope.fa}" var="fname" varStatus="order">
 count: ${order.count} index:${order.index} 	${fname} <br>
</c:forEach>
</body>
</html>








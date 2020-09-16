<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과화면</title>
</head>
<body>
<% //post방식일때 한글처리 
	request.setCharacterEncoding("utf-8");
%>
<%=request.getParameter("userAddr") %>에 사는 
<%=request.getParameter("userName") %>님 등록되었습니다 <br>
<a href="step9.jsp">등록화면으로</a>
</body>
</html>






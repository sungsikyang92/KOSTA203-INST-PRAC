<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step4-select-action.jsp</title>
</head>
<body>
<%String flower=request.getParameter("flower"); %>
<img src="picture/<%=flower %>.jpg">

<%--	<img src="picture/<%=request.getParameter("flower")%>.jpg"	 --%>
</body>
</html>
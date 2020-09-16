<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>child-view.jsp</title>
</head>
<body bgcolor="yellow">
<%=request.getParameter("userAge") %>세  
<%=request.getParameter("userName") %>님 
미성년 페이지입니다 <hr>
<%=request.getParameter("command") %><br><br>
<%
		//jsp forward param 한글 정보를 받기 위해 한글처리(디코딩)가 필요
		String info=URLDecoder.decode(request.getParameter("info"), "utf-8");
%>
<%=info%><br><br>
<a href="forward-form.jsp">입장페이지로</a>
</body>
</html>














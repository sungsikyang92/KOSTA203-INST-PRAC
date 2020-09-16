<%@page import="org.study.model.MenuVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>menuregisterresult</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<hr>
<%MenuVO mvo=(MenuVO)request.getAttribute("mvo"); %>
<%=mvo.getName() %>
메뉴추가가 완료되었습니다!	
</div>
</body>
</html>
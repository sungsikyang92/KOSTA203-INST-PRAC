<%@page import="org.study.model.AdminVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginSuccess</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<h1>
<a href="index.jsp">HOME</a>
</h1>
<hr>
<%
	HttpSession session=request.getSession(false);
	if(session!=null){
		AdminVO avo=(AdminVO)session.getAttribute("avo");
		if(avo!=null){
%>
		<%=avo.getName() %>님 로그인하셨습니다.<br>
		<a href="register-new-menu.jsp">신규메뉴등록</a>
<%
		}
	}
%>
</div>
</body>
</html>
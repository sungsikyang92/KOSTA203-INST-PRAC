<%@page import="org.kosta.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>
<hr>
<% 
	HttpSession session=request.getSession(false);
	if(session!=null){
		MemberVO mvo=(MemberVO)session.getAttribute("mvo");
		if(mvo!=null){
	
%>
	<%=mvo.getName() %>님이 로그인 하셨습니다.
<%
		}
	}
%>
</div>
</body>
</html>
<%@page import="org.study.model.AdminVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<h1>
<a href="index.jsp">HOME</a>&nbsp;&nbsp;&nbsp;
</h1>
<hr>
<h3>Index/ Home 화면입니다</h3><br>
<%
		HttpSession session=request.getSession(false);
	if(session!=null&&session.getAttribute("avo")!=null){
		AdminVO avo=(AdminVO)session.getAttribute("avo");
%>
	<%=avo.getDepartment() %>부서의 <%=avo.getName() %>님 로그인 상태<br>
	<a href="front?command=logout">로그아웃</a><br>
	<%}else{ %>
<a href="customerpage.jsp">손님페이지</a>&nbsp;&nbsp;&nbsp;
<a href="adminpage.jsp">관리자페이지</a>&nbsp;&nbsp;&nbsp;
<%
	}
%>
</div>
</body>
</html>
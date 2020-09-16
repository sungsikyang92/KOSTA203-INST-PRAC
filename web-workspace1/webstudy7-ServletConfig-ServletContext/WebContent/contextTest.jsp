<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ServletContext Test</title>
</head>
<body>
<h1>
contextTest.jsp
<br><br>ServletContext에서 dbUrl 받아옴:<%=application.getInitParameter("dburl") %>
<br>
ServletContext로 부터 One 서블릿이 할당한 nick을 반환:
<%=application.getAttribute("nick") %>
<br>
<a href="One">One Servlet으로 이동</a><br>
<a href="Two">Two Servlet으로 이동</a><br>
</h1>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원검색</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>
<hr>
<form action="front" method="get">
<input type="hidden" name="command" value="findmemberbyid">
아이디<input type="text" name="id">
<input type="submit" value="회원검색">
</form>
</div>
</body>
</html>
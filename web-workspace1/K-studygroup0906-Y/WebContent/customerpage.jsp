<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customerpage</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<h1>
<a href="index.jsp">HOME</a>&nbsp;&nbsp;&nbsp;
</h1>
<hr>
손님페이지입니다
<form action="front" method="post">
<input type="hidden" name="command" value="adminsignin">
아이디<input type="text" name="id" required="required"><br>
비밀번호<input type="password" name="pass" required="required"><br>
<input type="submit" value="Sign-in">
</form>
</div>
</body>
</html>
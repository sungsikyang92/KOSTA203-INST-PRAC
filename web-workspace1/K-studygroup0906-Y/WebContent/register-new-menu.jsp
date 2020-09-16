<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RegisterNewMenu</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<h1>
<a href="index.jsp">HOME</a>
</h1>
<hr>
<form action="front" method="post" name="menuregisterform">
<input type="hidden" name="command" value="menuregister">
메뉴이름<input type="text" name="menuname" required="required"><br>
메뉴가격<input type="number" name="menuprice" required="required"><br>
메뉴설명<input type="text" name="menuexplain" required="required"><br>
<input type="submit" value="등록">
</form>
</div>
</body>
</html>
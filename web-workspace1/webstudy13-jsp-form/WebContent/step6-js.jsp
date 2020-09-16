<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step6-js.jsp</title>
</head>
<body>
<form action="step6-action.jsp">
이름<input type="text" name="userName" required="required">
나이<input type="number" name="userAge" min="1" max="150">
<input type="submit" value="관람하기">
</form>
</body>
</html>
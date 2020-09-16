<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step7-form</title>
</head>
<body>
<form action="step7-grade.jsp">
이름<input type="text" name="studentName" required="required">
점수<input type="number" name="studentScore" min="0" max="100">
<input type="submit" value="학점확인">
</form>
</body>
</html>
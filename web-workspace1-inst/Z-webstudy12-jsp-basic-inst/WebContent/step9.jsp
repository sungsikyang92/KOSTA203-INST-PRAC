<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp form연동</title>
</head>
<body>
<%--
			판교에 사는 누구님 등록되었습니다. 
			등록화면으로 ( a link ) 
 --%>
<form action="step9-action.jsp" method="post">
이름 <input type="text" name="userName" required="required"><br>
주소 <input type="text" name="userAddr" required="required"><br>
<input type="submit" value="등록">
</form>

</body>
</html>






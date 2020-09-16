<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제폼</title>
</head>
<body>
<%--
			HandlerMapping에서  else if 추가 
			DeleteCarController 정의 
			delete-car-result.jsp로 리다이렉트한다 
 --%>
<form action="front">
<input type="hidden" name="command" value="deleteCar">
아이디 <input type="number" name="id">
<input type="submit" value="삭제">
</form>
</body>
</html>
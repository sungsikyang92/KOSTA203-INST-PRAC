<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>차등록페이지</title>
</head>
<body>
<%--
			DispatcherServlet 			 --> MockDAO
													registerCar()
							|  redirect 방식으로 이동시킨다 
						car-register-result.jsp							
 --%>
<form action="front" method="post">
<input type="hidden" name="command" value="registerCar">
아이디 <input type="number" name="carId"><br>
차주명 <input type="text" name="owner"><br>
모델명 <input type="text" name="model"><br>
주소 <input type="text" name="address"><br>
<input type="submit" value="등록하기">	
</form>
</body>
</html>







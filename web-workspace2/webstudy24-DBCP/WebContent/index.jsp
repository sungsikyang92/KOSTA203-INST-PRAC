<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dbcp test</title>
</head>
<body>
<%--
  index.jsp -- command=findCarByNo -- FindCarByNoController -- CarDAO
                                          |            findCarByNo(String no): CarDTO
                                          |
                                      findcar-ok.jsp  : 차 정보 제공(car_no, model, price)
                                        or
                                      findcar-fail.jsp  : 차정보가 없습니다 alert 후 index로 이동          
--%>
<form action="front">
<input type="hidden" name="command" value="findCarByNo">
차번호<input type="number" name="carNo">
<input type="submit" value="검색">
</form>
</body>
</html>
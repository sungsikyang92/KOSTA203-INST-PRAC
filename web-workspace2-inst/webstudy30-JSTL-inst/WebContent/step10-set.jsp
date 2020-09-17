<%@page import="model.CarVO"%>
<%@page import="model.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step10-set.jsp</title>
</head>
<body>
<%
		request.setAttribute("personVO", new PersonVO("아이유",28));
%>
JSTL 의 set 을 이용 <br>
${requestScope.personVO.name}
<c:set value="${requestScope.personVO}" var="p"></c:set>
${p.name} ${p.age}
<hr>
<%
		PersonVO pvo=new PersonVO("양성식",28,new CarVO("123","테슬라",4500));
		request.setAttribute("person", pvo);
%>
<%
		//기존 방식(스크립틀릿)으로 정보를 확인 
		PersonVO rvo=(PersonVO)request.getAttribute("person");
%>
 이름:<%=rvo.getName() %>   자동차모델명:<%=rvo.getCarVO().getModel() %>
 <hr>
 EL 방식으로 출력 <br>
 이름:${requestScope.person.name}    
 자동차 모델명: ${requestScope.person.carVO.model }     
 자동차 가격: ${requestScope.person.carVO.price }
 <hr>
 <c:set var="car"  value="${requestScope.person.carVO}"></c:set>
 이름 : ${requestScope.person.name}
 자동차 모델명 : ${car.model}
 자동차 가격 : ${car.price}
</body>
</html>
















<%@page import="model.CarVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step6-forEach.jsp</title>
</head>
<body>
<c:forEach begin="1" end="5"  var="num">
${num}
</c:forEach>
<hr>
<%
		PersonVO pa[]={new PersonVO("아이유",28),new PersonVO("정지윤",23),
				new PersonVO("정재우",28)};
		request.setAttribute("parray", pa);
%>
<%--
			items : 배열 또는 컬렉션  , var : 요소를 담을 변수  , 
			varStatus : count(1부터) , index(0부터)
 --%>
<c:forEach items="${requestScope.parray}" var="person" varStatus="order">
${order.count}.이름:${person.name}   나이:${person.age} <br>
</c:forEach>
<%
		ArrayList<CarVO> list=new ArrayList<CarVO>();
		list.add(new CarVO("123","모닝",1000));
		list.add(new CarVO("432","테슬라",4500));
		list.add(new CarVO("789","소나타",2500));
		session.setAttribute("carList", list);
%>
<hr>
<%--
	 1.	모델명:모닝     가격:1000
	 ..
	 3. 모델명:소나타  가격:2500
 --%>
 <c:forEach items="${sessionScope.carList}" var="car" varStatus="order">
 ${order.count}. 모델명:${car.model} 가격:${car.price} <br>
 </c:forEach>
</body>
</html>






















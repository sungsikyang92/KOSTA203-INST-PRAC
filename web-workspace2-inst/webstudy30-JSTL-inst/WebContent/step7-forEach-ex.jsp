<%@page import="model.PersonVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>JSTL forEach</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<%
		ArrayList<PersonVO> list = new ArrayList<PersonVO>();
	list.add(new PersonVO("강희석", 28));
	list.add(new PersonVO("정재우", 29));
	list.add(new PersonVO("송영섭", 18));
	request.setAttribute("memberList", list);
	%>
	<%--	19세 이상이면 	
		성인  강희석 28세 
		..
		미성년 송영섭 18세 
 --%>
	<div class="container">
		<h2>JSTL forEach 연습</h2>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>연령대</th>
					<th>이름</th>
					<th>나이</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.memberList}" var="member">
					<tr>					
					<c:choose>
						<c:when test="${member.age>=19}">
							<td>성인</td>
						</c:when>
						<c:otherwise>
							<td>미성년</td>
						</c:otherwise>
					</c:choose>
					<td>${member.name}</td><td>${member.age}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>









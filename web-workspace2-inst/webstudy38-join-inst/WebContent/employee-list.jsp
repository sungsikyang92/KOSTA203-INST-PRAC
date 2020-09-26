<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2">
				<br>
				<br>
				<h5><a href="index.jsp">Home</a></h5>
				<br><br>
				<table class="table">
					<tr>
						<th>사원번호</th><th>사원명</th><th>월급</th>
						<th>부서번호</th><th>부서명</th><th>지역</th>
						<th>TEL</th>
					</tr>
					<%-- jstl forEach로 리스트 제공 --%>
					<c:forEach items="${requestScope.list}" var="emp">
					<tr>
					<td>${emp.empno}</td>
					<td>${emp.ename}</td>
					<td>${emp.sal}</td>
					<td>${emp.deptVO.deptno}</td>
					<td>${emp.deptVO.dname}</td>
					<td>${emp.deptVO.loc}</td>
					<td>${emp.deptVO.tel}</td>
					</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>












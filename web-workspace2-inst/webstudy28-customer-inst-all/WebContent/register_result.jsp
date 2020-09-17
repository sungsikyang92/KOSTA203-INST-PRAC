<%@page import="model.CustomerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/mystyle.css">
<title>회원가입결과</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<div class="row content">
			<div class="col-sm-9">
				<h3>
					회원가입을 축하합니다
				</h3>
			</div>
			<div class="col-sm-3 right">
				<jsp:include page="right.jsp"></jsp:include>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>











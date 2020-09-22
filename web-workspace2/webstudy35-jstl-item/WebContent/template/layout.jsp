<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script  src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script  src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/myhome.css"/>
</head>
<body>
<div class="container">
	<div class="row header">
		<div class="col-sm-12">
			<h3>
				<a href="${pageContext.request.contextPath}/front?command=home">Home logo</a>
			</h3>
		</div>
	</div>
	<div class="row main">
		<div class="col-sm-12">
			<c:import url="${requestScope.url}"></c:import>
		</div>
		<!-- <div class="col-sm-4">
			
		</div> -->
	</div>
	<div class="row footer">
		<div class="col-sm-12">
			경기도 성남시 분당구 삼평동 대왕판교로 670길 유스페이스2 B동 8층
				TEL. 031-606-9311~20 Copyright © 2020 KOSTA ALL RIGHTS RESERVED
		</div>
	</div>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>bootstrap grid test</title>
</head>
<body>
<%--	grid 그리드는 페이지 레이아웃 
		bootstrap의 container class를 활용해본다
		container는 고정 너비 레이아웃이다.
		container-fluid는 전체 너비 레이아웃이다.
--%>
<div class="continer-fluid">
<h2>부트스트랩 테스트</h2>
<div class="row">
<%--	col-sm*: 768px 이상이면 반영(태블릿 화면 사이즈 이상이면 적용됨) --%>
	<div class="col-sm-4" style="background-color:lavender,">.col-sm-4</div>
	<div class="col-sm-8" style="background-color:lime;">.col-sm-8</div>
</div>
</div>
</body>
</html>
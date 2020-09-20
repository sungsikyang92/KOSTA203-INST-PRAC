<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원관리홈</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"  href="${pageContext.request.contextPath}/css/myhome.css"/>
</head>
<body>
<div class="container">
<div class="row header">
	<div class="col-sm-12">
		<c:import url="/template/header.jsp"></c:import>
	</div>
</div>
<div class="row main">
	<div class="col-sm-8">
	<form action="${pageContext.request.contextPath}/front">
	<input type="hidden" name="command" value="findMemberById">
	아이디 <input type="text" name="id">
	<input type="submit" value="검색">
	</form> 
	</div>
	<div class="col-sm-4">
	<c:import url="/template/right.jsp"></c:import>
	</div>
</div>
<div class="row footer">
<div class="col-sm-12">
	<c:import url="/template/footer.jsp"></c:import>
</div>
</div>
</div>
</body>
</html>


















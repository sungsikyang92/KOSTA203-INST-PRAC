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
<title>회원가입</title>
<script type="text/javascript">
	function checkForm() {
		var f = document.registerForm;
		if (f.password.value != f.repeatPassword.value) {
			alert("패스워드와 패스워드 확인이 일치하지 않습니다");
			return false;
		}
		if (f.flag.value != f.id.value) {
			alert("인증받은 아이디가 아닙니다\n아이디 중복확인을 하세요");
			return false;
		}
	}
	function checkId() {
		var str = document.registerForm.id.value;
		if (str == "") {
			alert("아이디를 입력하세요!");
		} else {
			window.open("front?command=IdCheck&id=" + str, "popup",
					"width=200,height=200,top=150,left=400");
		}
	}
</script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<div class="row content">
			<div class="col-sm-9">
			<form method="post" name="registerForm" action="front"	onsubmit="return checkForm()">
			<input type="hidden" name="command" value="Register"> 
			<input type="hidden" name="flag" value="">
			<table>
					<tr>
						<td>아이디</td><td><input type="text" name="id" required="required">
						<input 	type="button" class="btn btn-success"value="중복확인" onclick="checkId()"></td>
					</tr>
					<tr>
						<td>패스워드</td><td><input type="password" name="password" required="required"></td>
					</tr>
					<tr>
						<td>패스워드확인</td><td><input type="password" name="repeatPassword" required="required"></td>
					</tr>
					<tr>
						<td>이름</td><td><input type="text" name="name" required="required"></td>
					</tr>
					<tr>
						<td>주소</td><td><input type="text" name="address" required="required"> </td>
					</tr>
					<tr>
						<td>생일</td><td><input	type="date" name="birthday" required="required"></td>
					</tr>
					<tr>
						<td colspan="2" align="left">
							<input type="submit" class="btn" value="회원가입">
						</td>
					</tr>
				</table>
			</form>					
			</div>
			<div class="col-sm-3 right">
				<jsp:include page="right.jsp"></jsp:include>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>







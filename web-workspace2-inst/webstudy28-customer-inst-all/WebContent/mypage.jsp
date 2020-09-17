<%@page import="model.CustomerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/mystyle.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<div class="row content">
			<div class="col-sm-9">
<%  HttpSession session=request.getSession(false);
	if(session!=null&&session.getAttribute("cvo")!=null){
	 CustomerVO vo=(CustomerVO)session.getAttribute("cvo");	 
%>
<h3>마이페이지</h3>
<table class="table table-bordered">
<tr>
	<td>아이디</td><td><%=vo.getId()%></td>
</tr>
<tr>
	<td>이름</td><td><%=vo.getName()%></td>
</tr>
<tr>
	<td>주소</td><td><%=vo.getAddress()%></td>
</tr>
<tr>
	<td>생일</td><td><%=vo.getBirthday2()%> 만<%=vo.getAge()%>세</td>
</tr>
<tr>
	<td>등록일시</td><td><%=vo.getRegdate() %></td>
</tr>
</table>
<%}else{ %>
		<script type="text/javascript">
			alert("login 하세요!");
			location.href="front?command=Home";
		</script>
<%} %>
			</div>
			<div class="col-sm-3 right">
				<jsp:include page="right.jsp"></jsp:include>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>








<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디검색실패</title>
<script type="text/javascript">
	alert("<%=request.getParameter("id")%>아이디를 가진 회원이 없습니다.");
	location.href="findmemberbyid.jsp";
</script>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<div class="container">
<a href="index.jsp">Home</a>
<hr>
</div>
</body>
</html>
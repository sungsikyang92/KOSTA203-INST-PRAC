<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step6-action</title>
</head>
<body>
<%	
	String name=request.getParameter("userName");
	int age=Integer.parseInt(request.getParameter("userAge"));
%>
<%if(age<=19){ %>
	<script type="text/javascript">
		alert("<%=name%>님! <%=age%>살이네? 나이 더 먹고 오세요!");
		location.href="step6-child.jsp";
	</script>
	<%}else{ %>
	<%=name %>님! 즐거운 성인영화 관람하세요!
	<%} %>
</body>
</html>
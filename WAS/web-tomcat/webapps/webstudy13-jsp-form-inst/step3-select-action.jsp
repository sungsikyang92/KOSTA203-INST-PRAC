<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step3-select-action</title>
</head>
<body>
<%  int line=Integer.parseInt(request.getParameter("line"));
	 if(line<5){	
%>			코레일 <%=line%>호선을 선택하셨습니다.
<%	 }else{ %>
			도시철도 <%=line%>호선을 선택하셨습니다. 
<%	 } %>
</body>
</html>













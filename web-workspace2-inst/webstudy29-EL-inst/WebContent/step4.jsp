<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ServletContext initParameter Test</title>
</head>
<body>
<%-- ServletContext의 초기파라미터에 접근하여 출력 --%>
<%=application.getInitParameter("adminEmail")%>
<br>
${initParam.adminEmail}
</body>
</html>










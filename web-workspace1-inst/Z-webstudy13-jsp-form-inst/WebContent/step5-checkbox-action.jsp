<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step5-checkbox-action.jsp</title>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
<table>
	<thead>
		<tr>
			<th>순번</th><th>메뉴명</th>
		</tr>
	</thead>
	<tbody>
		<%-- tr td 를 동적으로 보여준다  --%>
		<% String menuArray[]=request.getParameterValues("menu");
			for(int i=0;i<menuArray.length;i++){
		%>	<tr>
				<td><%=i+1%></td><td><%=menuArray[i]%></td>
			</tr>
		<%} %>
	</tbody>
</table>
</body>
</html>







<%@page import="model.MemberVO"%>
<%@page import="org.eclipse.jdt.internal.compiler.ast.MemberValuePair"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step8-list</title>
<link type="text/css" rel="stylesheet" href="css/mystyle.css">
</head>
<body>
<%
	ArrayList<MemberVO> list=new ArrayList<MemberVO>();
	list.add(new MemberVO("java","김수민","판교","남"));
	list.add(new MemberVO("tomcat","아이유","강남","여"));
	list.add(new MemberVO("model2","김수민","종로","여"));
%>
<table>
	<thead>
		<tr>
			<th>순번</th><th>이름</th><th>주소</th><th>성별</th>
		</tr>
	</thead>
	<tbody>
		<%for(int i=0;i<list.size();i++){ %>
		<tr>
			<td><%=i+1 %></td>
			<td><a href="step8-action.jsp?id=<%=list.get(i).getId() %>"><%=list.get(i).getName() %></a></td>
			<td><%=list.get(i).getAddress() %></td>
			<td><%=list.get(i).getGender() %></td>
		</tr>
		<%} %>
	</tbody>
</table>
</body>
</html>
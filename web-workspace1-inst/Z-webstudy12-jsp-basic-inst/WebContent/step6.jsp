<%@page import="model.Person"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp ArrayList test</title>
<style type="text/css">
	table {
		border-collapse: collapse;
	}
	table,td,th{
		border: 1px solid black;
	}
	td,th{
		padding: 10px;
	}
</style>
</head>
<body>
<%
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(new Person("아이유",28));
		list.add(new Person("장기하",38));
		list.add(new Person("김수민",21));
%>
<table>
	<thead>
		<tr>
			<th>순번</th><th>이름</th><th>나이</th>
		</tr>
	</thead>
	<tbody>
	<% for(int i=0;i<list.size();i++){ %>
		<tr>
			<td><%=i+1%></td>
			<td><%=list.get(i).getName() %></td>
			<td><%=list.get(i).getAge() %></td>
		</tr>
	<%} %>
	</tbody>
</table>
</body>
</html>








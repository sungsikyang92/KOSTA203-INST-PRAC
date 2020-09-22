<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th><th>제품명</th><th>제조사</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.itemDTO}" var="list">
			<tr>
				<td>${list.itemNo}</td>
				<td><a href="${pageContext.request.contextPath}/front?command=itemDetail&name=${list.name}">${list.name}</a></td>
				<td>${list.maker}</td>
			</tr>	
			</c:forEach>
		</tbody>
	</table>

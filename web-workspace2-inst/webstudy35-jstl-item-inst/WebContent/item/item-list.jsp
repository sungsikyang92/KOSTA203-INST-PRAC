<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>     
<table class="table table-hover table-bordered">
	<thead>
		<tr>
			<th>번호</th><th>상품명</th><th>제조사</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${requestScope.list}" var="item">
		<tr>
			<td>${item.itemNo}</td>
			<td>${item.name}</td> <%-- ItemDetailController(command=ItemDetail)로 링크  --%>
			<td>${item.maker}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
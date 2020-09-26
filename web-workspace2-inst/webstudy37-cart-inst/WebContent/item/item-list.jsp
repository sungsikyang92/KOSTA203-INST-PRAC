<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table class="table table-hover table-bordered">
	<thead>
		<tr class="info">
			<th>번호</th>
			<th>상품명</th>
			<th>제조사</th>
		</tr>
	</thead>
	<tbody>
		<%-- ItemDetailController(command=ItemDetail)로 링크  --%>
		<c:forEach items="${requestScope.list}" var="item">
			<tr>
				<td>${item.itemNo}</td>
				<td>
<a 	href="${pageContext.request.contextPath}/front?command=ItemDetail&itemNo=${item.itemNo}">${item.name}</a></td>
				<td>${item.maker}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>











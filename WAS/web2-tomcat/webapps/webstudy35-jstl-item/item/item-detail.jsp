<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped">
	<tr>
		<td>NO</td><td>${requestScope.dto.itemNo}</td>
	</tr>
	<tr>
		<td>Name</td><td>${requestScope.dto.name}</td>
	</tr>
	<tr>
		<td>Maker</td><td>${requestScope.dto.maker}</td>
	</tr>
	<tr>
		<td>price</td><td>${requestScope.dto.price}</td>
	</tr>
	<tr>
		<td>Detail</td><td>${requestScope.dto.detail}</td>
	</tr>
</table>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<table class="table">
		<tr >
			<td>글번호 ${requestScope.pvo.no }</td>
			<td>제목: ${requestScope.pvo.title} </td>
			<td>작성자 :  ${requestScope.pvo.memberVO.name }</td>
			<td>조회수 : ${requestScope.pvo.hits }</td>
			<td>${requestScope.pvo.timePosted }</td>
		</tr>		
		<tr>
			<td colspan="5" >
			<pre>${requestScope.pvo.content}</pre>
			</td>
		</tr>		
	</table>
	
	
	
	
	
	
	
	
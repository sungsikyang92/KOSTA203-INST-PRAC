<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<div class="container">
	<div class="col-sm-12">
		${requestScope.tablenum}번 테이블
	</div>
	<div class="col-sm-12">
		직원을 호출합니다.
	</div>
	<div class="col-sm-6">
		<input type="button" value="식사류">	
	</div>
	<div class="col-sm-6">
		<input type="button" value="주류">
	</div>
</div>
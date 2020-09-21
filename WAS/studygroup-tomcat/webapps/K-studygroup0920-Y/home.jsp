<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container">
	<div class="center">이게 대문이다! home jsp!!</div>
</div>
<div class="container">
<div class="col-sm-6">
	<a href="${pageContext.request.contextPath}/front?command=guestEnter"><input type="button" value="GUEST"></a>
</div>
<div class="col-sm-6">
	<a href="${pageContext.request.contextPath}/front?command=adminEnter"><input type="button" value="ADMIN"></a>
</div>
</div>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>     
<form action="${pageContext.request.contextPath}/front" method="post">
<input type="hidden" name="command" value="ItemRegister">
상품아이디 <input type="text" name="productId"><br>
<input type="submit" value="등록">
</form>
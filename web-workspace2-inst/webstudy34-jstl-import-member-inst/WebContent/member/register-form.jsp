<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>  
<%--
		command=register -- RegisterController-- MemberDAO register
									|
									|  redirect ( 재동작 방지 ) 
									|
								RegisterResultController 
								    | 	forward 
								member/register-result.jsp (레이아웃 적용되야 함)	
 --%>   
<form action="${pageContext.request.contextPath}/front" method="post">
<input type="hidden" name="command" value="register">
아이디 <input type="text" name="id" required="required"><br>
패스워드 <input type="password" name="password" required="required"><br>
이름 <input type="text" name="name" required="required"><br>
주소 <input type="text" name="address" required="required"><br>
<input type="submit" value="회원가입">
</form>




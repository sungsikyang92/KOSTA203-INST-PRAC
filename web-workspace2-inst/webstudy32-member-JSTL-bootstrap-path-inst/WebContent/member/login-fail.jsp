<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>     
<script>
	alert("로그인 실패!");
	location.href="${pageContext.request.contextPath}/front?command=home";
</script>
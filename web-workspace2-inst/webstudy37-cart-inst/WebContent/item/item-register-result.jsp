<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>     
<script>
	alert("상품등록완료!");
	location.href="${pageContext.request.contextPath}/front?command=home";
</script>
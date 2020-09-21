<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
Table No.&nbsp;&nbsp;
<form action="front">
<input type="hidden" name="command" value="tablenumber">
<input type="number" name="tablenum" required="required">
<input type="submit" value="확인">
</form>

<%-- 테이블 넘버 적은게 --%>
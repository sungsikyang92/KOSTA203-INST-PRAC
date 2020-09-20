<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
		로그인 실패하면 member/login-fail.jsp 에서 alert으로 
		로그인 실패 ,  index로 이동시키고 
		로그인 성공하면 index로 이동시킨다. 
		로그인 전에는 로그인 폼만 제공 
		로그인 후에는 아이유님 로그인 
		회원검색 
		주소리스트 가 제공 
		
		로그아웃하면 다시 index로 이동 
		로그인 폼만 제공된다 
 --%>
<c:choose>
	<c:when test="${sessionScope.mvo==null}">
		<form method="post" action="${pageContext.request.contextPath}/front">
			<input type="hidden" name="command" value="login">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id" required="required"></td>
				</tr>
				<tr>
					<td>패스워드</td>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="로그인"></td>
				</tr>
			</table>
		</form>
	</c:when>
	<c:otherwise>
		${sessionScope.mvo.name}님 로그인 <br>
		<a href="${pageContext.request.contextPath}/front?command=logout">로그아웃</a>
		<br>
		<a href="${pageContext.request.contextPath}/member/findbyid-form.jsp">회원검색</a>
		<br>
		<a	href="${pageContext.request.contextPath}/front?command=getAddressKind">주소리스트</a>
	</c:otherwise>
</c:choose>





















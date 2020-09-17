<%@page import="model.CustomerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<%
	HttpSession session = request.getSession(false);
if (session != null && session.getAttribute("cvo") != null) {
	CustomerVO vo = (CustomerVO) session.getAttribute("cvo");
%>
<%=vo.getName()%>님 로그인
<br>
<br>
<a href="front?command=Logout">로그아웃</a>
<br>
<br>
<a href="front?command=MyPage">마이페이지 </a>
<%
	} else {
%>
<a href="register.jsp">회원가입</a>
<br>
<br>
<form method="post" action="front">
	<input type="hidden" name="command" value="Login"> <input
		type="text" name="id" placeholder="Enter ID"><br>
	<br> <input type="password" name="password"
		placeholder="Enter PASS"><br>
	<br> <input type="submit" class="btn" value="로그인">
</form>
<%
	}
%>
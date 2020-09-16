<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제조사 리스트</title>
</head>
<body>
<%		@SuppressWarnings("unchecked")
		ArrayList<String> list=(ArrayList<String>)request.getAttribute("list");
%>
<form action="front">
<input type="hidden" name="command" value="findproductlistbymaker">
<%-- db web_product table에 저장된 maker 종류를 아래의 radio button으로 제공 --%>
<% for(String maker:list){ %>
		<input type="radio" name="maker" value="<%=maker%>"
			required="required"><%=maker%><br>
<%} %>
<input type="submit" value="maker별 검색">
</form>
<%--		
   maker-form.jsp --command=findproductlistbymaker --> FindProductListByMakerController<-->ProductDAO
																	|									   findProductListByMaker(maker)
																	forward
																	|
																	productbymaker-list.jsp
																	
																	ID, NAME, MAKER, PRICE
																	다 보여준다 	
 --%>
</body>
</html>













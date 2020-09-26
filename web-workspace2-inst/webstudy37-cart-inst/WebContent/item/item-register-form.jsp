<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>   
<%--
			RegisterItemController - ItemDAO registerItem(dto)
				|
				| redirect 
			item/item-register-result.jsp   alert() 상품등록완료 후  home 으로 이동 
 --%>  
<form method="post" action="front">
<input type="hidden" name="command" value="RegisterItem">
<table class="table table-bordered detailTable">
	<tr>
		<td>name</td><td><input type="text" name="name" required="required"></td>
	</tr>
	<tr>
		<td>maker</td><td><input type="text" name="maker" required="required"></td>
	</tr>
	<tr>
		<td>price</td><td><input type="number" name="price" required="required"></td>
	</tr>
	<tr>
		<td>detail</td><td><textarea rows="5" cols="30" required="required" name="detail"></textarea></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="상품등록">
		</td>
	</tr>
</table>
</form>
















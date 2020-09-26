<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<script>
	function deleteItem(){
		if(confirm("장바구니에서 상품을 삭제하시겠습니까?")){
			//alert(document.getElementById("deleteItemForm"));
			document.getElementById("deleteItemForm").submit();
		}
	}
</script>
<c:choose>
	<c:when test="${empty sessionScope.memberDTO.cart.itemList}">
	상품없음^^
	</c:when>
	<c:otherwise>
	<table class="table table-hover table-bordered detailTable">
	<caption>장바구니</caption>
	<c:forEach items="${sessionScope.memberDTO.cart.itemList}" var="item">
	<tr>
		<td>${item.itemNo}</td><td>${item.name}</td>
		<td>${item.maker}</td><td>${item.price}</td>
		<td>
			<form action="front" method="post" id="deleteItemForm">
			<input type="hidden" name="command" value="deletecart">
			<input type="hidden" name="itemNo" value="${item.itemNo}">
			<input type="button" onclick="deleteItem()" value="삭제">
			</form>
		</td>
	</tr>	
	</c:forEach>
	<tr>
		<td colspan="5" align="center">
		총액:${sessionScope.memberDTO.cart.totalPrice}
		</td>
	</tr>
	</table>
	</c:otherwise>
</c:choose>











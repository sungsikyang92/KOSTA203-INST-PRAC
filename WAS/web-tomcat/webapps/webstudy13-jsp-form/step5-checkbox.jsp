<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checkbox</title>
<script type="text/javascript">
	function orderMenu(){
		var menuComp=document.getElementsByName("menu");
		//alert(menuComp.length);  //3이 떠야 위에 문장이 정상 작동 한다.
		var flag=false;
		for(var i=0;i<menuComp.length;i++){
			if(menuComp[i].checked){
				flag=true;
				break;
			}//if
		}//for
		if(flag===false){
			alert("메뉴를 선택하세요!");
		}//if
		return flag;
		/*
		var om=document.order;
		if(om.menu.value===""){
			alert("메뉴를 선택하세요!");
			return false;
			break;
		}else{
			om.submit();
		}*/
	}
</script>
</head>
<body>
<%
	ArrayList<String> list=new ArrayList<String>();
	list.add("삼겹살");
	list.add("꽃등심");
	list.add("전어회");
%>
<%--step1. ArrayList를 활용해 checkbox를 동적으로 생성한다.
	step2. javascript로 체크박스를 하나 이상 선택했을 때 서버에 전송한다.
			만약 아무 메뉴도 선택하지 않을 경우 alert로 메뉴를 선택하세요 띄우고 전송하지 않는다.
	step3. 'step5-checkbox-action.jsp'에서 전송받는 메뉴 정보를 테이블 형식으로 화면에 보여준다.
--%>
<form action="step5-checkbox-action.jsp" name="order" onsubmit="return orderMenu()">
<%for(int i=0;i<list.size();i++){ %>
<input type="checkbox" name="menu" value="<%=list.get(i) %>"><%=list.get(i) %><br>
<%} %>
<input type="submit" value="주문">
</form>
</body>
</html>
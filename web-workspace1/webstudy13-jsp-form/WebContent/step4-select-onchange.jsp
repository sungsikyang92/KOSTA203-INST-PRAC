<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<String> list=new ArrayList<String>();
	list.add("강아지풀");
	list.add("캐모마일");
	list.add("해바라기");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step4-select-onchange</title>
<script type="text/javascript">
	function sendFlower(){
		var f=document.FlowerForm;
		if(f.flower.value===""){
			alert("옵션을 선택하세요!")
		}else{
			//폼객체.submit()   서버를전송시키는애임
			f.submit();
		}
	}
</script>
</head>
<body>
<form action="step4-select-action.jsp" name="FlowerForm">
<select name="flower" onchange="sendFlower()">
<option value="">--꽃--</option>
<%for(int i=0;i<list.size();i++){ %>
<option value="<%=list.get(i) %>"><%=list.get(i) %></option>
<%} %>
</select>
</form>
</body>
</html>
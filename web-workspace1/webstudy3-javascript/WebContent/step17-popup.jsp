<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>팝업창</title>
<script type="text/javascript">
	function closePopup(){
		opener.document.testForm.nickName.value="";
		opener.document.testForm.nickName.focus();
		opener.document.testForm.flag.value="ok";
		self.close();
	}
</script>
</head>
<body bgcolor="yellow" onunload="closePopup()">
팝업창입니다.<br><br>
<input type="button" value="확인" onclick="closePopup()">
</body>
</html>
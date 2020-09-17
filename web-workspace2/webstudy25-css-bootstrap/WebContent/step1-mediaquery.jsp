<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>반응형웹 미디어쿼리 테스트</title>
<style type="text/css">
	body{
		background-color: olive;
	}
	/* 	부트스트랩 프레임워크 sm(768이상), md(922이상), lg(1200이상)
		768너비부터 yellow
	*/
	@media(min-width:768px){
	body{
		background-color: yellow;
		}
	}
	@media(min-width:992px){
	body{
		background-color: lime;
		}
	}
	@media(min-width:1200px){
	body{
		background-color: orange;
		}
	}
</style>
</head>
<body>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품관리</title>
</head>
<body>
	<h4>Model2(MVC+FrontController) 상품관리</h4>
	<ul>
		<%-- 
					DispatcherServlet에서 요청처리(TotalCountController) 후
					count-view.jsp 에서 응답
		 --%>
		<li><a href="front?command=totalCount">전체상품수조회</a></li>
		<li><a href="find-product-form.jsp">상품검색</a></li>
		<%--
				index -- front --HandlerMapping--ProductListController--ProductDAO
																				   getAllProductList() 
							| forward
						  product-list.jsp 
						  
				command=getallproductlist		  
		 --%>
		<li><a href="front?command=getallproductlist">전체상품리스트</a></li>
		<%--
				command=getmakerlist  --> MakerKindController <--> ProductDAO
												|
												 forward 
												|
												maker-form.jsp 
												( 제조사를 라디오 버튼으로 보여준다 )  
		 --%>
		<li><a href="front?command=getmakerlist">제조사 리스트보기 </a></li>
		<li><a href="register-product.jsp">상품등록화면</a></li>
	</ul>
</body>
</html>















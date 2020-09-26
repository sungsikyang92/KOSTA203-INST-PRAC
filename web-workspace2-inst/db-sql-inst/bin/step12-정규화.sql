/*
 	 정규화 (Normalization) : 데이터 중복을 최소화하고 
 	 						    데이터의 무결성 및 안정성을 보장하기 위해
 	 						    테이블을 분해하는 과정을 말한다 
 	 제 1 정규형 ( 1NF (Normal Form) ) 
 	 :  복수의 속성값을 갖는 속성을 분리 
 	 	도메인이 원자값 ( 도메인이란 데이터를 의미 ) 
 	 	ex) 주문서에서 주문상품의 상품명,상품상세내역 등이 복수로 입력되어서는 안된다 -> 주문과 주문상세로 분리
 	 	
 	 제 2 정규형 ( 2NF ) 
 	 : 주 식별자에 완전 종속되지 않는 속성을 분리 
 	    부분함수적 종속을 분리하여  완전 함수적 종속 상태로 만들어야 한다 
 	    ex)  주문상세테이블에서는 주문번호와 상품번호가 복합 PK 이다 
 	    	  여기에 상품명, 상품상세정보 , 단가와 같은 컬럼(속성)은 복합 PK에 완전 함수적 종속이 아니라
 	    	  상품아이디에만 부분함수적 종속이므로 분리해야 한다 
 	    	  완전함수적 종속 컬럼(속성)은 주문수량 컬럼이 해당된다  
 	    
 	 제 3 정규형 ( 3NF )  
 	 : 일반 속성에 종속적인 속성을 분리 
 	    이행적 함수 종속성을 분리 ( A -> B 이면 B -> C 이고  A -> C 이다 ) 
 	    ex)  주문 테이블에 담당부서번호, 담당부서명, 담당부서전화번호, 담당부서지역이 있다면
 	    	  이행적 함수 종속성이라고 볼 수 있다 
 	    	  주문번호에 종속되는 것이 아니라 일반 컬럼인 부서번호에 담당부서명, 담당부서전화번호, 담당부서지역
 	    	  와 같은 속성은 종속된다. 이를 별도의 부서 테이블로 분리하는 것을 3정규형이라고 한다 
 	    
 	    
 	 참고 ) 반정규화 : 시스템 성능 향상 , 개발 및 운영 편의성을 위해 
 	 				    정규화된 모델을 통합, 분할하는 과정으로
 	 				    의도적으로 정규화 원칙을 위배하는 행위이다 
 */













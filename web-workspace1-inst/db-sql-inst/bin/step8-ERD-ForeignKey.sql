/*
	ERD , Foreign key , Join 	
	
	ERD ( Entity Relationship Diagram ) 
	: 개체 관계 모델링 , 관계형 데이터베이스 설계를 위한 다이어그램	
	
	논리 데이터 모델링 
	- 논리적인 데이터 관리 및 관계를 정의한 모델.
	  전체 업무 범위와 업무 구성요소를 정의하고 확인할 수 있다. 
	
	물리 데이터 모델링 
	- 논리 데이터 모델을 DBMS 특성에 맞게 구체화시킨 모델을 말한다 
	
	식별관계 (identified relationship): 부모 테이블의 기본키 혹은 복합키가 
										  자식 테이블의 기본키 혹은 복합키의 구성원으로
										  전이되는 관계 ( ex - 사원과 신체정보 ) 
	
	비식별관계(non-identified relationship): 부모 테이블의 기본키 혹은 복합키가 
												자식 테이블의 일반속성으로 전이되는 관계 
												(ex - 부서와 사원정보 ) 
	
	
	정규화 ( Normalization ) - 데이터베이스 설계시 중복을 최소화하도록 데이터를 구조화하는 작업.
	
	사례 )  사원정보를 저장하는 테이블 설계 
			사원번호 , 사원명 , 직종 , 월급 , 부서명, 부서지역, 부서대표번호 ... 
			
			실제 데이터 
			1		 아이유		개발	1000	연구개발부	  판교	   0311231234 ..
			2		 김수민		개발     2000   공공사업부	  광화문    024321321 .. 
			
			위와 같은 형태로 테이블을 설계하면 중복된 부서정보가 반복적으로 저장
			부서정보 수정시 다수의 정보가 변경되어야 한다 
			
			위 사원 테이블을 분할 -> 정규화 (중복 데이터를 제거) 
			
			부서테이블 				사원테이블 
						 |------0|<-
					
			부서는 사원을 0명에서 다수 사원을 보유할 수 있다 
			사원은 반드시 하나의 부서에 속해야 한다 			 	 
			
			사원 테이블 
			사원번호   사원명 	월급    부서번호    시력  키   몸무게  질환
			
			위 테이블도 분할이 필요 ( 사원의 신체정보는 특정한 경우에 필요시만 조회 ) 
			
			사원테이블 	 신체정보테이블 로 분할하는 것이 바람직하다 
							( 사원번호가 외래키Foreign key로 설정)
							
	Foreign key (외래키) : 참조 무결성을  위한 제약조건 
							 다른 테이블 정보를 참조하기 위해 사용 
							ex)   사원 테이블과 신체정보 테이블이 있고
								   신체정보 테이블에서 
								   무결성을 보장하는 데이터를 저장하기 위해서는  
								   사원 테이블의 pk인 사원번호를 참조해야 한다
								   (제약조건 Foreign key를 설정)					   						
							
*/
DROP TABLE departement;

CREATE TABLE department(
	deptno NUMBER PRIMARY KEY,
	dname VARCHAR2(100) NOT NULL,
	loc VARCHAR2(100) NOT NULL,
	tel VARCHAR2(100) NOT NULL
)
DROP TABLE k_employee;

CREATE TABLE k_employee(
	empno number PRIMARY KEY,
	ename VARCHAR2(100) NOT NULL,
	sal NUMBER NOT NULL,
	deptno NUMBER NOT NULL,
	CONSTRAINT fk_deptno FOREIGN KEY(deptno) REFERENCES department(deptno)
)
-- CONSTRAINT 제약조건명 FOREIGN KEY(컬럼명) REFERENCES 참조테이블명(컬럼명)
-- 참조 대상 테이블 ( department )을 부모 테이블이라고 하고 
-- 참조하는 테이블 ( k_employee ) 을 자식 테이블이라고 한다 
-- 자식 테이블은 FOREIGN KEY 가 존재하는 테이블이다. 
-- 테이블 생성은 반드시 부모 테이블을 먼저 만들고 이후에 자식테이블을 생성해야 한다 

-- ERROR : 참조 무결성 제약 조건을 위배 parent key not found 
-- FOREIGN KEY 제약조건에 의해 부서테이블에 존재하지 않는 부서번호를 입력하려 하여 에러
INSERT INTO k_employee(empno,ename,sal,deptno)
VALUES(1,'김수민',500,10);
INSERT INTO k_employee(empno,ename,sal,deptno)
VALUES(2,'송영섭',1000,10);
INSERT INTO k_employee(empno,ename,sal,deptno)
VALUES(3,'정재우',800,20);

INSERT INTO department(deptno,dname,loc,tel)
VALUES(10,'전략기획','판교','031');
INSERT INTO department(deptno,dname,loc,tel)
VALUES(20,'공공사업','종로','02');
INSERT INTO department(deptno,dname,loc,tel)
VALUES(30,'해양수산','부산','051');

SELECT COUNT(*) FROM department; -- 3 
SELECT * FROM k_employee;

------------------------------------------
-- 김수민 사원의 사원번호, 사원명 , 월급 , 부서번호 , 부서명 , 지역을 조회하고자 한다 
SELECT * FROM k_employee;
SELECT * FROM department WHERE deptno=10;
-- 위 두 SQL 을 하나의 SQL로 표현 
/*
 	JOIN SQL : 하나 이상의 테이블 간의 정보를 결합하기 위한 SQL 
 	EX) 김수민 사원 정보 및 사원이 속한 부서 정보를 함께 조회하기 위해 JOIN SQL을 이용 
 		  k_employee 테이블과 departement 테이블을 결합하여 조회 
 	
 	SELECT 별칭.컬럼명, 별칭.컬럼명, 별칭.컬럼명 
 	FROM 테이블명 별칭 , 테이블명 별칭 
 	WHERE 별칭.컬럼명 = 별칭.컬럼명  --> 조인조건 
 	
 	조인 이용시에는 별칭을 권장 . 각 테이블에 컬럼명이 중복될 수 있기 때문. 
*/
-- SELECT e.* , d.*
SELECT e.empno,e.ename,e.sal,e.deptno,d.deptno,d.dname,d.loc
FROM k_employee e , department d
WHERE e.deptno=d.deptno

-- empno 가 2 인 사원의 ename 과 dname 을 조회하세요 ( join 이용 ) 
SELECT e.ename,d.dname
FROM	k_employee e, department d
WHERE e.deptno=d.deptno AND e.empno=2;

SELECT e.*,d.*
FROM	k_employee e, department d
WHERE e.deptno=d.deptno AND e.empno=2;



















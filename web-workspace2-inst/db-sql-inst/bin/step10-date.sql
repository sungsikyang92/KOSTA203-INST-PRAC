/*  date 타입 : 데이터베이스 시간 ( 년 , 월 , 일 , 시, 분 , 초 ) 을 관리하는 타입
 *  주요 함수 
 *  1. TO_CHAR() : 데이터베이스에 저장된 DATE형의 정보를 문자열로 반환받을 때 사용 
 *  2. TO_DATE() : 문자타입의 시간 정보를 데이터베이스의 DATE형으로 변환해 저장할 때 사용 
 *  
 *  sysdate 키워드 : 현재 시간을 표현하는 키워드 
 * 
 *  dual 테이블(오라클에서 제공하는 기본테이블)을 이용해서 현재 시간을 조회 
 */
SELECT sysdate FROM DUAL;
-- TO_CHAR() : 원하는 시간 포맷을 설정해 문자열로 반환받는 함수 
SELECT TO_CHAR(sysdate,'YYYY-MM-DD') FROM DUAL;
SELECT TO_CHAR(sysdate,'YYYY. MM. DD') FROM DUAL;
SELECT TO_CHAR(sysdate,'YYYY') FROM DUAL;
SELECT TO_CHAR(sysdate,'MM') FROM DUAL;
SELECT TO_CHAR(sysdate,'DD') FROM DUAL;
SELECT TO_CHAR(sysdate,'HH24:MI:SS') FROM DUAL;
SELECT TO_CHAR(sysdate,'HH:MI:SS') FROM DUAL;
SELECT TO_CHAR(sysdate,'DAY') FROM DUAL; -- 요일 
-- 년 월 일 시 분 초 
SELECT TO_CHAR(sysdate,'YYYY/MM/DD HH24:MI:SS') FROM DUAL;

-- 실제 테이블을 생성해서 테스트 
CREATE TABLE date_test(
	id VARCHAR2(100) PRIMARY KEY,
	mydate DATE NOT NULL
)
-- INSERT   : id java mydate 현재시간을 저정 
INSERT INTO date_test(id,mydate) VALUES('java',sysdate);
SELECT * FROM date_test;
-- 년.월.일 만 조회 ( TO_CHAR() 를 이용 ) 
SELECT id,TO_CHAR(mydate,'YYYY.MM.DD') FROM date_test;
/*	TO_DATE(시간정보,시간포맷)
 *  : 문자형 데이터를 DATE형으로 변환 
 * 	  
 *    웹어플리케이션에서 시간 정보를 전달받아 DB에 저장하기 위해 주로 사용 
 */
INSERT INTO date_test(id,mydate) VALUES('jstl',TO_DATE('2020.9.1','YYYY.MM.DD'));

INSERT INTO date_test(id,mydate) 
VALUES('ajax',TO_DATE('1989.1.7 5:20:33','YYYY.MM.DD HH24:MI:SS'));

-- DATE 형 데이터 연산 

-- 하루전 
SELECT id,  mydate , mydate-1 FROM date_test; 
-- 현재시간과 저장시간의 일수를 확인 
SELECT id,  mydate , sysdate-mydate FROM date_test; 
-- 소수점 이하는 버리겠다  trunc() 
SELECT id,  mydate , trunc(sysdate-mydate) FROM date_test; 
-- 몇개월차이 months_between(현재시간,등록시간) 
SELECT id,  mydate , trunc(months_between(sysdate,mydate)) FROM date_test; 
-- 몇년차이 
SELECT id,  mydate , trunc(months_between(sysdate,mydate)/12) FROM date_test;



















/*
 *	SQL 여러줄 주석 
 */
--SQL 한줄 주석

/*	SQL(Structured Quert Language): database를 제어하는 언어
 * 
 * 	DDL, DML, DCL
 * 
 * 	1. DDL(Data Definition Language)
 * 		:CREATE 생성, DROP 삭제, ALTER 수정
 * 
 * 	2. DML(Data Manipulation Language)
 * 		:INSERT 삽입, DELETE 삭제, UPDATE 수정, SELECT 검색
 * 		 CRUD(Create Read Update Delete)
 * 			  INSERT SELECT UPDATE DELETE
 * 
 * 	3. DCL(Data Control Language)
 * 		:COMMIT 실제 DB에 반영한다, ROLLBACK 작업을 취소하고 되돌린다.
 * 
 * 	TABLE - 데이터를 저장하는 공간
 * 	COLUMN - 속성(Attribute)
 * 	CONSTRAINT - 제약조건 ex)PRIMARY KEY - 중복을 허용하지 않는다, NOT NULL
 * 	Datatype - 문자열 varchar2(100), 숫자형 number
 */

--MEMBER TABLE을 생성하고 정보를 저장한 후 조회해본다.
--실행 단축키 영역 지정후 ALT+X
CREATE TABLE member(
	id VARCHAR2(100)PRIMARY KEY,
	password VARCHAR2(100)NOT NULL,
	name VARCHAR2(100)NOT NULL,
	address VARCHAR2(100)
)
DROP TABLE member;--테이블 삭제DDL
--DML:INSERT 테이블 MEMBER에 정보를 추가
INSERT INTO member(id,password,name,address)VALUES('java','1234','아이유','판교')
--DML:SELECT 테이블 MEMBER에 있는 모든 정보를 조회
SELECT*FROM member;
--자기 정보를 INSERT해본다
INSERT INTO member VALUES('sik','8670','양성식','수원')
INSERT INTO member VALUES('ljw','kosta','이진욱','분당');
--제약조건 PRIMARY KEY는 중복된 값을 허용하지 않으므로 아래 SQL은 ERROR가 난다.
INSERT INTO member VALUES('ljw','test'',test','test');
INSERT INTO member VALUES('LJW','test'',test','test');
--총회원수를 조회해본다 COUNT(*)
SELECT COUNT(*)FROM member;
--DML:UPDATE정보를 수정
UPDATE member SET address='하와이'WHERE id='ljw'
--DML:SELECT, WHERE절을 이용해 ljw이라는 아이디를 회원 정보만 조회
SELECT*FROM member WHERE id='ljw';
--DML:DELETE 정보를 삭제
DELETE FROM member WHERE address='하와이';
--총회원수 조회
SELECT COUNT(*)FROM member;
--MEMBER TABLE의 정보를 조회시 회원의 NAME과 ADDRESS만 조회
SELECT name, address FROM member;
--SELECT시 WHERE 컬럼=머머 AND 컬럼=머머
--NAME이 아이유이고 ADDRESS가 판교인 회원의 ID를 조회해본다
SELECT id FROM member WHERE name='아이유' AND address='판교';
--제약조건 테스트: PRIMARY KEY로 지정된 컬럼은 유일해야(UNIQUE)하며 NOT NULL
			-- 이여야 하므로 반드시 중복되지 않은 정보를 저장해야 한다.
INSERT INTO member(password,name,address)VALUES('A','옹성우','판교');--PRIMARY KEY인 ID가 없으므로 저장 불가
--PASSWORD 컬럼에 NOT NULL 제약조건이 있으므로 반드시 INSERT해야함으로 ERROR.
INSERT INTO member(id,name,address)VALUES('A','옹성우','판교');
--ADDRESS는 PRIMARY KEY 혹은 NOT NULL이 아님으로 없어도 추가가능
INSERT INTO member(id,password,name)VALUES('A','a','옹성우');
SELECT*FROM member;
/*	1. 회원 정보 두 명을 입력
 * 
 * 	ID				PASSWORD				NAME				ADDRESS
 * 	spring			aop						고슬링				뉴욕
 * 	mybatis			di						양성식				뉴욕
 * 
 * 	2. INSET 구문 실행 후 뉴욕에 사는 회원의 이름만 출력(SELECT)
 * 
 * 	3. ADDRESS가 뉴욕인 회원들의 ADDRESS를 워싱턴으로 수정(UPDATE)
 * 
 * 	4. 전체 회원 정보를 조회
 */
INSERT INTO member(id,password,name,address)VALUES('spring','aop','고슬링','뉴욕');
INSERT INTO member VALUES('mybatis','di','양성식','뉴욕');
UPDATE member SET address='워싱턴'WHERE address='뉴욕';
SELECT*FROM member;
COMMIT

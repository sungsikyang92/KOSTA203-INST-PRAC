/*
	SQL 여러줄 주석
*/

--SQL 한줄 주석

/*
*	SQL(Structured Query Language): 데이터를 정의하고, 조작, 제어하는 언어
*	
*	DDL, DML, DCL
*	1. DDL(Data Definition Language: 데이터 정의어)
*		:CREATE 생성, DROP 삭제, ALTER 수정
*
*+
*	2. DML(Data Manipulation Language: 데이터 조작어)
*		:INSERT 삽입, DELETE 삭제, UPDATE 수정, SELECT 검색
*		 CRUD(Create Read Update Delete)
*			  Insert Select Update Delete
*
*	3. DCL(Data Control Language: 데이터 제어어)
*		:COMMIT 실제 DB에 반영한다, ROLLBACK 작업을 취소하고 되돌린다
*		 GRANT 권한부여, REVOKE 권한취소
*
*	TABLE - 데이터를 저장하는 공간
*	COLUMN - 속성(attribute)
*	CONSTRAINT - 제약조건 ex)PRIMARY KEY - 중복 허용하지 않는다, NOT NULL
*	DataType - 문자열 varchar2(100), 숫자형 number	
*/

--MEMBER TABLE을 생성하고 정보를 저장한 후 조회해본다.
--실행 단축키 영역 지정 후 ALT+X
CREATE TABLE member(
	id VARCHAR2(100)PRIMARY KEY,
	password VARCHAR2(100)NOT NULL,
	name  VARCHAR2(100)NOT NULL,
	address VARCHAR2(100)
)
DROP TABLE member; --테이블 삭제 DDL
--DML:INSERT 테이블 MEMBER에 정보를 추가
INSERT INTO member(id,password,name,address)VALUES('java','1234','아이유','판교')
--DML:SELECT 테이블 MEMBER에 있는 모든 정보를 조회
SELECT*FROM member;
--자기 정보를 INSERT해본다
INSERT INTO member(id,password,name,address)VALUES('sik','8670','양성식','수원')
INSERT INTO member(id,password,name,address)VALUES('ljw','kosta','이진욱','분당')
--제약조건 PRIMARY KEY는 중복된 값을 허용하지 않으므로 아래 SQL을 ERROR가 난다.
INSERT INTO member(id,password,name,address)VALUES('ljw','test','test','test')
--총회원수를 조회해본다 COUNT(*)
SELECT COUNT(*)FROM member;
--DML:UPDATE정보를 수정
UPDATE member SET address='하와이'WHERE id='ljw';
--DML:SELECT, WHERE절을 이용해 ljw라는 아이디를 회원 정보만 조회
SELECT*FROM member WHERE id='ljw';
--DML:DELETE 정보를 삭제
DELETE FROM member WHERE address='하와이';
--총회원수 조회
SELECT COUNT(*)FROM member;
--MEMBER TABLE의 정보를 조회시 회원의 NAME과 ADDRESS만 조회
SELECT name,address FROM member;
--SELECT시 WHERE 컬럼=머머 AND 컬럼=머머
--NAME이 아이유이고 ADDRESS가 판교인 회원의 ID를 조회해본다
SELECT id FROM member WHERE name='아이유'AND address='판교';
--제약조건 테스트:PRIMARY KEY로 지정된 컬럼은 유일해야(UNIQUE)하며 NOT NULL
--			    이여야 하므로 반드시 중복되지 않은 정보를 저장해야 한다.
INSERT INTO member(password,name,address)VALUES('A','옹성우','판교');
--PASSWORD 컴럼에 NOT NULL제약조건이 있으므로 반드시 INSERT해야함으로 ERROR.
INSERT INTO member(id,name,address)VALUES('A','옹성우','판교');
INSERT INTO member(id,password,name)VALUES('A','a','옹성우');
--ADDRESS는 별도의 제약조건이 없으므로 NULL이 허용된다.
SELECT*FROM member;
/*	1.회원 정보 두 명을 입력
 * 
 *
*	ID 				PASSWORD 	NAME 		ADDRESS
*	spring			aop			고슬링		뉴욕
*	mybatis			di			양성식		뉴욕
*
*	2.INSERT 구문 실행 후 뉴욕에 사는 회원의 이름만 출력(SELECT)
*	
*	3.ADDRESS가 뉴욕인 회원들의 ADDRESS를 워싱턴으로 수정(UPDATE)
*	
*	4.전체 회원 정보를 조회
*/
INSERT INTO member(id,password,name,address)VALUES('spring','aop','고슬링','뉴욕');
INSERT INTO member(id,password,name,address)VALUES('mybatis','di','양성식','뉴욕');
--전체 COLUMN으로 사용할때 생략 가능하나 원칙적으로는 써줘야한다.
--INSERT INTO member VALUES('mybatis','di','양성식','뉴욕');
SELECT name FROM member WHERE address='뉴욕';
UPDATE member SET address='워싱턴' WHERE address='뉴욕';
SELECT*FROM member;

COMMIT --실제 데이터베이스에 반영(작업 정보를 저장)
ROLLBACK -- 커밋 이전의 모든 작업을 취소하고 되돌리는 명령어

	--	기본 SQL 리뷰
	INSERT INTO member(id,password,name,address)VALUES('ebs','abcd','펭수','양재');
	
	--	member 테이블에서 name이 펭수이고 address가 양재인 회원의 id를 조회
	SELECT id FROM member WHERE name='펭수'AND address='양재';
	--	member 테이블의 회원 주소 중 '양재'인 회원의 주소를 판교로 UPDATE
	UPDATE member SET address='판교'WHERE address='양재';
	SELECT*FROM MEMBER;
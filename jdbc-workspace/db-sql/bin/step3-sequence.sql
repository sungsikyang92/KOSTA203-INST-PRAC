/*
	오라클 시퀀스(sequence)
	:순차적으로 증가하는 유일한 값을 생성하기 위한 객체
	주로 primary key (unique + not null)를 생성하기 위해 사용하며, 테이블과는 독립적 구조이다.
	
	CREATE SEQUENCE 시퀀스명
	[ START WITH 시작번호 ]
	[ INCREMENT BY 증가값]
	[ MAXVALUE	      최대값]
	[ MINVALUE	      최소값]
	[CYCLE]	OR	[NOCYCLE]	//반복할것인지 여부
	[ NOCACHE]				//비정상 종료 시에도 SEQUENCE가 이어지도록
*/

--시퀀스 생성
CREATE SEQUENCE test_seq;

--시퀀스 삭제
DROP SEQUENCE test_seq;

/* Oracle dual table
	:오라클에서 제공하는 기본 테이블
	  컬럼 하나만 존재, 주로 시퀀스 또는 날짜함수, 산술연산에 사용
	 sys Admin 계정에서 관리하며, 수정 및 삭제 등 조작은 불가
*/

SELECT*FROM dual;

-- dual table을 이용해 새성한 시퀀스 값을 확인
-- 시퀀스: 시퀀스명.nextval → 다음 시퀀스 값을 생성(계쏙 값이 증가됨)
SELECT test_seq.nextval FROM dual;
-- 현재 값 보기 시퀀스명.currval → 하나의 커넥션에서 nextval후 currval만 가능
SELECT test_seq.currval FROM dual;
-- CAR table 생성해서 시퀀스 적용해보기
CREATE TABLE car(
	car_no NUMBER PRIMARY KEY, --시퀀스 자동발급
	model VARCHAR2(100) NOT NULL
)
-- car_seq 이름으로 시퀀스 생성
CREATE SEQUENCE car_seq;
--INSERT
INSERT INTO car(car_no, model) VALUES(car_seq.nextval, '소나타');
INSERT INTO car(car_no, model) VALUES(car_seq.nextval, '말리부');
SELECT*FROM car;

---------------------------
--# GUESTBOOK table로 실습#--
---------------------------
--GUESTBOOK table 생성
CREATE TABLE guestbook(
	guestbook_no NUMBER PRIMARY KEY,
	title VARCHAR2(100) NOT NULL,
	content VARCHAR2(1000) NOT NULL
)

--guestbook_seq 시퀀스 생성
CREATE SEQUENCE guestbook_seq;

--INSERT 구문 만들어보기
--guestbook_no은 시퀀스로 자동발급
--title: 즐거운8월
--content: 열공
INSERT INTO guestbook(guestbook_no, title, content) VALUES(guestbook_seq.nextval, '즐거운 8월', '열공');
INSERT INTO guestbook(guestbook_no, title, content) VALUES(guestbook_seq.nextval, '즐거운 9월', '빡공');
INSERT INTO guestbook(guestbook_no, title, content) VALUES(guestbook_seq.nextval, '즐거운 10월', '즐공');

--GUESTBOOK table 조회
SELECT*FROM guestbook;

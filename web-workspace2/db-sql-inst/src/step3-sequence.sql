/*  오라클 시퀀스(sequence)
 *  : 순차적으로 증가, 유일한 값을 생성하기 위한 객체 
 * 	  주로 primary key ( unique + not null ) 를 생성하기 위해 사용
 *    테이블과는 독립적 구조 
 * 
 *   CREATE SEQUENCE 시퀀스명 
 *   [START WITH 시작번호]
 *   [INCREMENT BY 증가값]
 *   [MAXVALUE 최대값] 
 *   [MINVALUE 최소값]
 *   [ CYCLE or NOCYCLE ] 
 *   [ NOCACHE ] 
 */
  -- 시퀀스 생성 
  CREATE SEQUENCE test_seq;
  -- 시퀀스 삭제 
  DROP SEQUENCE test_seq;
  /*	Oracle dual table 
   * 	: 오라클에서 제공하는 기본 테이블 
   * 	  컬럼 하나만 존재 , 주로 시퀀스 또는 날짜함수, 산술연산에 사용
   * 	  sys Admin 계정에서 관리, 수정 및 삭제 등 조작은 불가 
   */
  SELECT * FROM dual;
  -- dual table을 이용해 생성한 시퀀스 값을 확인 
  -- 시퀀스 : 시퀀스명.nextval -> 다음 시퀀스 값을 생성 
  SELECT test_seq.nextval FROM dual;
  -- 시퀀스 : 현재값  시퀀스명.currval -> 하나의 컨텍션에서 nextval 후 currval 만 가능 
  -- application 에서 테스트 : 다수의 사용자들에 의해 공유되는 시퀀스이므로 
  -- 하나의 컨넥션에서만 시퀀스 현재값을 볼 수 있다 
  -- SELECT test_seq.currval FROM dual;  
  
  
  -- CAR table 생성해서 시퀀스 적용해보기 
  CREATE TABLE car(
  	car_no number primary key, -- 시퀀스로 자동 발급 
  	model varchar2(100) not null
  )
  -- car_seq 이름으로 시퀀스 생성 
  CREATE SEQUENCE car_seq;
  
  -- INSERT 
  INSERT INTO car(car_no,model) VALUES(car_seq.nextval,'소나타');
  INSERT INTO car(car_no,model) VALUES(car_seq.nextval,'말리부');
  
  SELECT * FROM car;
  
  -- GUESTBOOK Table 생성 
  CREATE TABLE guestbook(
  	guestbook_no number primary key,
  	title varchar2(100) not null,
  	content varchar2(1000) not null
  )
  -- questbook_seq 시퀀스 생성 
  CREATE SEQUENCE guestbook_seq;
  
  -- INSERT 구문   guestbook_no 는 시퀀스로 자동발급 , title : 즐거운 8월 , content : 열공 
  INSERT INTO guestbook(guestbook_no,title,content)
  VALUES(guestbook_seq.nextval,'즐거운 8월','열공');
  SELECT * FROM guestbook;
  
  -- 시퀀스 테스트 2 
  -- 테이블 생성 , 시퀀스 생성 
  CREATE TABLE movie(
  	id number primary key,
  	title varchar2(100) not null,
  	attendance number default 0
  )
  -- 캐쉬 기능을 사용하지 않겠다는 옵션을 할당 -> 비정상종료시에도 번호가 이어지도록 
  CREATE SEQUENCE movie_seq nocache;
  
  INSERT INTO movie(id,title) VALUES(movie_seq.nextval,'8월의크리스마스');
  
  SELECT * FROM movie;
  
  
  
  
  
  
  
  
  
  



/*  ����Ŭ ������(sequence)
 *  : ���������� ����, ������ ���� �����ϱ� ���� ��ü 
 * 	  �ַ� primary key ( unique + not null ) �� �����ϱ� ���� ���
 *    ���̺���� ������ ���� 
 * 
 *   CREATE SEQUENCE �������� 
 *   [START WITH ���۹�ȣ]
 *   [INCREMENT BY ������]
 *   [MAXVALUE �ִ밪] 
 *   [MINVALUE �ּҰ�]
 *   [ CYCLE or NOCYCLE ] 
 *   [ NOCACHE ] 
 */
  -- ������ ���� 
  CREATE SEQUENCE test_seq;
  -- ������ ���� 
  DROP SEQUENCE test_seq;
  /*	Oracle dual table 
   * 	: ����Ŭ���� �����ϴ� �⺻ ���̺� 
   * 	  �÷� �ϳ��� ���� , �ַ� ������ �Ǵ� ��¥�Լ�, ������꿡 ���
   * 	  sys Admin �������� ����, ���� �� ���� �� ������ �Ұ� 
   */
  SELECT * FROM dual;
  -- dual table�� �̿��� ������ ������ ���� Ȯ�� 
  -- ������ : ��������.nextval -> ���� ������ ���� ���� 
  SELECT test_seq.nextval FROM dual;
  -- ������ : ���簪  ��������.currval -> �ϳ��� ���ؼǿ��� nextval �� currval �� ���� 
  -- application ���� �׽�Ʈ : �ټ��� ����ڵ鿡 ���� �����Ǵ� �������̹Ƿ� 
  -- �ϳ��� ���ؼǿ����� ������ ���簪�� �� �� �ִ� 
  -- SELECT test_seq.currval FROM dual;  
  
  
  -- CAR table �����ؼ� ������ �����غ��� 
  CREATE TABLE car(
  	car_no number primary key, -- �������� �ڵ� �߱� 
  	model varchar2(100) not null
  )
  -- car_seq �̸����� ������ ���� 
  CREATE SEQUENCE car_seq;
  
  -- INSERT 
  INSERT INTO car(car_no,model) VALUES(car_seq.nextval,'�ҳ�Ÿ');
  INSERT INTO car(car_no,model) VALUES(car_seq.nextval,'������');
  
  SELECT * FROM car;
  
  -- GUESTBOOK Table ���� 
  CREATE TABLE guestbook(
  	guestbook_no number primary key,
  	title varchar2(100) not null,
  	content varchar2(1000) not null
  )
  -- questbook_seq ������ ���� 
  CREATE SEQUENCE guestbook_seq;
  
  -- INSERT ����   guestbook_no �� �������� �ڵ��߱� , title : ��ſ� 8�� , content : ���� 
  INSERT INTO guestbook(guestbook_no,title,content)
  VALUES(guestbook_seq.nextval,'��ſ� 8��','����');
  SELECT * FROM guestbook;
  
  -- ������ �׽�Ʈ 2 
  -- ���̺� ���� , ������ ���� 
  CREATE TABLE movie(
  	id number primary key,
  	title varchar2(100) not null,
  	attendance number default 0
  )
  -- ĳ�� ����� ������� �ʰڴٴ� �ɼ��� �Ҵ� -> ����������ÿ��� ��ȣ�� �̾������� 
  CREATE SEQUENCE movie_seq nocache;
  
  INSERT INTO movie(id,title) VALUES(movie_seq.nextval,'8����ũ��������');
  
  SELECT * FROM movie;
  
  
  
  
  
  
  
  
  
  



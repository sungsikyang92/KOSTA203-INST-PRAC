/*
	����Ŭ ������(sequence)
	:���������� �����ϴ� ������ ���� �����ϱ� ���� ��ü
	�ַ� primary key (unique + not null)�� �����ϱ� ���� ����ϸ�, ���̺���� ������ �����̴�.
	
	CREATE SEQUENCE ��������
	[ START WITH ���۹�ȣ ]
	[ INCREMENT BY ������]
	[ MAXVALUE	      �ִ밪]
	[ MINVALUE	      �ּҰ�]
	[CYCLE]	OR	[NOCYCLE]	//�ݺ��Ұ����� ����
	[ NOCACHE]				//������ ���� �ÿ��� SEQUENCE�� �̾�������
*/

--������ ����
CREATE SEQUENCE test_seq;

--������ ����
DROP SEQUENCE test_seq;

/* Oracle dual table
	:����Ŭ���� �����ϴ� �⺻ ���̺�
	  �÷� �ϳ��� ����, �ַ� ������ �Ǵ� ��¥�Լ�, ������꿡 ���
	 sys Admin �������� �����ϸ�, ���� �� ���� �� ������ �Ұ�
*/

SELECT*FROM dual;

-- dual table�� �̿��� ������ ������ ���� Ȯ��
-- ������: ��������.nextval �� ���� ������ ���� ����(��� ���� ������)
SELECT test_seq.nextval FROM dual;
-- ���� �� ���� ��������.currval �� �ϳ��� Ŀ�ؼǿ��� nextval�� currval�� ����
SELECT test_seq.currval FROM dual;
-- CAR table �����ؼ� ������ �����غ���
CREATE TABLE car(
	car_no NUMBER PRIMARY KEY, --������ �ڵ��߱�
	model VARCHAR2(100) NOT NULL
)
-- car_seq �̸����� ������ ����
CREATE SEQUENCE car_seq;
--INSERT
INSERT INTO car(car_no, model) VALUES(car_seq.nextval, '�ҳ�Ÿ');
INSERT INTO car(car_no, model) VALUES(car_seq.nextval, '������');
SELECT*FROM car;

---------------------------
--# GUESTBOOK table�� �ǽ�#--
---------------------------
--GUESTBOOK table ����
CREATE TABLE guestbook(
	guestbook_no NUMBER PRIMARY KEY,
	title VARCHAR2(100) NOT NULL,
	content VARCHAR2(1000) NOT NULL
)

--guestbook_seq ������ ����
CREATE SEQUENCE guestbook_seq;

--INSERT ���� ������
--guestbook_no�� �������� �ڵ��߱�
--title: ��ſ�8��
--content: ����
INSERT INTO guestbook(guestbook_no, title, content) VALUES(guestbook_seq.nextval, '��ſ� 8��', '����');
INSERT INTO guestbook(guestbook_no, title, content) VALUES(guestbook_seq.nextval, '��ſ� 9��', '����');
INSERT INTO guestbook(guestbook_no, title, content) VALUES(guestbook_seq.nextval, '��ſ� 10��', '���');

--GUESTBOOK table ��ȸ
SELECT*FROM guestbook;

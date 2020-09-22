/*
	SQL ������ �ּ�
*/

--SQL ���� �ּ�

/*
*	SQL(Structured Query Language): �����͸� �����ϰ�, ����, �����ϴ� ���
*	
*	DDL, DML, DCL
*	1. DDL(Data Definition Language: ������ ���Ǿ�)
*		:CREATE ����, DROP ����, ALTER ����
*
*+
*	2. DML(Data Manipulation Language: ������ ���۾�)
*		:INSERT ����, DELETE ����, UPDATE ����, SELECT �˻�
*		 CRUD(Create Read Update Delete)
*			  Insert Select Update Delete
*
*	3. DCL(Data Control Language: ������ �����)
*		:COMMIT ���� DB�� �ݿ��Ѵ�, ROLLBACK �۾��� ����ϰ� �ǵ�����
*		 GRANT ���Ѻο�, REVOKE �������
*
*	TABLE - �����͸� �����ϴ� ����
*	COLUMN - �Ӽ�(attribute)
*	CONSTRAINT - �������� ex)PRIMARY KEY - �ߺ� ������� �ʴ´�, NOT NULL
*	DataType - ���ڿ� varchar2(100), ������ number	
*/

--MEMBER TABLE�� �����ϰ� ������ ������ �� ��ȸ�غ���.
--���� ����Ű ���� ���� �� ALT+X
CREATE TABLE member(
	id VARCHAR2(100)PRIMARY KEY,
	password VARCHAR2(100)NOT NULL,
	name  VARCHAR2(100)NOT NULL,
	address VARCHAR2(100)
)
DROP TABLE member; --���̺� ���� DDL
--DML:INSERT ���̺� MEMBER�� ������ �߰�
INSERT INTO member(id,password,name,address)VALUES('java','1234','������','�Ǳ�')
--DML:SELECT ���̺� MEMBER�� �ִ� ��� ������ ��ȸ
SELECT*FROM member;
--�ڱ� ������ INSERT�غ���
INSERT INTO member(id,password,name,address)VALUES('sik','8670','�缺��','����')
INSERT INTO member(id,password,name,address)VALUES('ljw','kosta','������','�д�')
--�������� PRIMARY KEY�� �ߺ��� ���� ������� �����Ƿ� �Ʒ� SQL�� ERROR�� ����.
INSERT INTO member(id,password,name,address)VALUES('ljw','test','test','test')
--��ȸ������ ��ȸ�غ��� COUNT(*)
SELECT COUNT(*)FROM member;
--DML:UPDATE������ ����
UPDATE member SET address='�Ͽ���'WHERE id='ljw';
--DML:SELECT, WHERE���� �̿��� ljw��� ���̵� ȸ�� ������ ��ȸ
SELECT*FROM member WHERE id='ljw';
--DML:DELETE ������ ����
DELETE FROM member WHERE address='�Ͽ���';
--��ȸ���� ��ȸ
SELECT COUNT(*)FROM member;
--MEMBER TABLE�� ������ ��ȸ�� ȸ���� NAME�� ADDRESS�� ��ȸ
SELECT name,address FROM member;
--SELECT�� WHERE �÷�=�Ӹ� AND �÷�=�Ӹ�
--NAME�� �������̰� ADDRESS�� �Ǳ��� ȸ���� ID�� ��ȸ�غ���
SELECT id FROM member WHERE name='������'AND address='�Ǳ�';
--�������� �׽�Ʈ:PRIMARY KEY�� ������ �÷��� �����ؾ�(UNIQUE)�ϸ� NOT NULL
--			    �̿��� �ϹǷ� �ݵ�� �ߺ����� ���� ������ �����ؾ� �Ѵ�.
INSERT INTO member(password,name,address)VALUES('A','�˼���','�Ǳ�');
--PASSWORD �ķ��� NOT NULL���������� �����Ƿ� �ݵ�� INSERT�ؾ������� ERROR.
INSERT INTO member(id,name,address)VALUES('A','�˼���','�Ǳ�');
INSERT INTO member(id,password,name)VALUES('A','a','�˼���');
--ADDRESS�� ������ ���������� �����Ƿ� NULL�� ���ȴ�.
SELECT*FROM member;
/*	1.ȸ�� ���� �� ���� �Է�
 * 
 *
*	ID 				PASSWORD 	NAME 		ADDRESS
*	spring			aop			����		����
*	mybatis			di			�缺��		����
*
*	2.INSERT ���� ���� �� ���忡 ��� ȸ���� �̸��� ���(SELECT)
*	
*	3.ADDRESS�� ������ ȸ������ ADDRESS�� ���������� ����(UPDATE)
*	
*	4.��ü ȸ�� ������ ��ȸ
*/
INSERT INTO member(id,password,name,address)VALUES('spring','aop','����','����');
INSERT INTO member(id,password,name,address)VALUES('mybatis','di','�缺��','����');
--��ü COLUMN���� ����Ҷ� ���� �����ϳ� ��Ģ�����δ� ������Ѵ�.
--INSERT INTO member VALUES('mybatis','di','�缺��','����');
SELECT name FROM member WHERE address='����';
UPDATE member SET address='������' WHERE address='����';
SELECT*FROM member;

COMMIT --���� �����ͺ��̽��� �ݿ�(�۾� ������ ����)
ROLLBACK -- Ŀ�� ������ ��� �۾��� ����ϰ� �ǵ����� ��ɾ�

	--	�⺻ SQL ����
	INSERT INTO member(id,password,name,address)VALUES('ebs','abcd','���','����');
	
	--	member ���̺��� name�� ����̰� address�� ������ ȸ���� id�� ��ȸ
	SELECT id FROM member WHERE name='���'AND address='����';
	--	member ���̺��� ȸ�� �ּ� �� '����'�� ȸ���� �ּҸ� �Ǳ��� UPDATE
	UPDATE member SET address='�Ǳ�'WHERE address='����';
	SELECT*FROM MEMBER;
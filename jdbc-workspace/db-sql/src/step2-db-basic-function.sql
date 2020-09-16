/*SQL: �����ͺ��̽� ���� ���
 * 
 * DDL - CREATE, DROP, ALTER
 * DML - SELECT, INSERT, DELETE, UPDATE
 * DCL - COMMIT, ROLLBACK
 * 
 * DATA TYPE: ����Ŭ���� �����ϴ� ���ڿ� Ÿ�� VARCHAR2(20)
 * 			  MySQL�̳� MsSQL������ VARCHAR(20)
 */
 CREATE TABLE typetest(
 	name VARCHAR2(9) PRIMARY KEY,
 	money number not null
 )
--�ִ����� 9�̹Ƿ� 10�ڴ� insert�� �ȵȴ�.
 INSERT INTO typetest(name,money)VALUES('abcdefghij',100);
 --9�� �̹Ƿ� success
 INSERT INTO typetest(name,money)VALUES('abcdefghi',100);
 --�ѱ��� 3byte�� �����ϹǷ� 12byte�̱⿡ error
 INSERT INTO typetest(name,money)VALUES('������',100);
 --success
 INSERT INTO typetest(name,money)VALUES('�����',100);
 --UPDATE����: NAME�� ������� ����� money�� 200 �����غ���. �� ������+200
 --�� ������ 200���� money�� ����
 UPDATE typetest SET money=200 WHERE name='�����';
 SELECT*FROM TYPETEST;
 UPDATE typetest SET money=200+money WHERE name='�����';
 /* DDL: TABLE ������ ������ �� �� ALTER
 		  �������� �� default�� ���
 	ex)hit number default 0���� ���������� �����ϸ� ������ hit�� ������ insert���� �ʾƵ� 0���� �ʱ�ȭ */
 CREATE TABLE altertest(
 	id VARCHAR2(100) PRIMARY KEY,
 	hit number DEFAULT 0
 )
 INSERT INTO  altertest(id)VALUES('java');
 SELECT*FROM altertest; --������ hit���� insert���� �ʾƵ� default������ ���� �ʱⰪ�� 0���� �Ҵ�ȴ�.
 --DDL: ALTER�� �̿��� ���̺���� �����غ���
 ALTER TABLE altertest rename to altertest2;
 SELECT*FROM altertest2;
 --DDL: ALTER�� �̿��� �÷����� �����غ���.
 ALTER TABLE altertest2 rename COLUMN hit to count;
 SELECT*FROM altertest2
 /* ���̺��:PRODUCT
 	�÷���:ID,NAME,MAKER �� VARCHAR2(100),PRICE �� NUMBER
 	��������:ID�� PRIMARY KEY, �������� NOT NULL */
CREATE TABLE PRODUCT(
 	ID VARCHAR2(100) PRIMARY KEY,
 	NAME VARCHAR2(100) NOT NULL,
 	MAKER VARCHAR2(100) NOT NULL,
 	PRICE NUMBER NOT NULL
)
INSERT INTO PRODUCT(ID,NAME,MAKER,PRICE)VALUES('1','ī��','����',2000);
INSERT INTO PRODUCT VALUES('2','�׶�','����',1800);
INSERT INTO PRODUCT VALUES('3','�ƽ�','����',2400);
SELECT*FROM PRODUCT;
--����Ŭ �Լ�
--��ü ��ǰ��
SELECT COUNT(*)FROM PRODUCT;
--��ǰ ������
SELECT MIN(PRICE)FROM PRODUCT;
--��ǰ �ְ�
SELECT MAX(PRICE)FROM PRODUCT;
--��ǰ ��հ�
SELECT AVG(PRICE)FROM PRODUCT;
--����:PRICE �������� �� ORDER BY �÷��� ASC
SELECT ID,NAME,MAKER,PRICE FROM PRODUCT ORDER BY PRICE ASC;
--����:PRICE �������� �� ORDER BY �÷��� DESC
SELECT ID,NAME,MAKER,PRICE FROM PRODUCT ORDER BY PRICE DESC;
--WHERE�������� ORDER BY ������ �Բ� �Ѵ�.
--MAKER�� ������ ��ǰ�� NAME�� PRICE�� ��ȸ�ϵ� PRICE ��������(���� ���ݿ��� �������ݼ�����)����
SELECT NAME,PRICE FROM PRODUCT WHERE MAKER='����'ORDER BY PRICE DESC;
--PRICE�� 2000�̻�, 2500������ ��ǰ�� NAME,PRICE�� ��� ���(���� ��������)
SELECT NAME,PRICE FROM PRODUCT WHERE PRICE>=2000 AND PRICE<=2500 ORDER BY PRICE ASC;
--BETWEEN AND�� ���� �����ϰ� ǥ���� �� �ִ�
SELECT NAME,PRICE FROM PRODUCT WHERE PRICE BETWEEN 2000 AND 2500 ORDER BY PRICE ASC;
--PRIMARY KEY�� �˻��ؼ� 0 �Ǵ� 1�� ��ȸ�� �� �ִ�
SELECT COUNT(*)FROM PRODUCT WHERE ID='1';--������ 1
SELECT COUNT(*)FROM PRODUCT WHERE ID='AB';--������ 0
SELECT*FROM PRODUCT;
--MAKER�� ������ ��ȸ-�ߺ�����
SELECT DISTINCT MAKER FROM PRODUCT;
--�÷� ��Ī: MAKER AS ������
SELECT ID,NAME,MAKER AS ������ FROM PRODUCT;
/*	��ǰ �� MAKER�� ������ ��ǰ���� NAME,MAKER,PRICE,���ΰ��� ��ȸ�ϵ�
	PRICE�� 200�� �����ؼ� ��ȸ�ϰ� ������ ���� ������������ ��ȸ�Ѵ�.
	(PRICE�� ��Ī�� �ο��ؼ� �÷��� ��� '���ΰ�'�� ǥ��) */
SELECT NAME,MAKER,PRICE,PRICE-200 AS ���ΰ� FROM PRODUCT WHERE MAKER='����'ORDER BY PRICE DESC;
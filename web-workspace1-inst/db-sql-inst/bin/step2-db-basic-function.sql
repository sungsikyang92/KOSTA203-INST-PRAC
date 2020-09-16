/*   SQL : �����ͺ��̽� ���� ��� 
 *   
 *    DDL - CREATE , DROP , ALTER
 *    DML - SELECT , INSERT , DELETE, UPDATE
 *    DCL - COMMIT , ROLLBACK 
 */
-- DATA TYPE : ����Ŭ���� �����ϴ� ���ڿ� Ÿ�� VARCHAR2(20)
--					MySQL�̳� MSSQL������ VARCHAR(20)
CREATE TABLE typetest(
	name VARCHAR2(9) PRIMARY KEY,
	money number not null
)
-- �ִ����� 9�̹Ƿ� 10�ڴ� insert �ȵ� 
INSERT INTO typetest(name,money) VALUES('abcdefghij',100);
-- 9���̹Ƿ� success 
INSERT INTO typetest(name,money) VALUES('abcdefghi',100);
-- �ѱ��� 3byte�� �����ϹǷ� 12byte�̱⿡ error 
INSERT INTO typetest(name,money) VALUES('������',100);
-- success
INSERT INTO typetest(name,money) VALUES('�����',100);

-- UPDATE ���� : NAME�� ������� ����� MONEY�� 200�� �����غ��� -> ������ + 200 
-- �� ������ 200���� money�� ���� 
UPDATE typetest SET money=200 WHERE name='�����';
-- �Ʒ� ������ 200�� ���� 
UPDATE typetest SET money=money+200 WHERE name='�����';

SELECT * FROM typetest;

/*	DDL : TABLE ������ ������ �� -> ALTER 
 * 			�������� �� default �� ���
 * 	ex) hit number default 0 ���� ���������� �����ϸ� ������ hit�� ������ insert ���� �ʾƵ� 0���� �ʱ�ȭ 		
 */
CREATE TABLE altertest(
	id VARCHAR2(100) PRIMARY KEY,
	hit number DEFAULT 0
)
INSERT INTO altertest(id) VALUES('JAVA');
SELECT * FROM altertest; -- ������ hit ���� insert ���� �ʾƵ� default ������ ���� �ʱⰪ 0���� �Ҵ� 

-- DDL : ALTER �� �̿��� ���̺���� �����غ��� 
ALTER TABLE altertest rename to altertest2;

SELECT * FROM altertest2;

-- DDL : ALTER�� �̿��� �÷����� �����غ��� 
ALTER TABLE altertest2 rename COLUMN hit to count;

/*  ���̺�� : PRODUCT
 *  �÷��� :  ID , NAME, MAKER  -> VARCHAR2(100)     ,  PRICE -> NUMBER 
 * 	�������� : ID�� PRIMARY KEY  , �������� NOT NULL 
 */
-- DDL : CREATE 
CREATE TABLE product(
	id VARCHAR2(100) PRIMARY KEY,
	name VARCHAR2(100) NOT NULL,
	maker VARCHAR2(100) NOT NULL,
	price NUMBER NOT NULL
)

INSERT INTO product(id,name,maker,price) VALUES('1','ī��','����',2000);
INSERT INTO product(id,name,maker,price) VALUES('2','�׶�','����',1800);
INSERT INTO product(id,name,maker,price) VALUES('3','�ƽ�','����',2400);

SELECT * FROM product;

-- ����Ŭ �Լ� 
-- ��ü ��ǰ�� 
SELECT COUNT(*) FROM product;

-- ��ǰ ������ 
SELECT MIN(price) FROM product;
-- ��ǰ �ְ� 
SELECT MAX(price) FROM product;
-- ��ǰ ��հ�
SELECT AVG(price) FROM product;
-- ���� : PRICE �������� ->  ORDER BY �÷��� ASC 
SELECT id,name,maker,price FROM product ORDER BY price ASC;
-- �������� ���� ORDER BY �÷��� DESC 
SELECT id,name,maker,price FROM product ORDER BY price DESC;

/*	SELECT 
 *  FROM 
 *  WHERE 
 *  ORDER BY 
 */
-- WHERE �������� ORDER BY ������ �Բ� �Ѵ� 
-- MAKER�� ������ ��ǰ�� NAME�� PRICE�� ��ȸ�ϵ� PRICE �������� (���ݳ��� -> ���� ������) ���� ���� 

SELECT name,price FROM product WHERE maker='����' ORDER BY price DESC;

-- PRICE�� 2000 �̻� , 2500 ������ ��ǰ�� NAME,PRICE�� ��� ���( ���� �������� ) 
SELECT name,price 
FROM product 
WHERE price>=2000 AND price<=2500 
ORDER BY price ASC; 

-- BETWEEN AND �� ���� �����ϰ� ǥ���� �� �ִ� 
SELECT name,price 
FROM product 
WHERE price BETWEEN 2000 AND 2500
ORDER BY price ASC; 

-- primary key�� �˻��ؼ� 0 �Ǵ� 1 �� ��ȸ�� �� �ִ� 
SELECT COUNT(*) FROM product WHERE id='1'; -- ������ 1 
SELECT COUNT(*) FROM product WHERE id='ab'; -- ������ 0 

SELECT * FROM product;

-- MAKER �� ������ ��ȸ - �ߺ����� 
SELECT DISTINCT maker FROM product;

-- �÷� ��Ī :  maker as ������  
SELECT ID,NAME,MAKER AS ������ FROM product;

/*	��ǰ �� maker�� ������ ��ǰ���� name,maker,price,���ΰ� �� ��ȸ�ϵ� 
 *  price�� 200 �� �����ؼ� ��ȸ�ϰ� ������ ���� ������������ ��ȸ�Ѵ�
 *  ( price�� ��Ī�� �ο��� �÷��� ��� ���ΰ��� ǥ��)
 */
SELECT name,maker,price,price-200 as "���ΰ�" 
FROM product 
WHERE maker='����' 
ORDER BY price DESC;

/*	�����Ͽ� ������ ���� 
 * 
 * Oracle SEQUENCE 
 * 
 */
SELECT id,name,maker,price FROM product;


















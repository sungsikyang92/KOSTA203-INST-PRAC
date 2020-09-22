/*	SubQuery: ��������, ������, ��������, ��������
  	SQL ���� SQL
 */

 create table product(
	id varchar2(100) primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number default 0
)
select * from product;
delete from product;
commit
drop sequence product_seq;
create sequence product_seq;

insert into product(id,name,maker,price) values(product_seq.nextval,'�ٳ�������','���׷�',1200);
insert into product(id,name,maker,price) values(product_seq.nextval,'������','ũ���',2000);
insert into product(id,name,maker,price) values(product_seq.nextval,'�ֽĽ�','�Ե�',1000);
insert into product(id,name,maker,price) values(product_seq.nextval,'Ŭ����','�Ե�',2200);
insert into product(id,name,maker,price) values(product_seq.nextval,'���̽�','����',1300);

--����� ��ǰ���� �� ���� ��� ��ǰ ������ ��ǰ��?
SELECT COUNT(*)FROM PRODUCT;
--1)��ǰ �ְ����� ��ȸ
SELECT MAX(PRICE)FROM PRODUCT;
SELECT MIN(PRICE)FROM PRODUCT;
--2)��ȸ�� ��ǰ �ְ����� �̿��� ��ǰ���� �˻�
SELECT NAME FROM PRODUCT WHERE PRICE=2200;
--���������� �̿��� 1,2, SQL�� �ѹ��� �����ϰ� ����
SELECT name FROM product WHERE price=(SELECT MAX(price)FROM product);

--������ ��ǰ�� name, maker, price�� ��ȸ(���� ������ �̿�)
SELECT name,maker,price FROM product WHERE price=(SELECT MIN(price) FROM product);

--��հ�(AVG(�÷���))
--��ü ��ǰ�� ��հ��ݺ��� ���� ������ ��ǰ �� ���� ���� ������ name,maker,price�� ��ȸ
--1)��ǰ���� ��հ�
SELECT AVG(price)FROM product;--1540
--2)��հ����� ���� ������ ��ǰ �� ���� ���� ���� ���� ��ȸ
SELECT MIN(price)FROM product WHERE price>1540; --2000
--SELECT name,maker,price FROM product WHERE price>=(SELECT AVG(price)FROM product); �����Ѱ�
--3)���� ���� ������ ���� ��ǰ�� name,maker,price�� ��ȸ
SELECT name,maker,price FROM product WHERE price=2000;
--���� ������ sql�� subquery�� �ѹ��� ����
SELECT name,maker,price FROM product WHERE price=(SELECT MIN(price)FROM product WHERE price>(SELECT AVG(price) FROM product));
-----------------------------------------------------------------------------
-------------------------------------------------
-- employee ��� ���̺� 
create table employee(
	empno number primary key,
	name varchar2(100) not null,
	job varchar2(100) not null,
	salary number not null
)
create sequence employee_seq;	
	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'������','����',700);	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'������','�ѹ�',300);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'�ż�ȣ','����',900);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'�����','�ѹ�',400);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'�����','����',500);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'�����','����',900);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'������','�ѹ�',300);
commit	
	
select * from employee;	
	
-- ���� job �� ����� �� ���� ���� sal�� �޴� ���������?
select empno,name,job,salary from employee
where salary=(select max(salary) from employee where job='����')


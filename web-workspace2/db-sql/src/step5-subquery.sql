/*	SubQuery: 서브쿼리, 부쿼리, 내부쿼리, 하위쿼리
  	SQL 내의 SQL
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

insert into product(id,name,maker,price) values(product_seq.nextval,'바나나우유','빙그레',1200);
insert into product(id,name,maker,price) values(product_seq.nextval,'마이쮸','크라운',2000);
insert into product(id,name,maker,price) values(product_seq.nextval,'핫식스','롯데',1000);
insert into product(id,name,maker,price) values(product_seq.nextval,'클라우드','롯데',2200);
insert into product(id,name,maker,price) values(product_seq.nextval,'참이슬','진로',1300);

--저장된 상품정보 중 가장 비싼 상품 가격의 상품명?
SELECT COUNT(*)FROM PRODUCT;
--1)상품 최고가격을 조회
SELECT MAX(PRICE)FROM PRODUCT;
SELECT MIN(PRICE)FROM PRODUCT;
--2)조회한 상품 최고가격을 이용해 상품명을 검색
SELECT NAME FROM PRODUCT WHERE PRICE=2200;
--서브쿼리를 이용해 1,2, SQL을 한번에 정의하고 실행
SELECT name FROM product WHERE price=(SELECT MAX(price)FROM product);

--최저가 상품의 name, maker, price를 조회(서브 쿼리를 이용)
SELECT name,maker,price FROM product WHERE price=(SELECT MIN(price) FROM product);

--평균가(AVG(컬럼명))
--전체 상품의 평균가격보다 높은 가격의 상품 중 가장 낮은 가격의 name,maker,price를 조회
--1)상품들의 평균가
SELECT AVG(price)FROM product;--1540
--2)평균가보다 높은 가격의 상품 중 가장 낮은 가격 정보 조회
SELECT MIN(price)FROM product WHERE price>1540; --2000
--SELECT name,maker,price FROM product WHERE price>=(SELECT AVG(price)FROM product); 내가한것
--3)가장 낮은 가격을 가진 상품의 name,maker,price를 조회
SELECT name,maker,price FROM product WHERE price=2000;
--위의 세개의 sql을 subquery로 한번에 정의
SELECT name,maker,price FROM product WHERE price=(SELECT MIN(price)FROM product WHERE price>(SELECT AVG(price) FROM product));
-----------------------------------------------------------------------------
-------------------------------------------------
-- employee 사원 테이블 
create table employee(
	empno number primary key,
	name varchar2(100) not null,
	job varchar2(100) not null,
	salary number not null
)
create sequence employee_seq;	
	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'강상훈','개발',700);	
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'아이유','총무',300);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'신성호','개발',900);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'장기하','총무',400);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'김수민','개발',500);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'정재우','개발',900);
insert into employee(empno,name,job,salary) values(employee_seq.nextval,'정예울','총무',300);
commit	
	
select * from employee;	
	
-- 개발 job 인 사원들 중 가장 높은 sal을 받는 사원정보는?
select empno,name,job,salary from employee
where salary=(select max(salary) from employee where job='개발')


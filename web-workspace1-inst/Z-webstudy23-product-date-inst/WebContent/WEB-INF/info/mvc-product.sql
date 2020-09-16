/*
 *  mvc-product.sql 
 *  DATE형을 다루어 웹어플리케이션을 구현해보는 예제 
 */
CREATE TABLE mvc_product(
	id NUMBER PRIMARY KEY,
	name VARCHAR2(100) NOT NULL,
	maker VARCHAR2(100) NOT NULL,
	price NUMBER NOT NULL,
	regdate DATE NOT NULL
)
CREATE SEQUENCE mvc_product_seq NOCACHE;

SELECT * FROM mvc_product;

select id,name,to_char(regdate,'YYYY/MM/DD') from mvc_product order by id desc

select name,maker,price,to_char(regdate,'YYYY/MM/DD HH24:MI:SS')
from mvc_product where id=1


















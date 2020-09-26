/*
 		복합기본키 ( 복합 primary key ) 
 		두 개 이상의 컬럼을 이용하여 primary key를 만드는 것을 말함 
 */
drop table mvc_shares; 

create table mvc_shares(
	customer_id varchar2(100),
	stock_id varchar2(100),
	quantity number not null,
	constraint pk_mvc_shares primary key(customer_id,stock_id)
)
-- 복합 pk 테스트 
insert into mvc_shares values('java','삼성',10);
insert into mvc_shares values('angel','삼성',20);
insert into mvc_shares values('angel','LG',30);
-- 복합 PK 란 컬럼의 조합 정보가 유일해야 한다  ERROR
insert into mvc_shares values('angel','삼성',1);
-- error 
insert into mvc_shares values('java','삼성',20);
-- OK 
insert into mvc_shares values('java','LG',20);





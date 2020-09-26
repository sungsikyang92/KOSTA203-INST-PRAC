/*
 		���ձ⺻Ű ( ���� primary key ) 
 		�� �� �̻��� �÷��� �̿��Ͽ� primary key�� ����� ���� ���� 
 */
drop table mvc_shares; 

create table mvc_shares(
	customer_id varchar2(100),
	stock_id varchar2(100),
	quantity number not null,
	constraint pk_mvc_shares primary key(customer_id,stock_id)
)
-- ���� pk �׽�Ʈ 
insert into mvc_shares values('java','�Ｚ',10);
insert into mvc_shares values('angel','�Ｚ',20);
insert into mvc_shares values('angel','LG',30);
-- ���� PK �� �÷��� ���� ������ �����ؾ� �Ѵ�  ERROR
insert into mvc_shares values('angel','�Ｚ',1);
-- error 
insert into mvc_shares values('java','�Ｚ',20);
-- OK 
insert into mvc_shares values('java','LG',20);





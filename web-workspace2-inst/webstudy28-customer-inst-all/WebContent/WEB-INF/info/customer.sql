select * from customer;

drop table customer;

create table customer(
	id varchar2(100) primary key,
	password varchar2(100) not null,
	name varchar2(100) not null,
	address varchar2(100) not null,
	birthday date not null,
	regdate date not null
)

insert into customer(id,password,name,address,birthday,regdate)
values('spring','abcd','아이유','판교',to_date('1993-05-16','YYYY-MM-DD'),sysdate);

select name,address,to_char(birthday,'YYYY-MM-DD'),to_char(regdate,'YYYY.MM.DD HH24:MM'),trunc(months_between(sysdate,birthday)/12) from customer where id='java';










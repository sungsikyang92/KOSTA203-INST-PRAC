CREATE TABLE web_member(
	id varchar2(100) primary key,
	password varchar2(100) not null,
	name varchar2(100) not null,
	address varchar2(100) not null
)
INSERT INTO web_member(id,password,name,address)
VALUES('java','1234','아이유','판교');

INSERT INTO web_member(id,password,name,address)
VALUES('servlet','abcd','조승우','용인');

SELECT COUNT(*) FROM web_member;










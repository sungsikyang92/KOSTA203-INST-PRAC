SELECT * FROM web_member;

CREATE TABLE web_member(
	id VARCHAR2(100) PRIMARY KEY,
	password VARCHAR2(100) NOT NULL,
	name VARCHAR2(100) NOT NULL,
	address VARCHAR2(100) NOT NULL

)

CREATE sequence web_member_seq

INSERT INTO WEB_MEMBER VALUES('a','1','양성식','수원');
INSERT INTO WEB_MEMBER VALUES('ab','1','송영섭','수원');
INSERT INTO WEB_MEMBER VALUES('abc','1','진용현','용인');
INSERT INTO WEB_MEMBER VALUES('abcd','1','정재우','하남');
INSERT INTO WEB_MEMBER VALUES('abcde','1','정세희','광주');

CREATE TABLE study_admin(
	id VARCHAR2(100) PRIMARY KEY,
	name VARCHAR2(100) NOT NULL,
	password VARCHAR2(100) NOT NULL,
	department VARCHAR2(100) NOT NULL
)

SELECT*FROM study_admin

INSERT INTO study_admin VALUES('master','주인','1','사장');


CREATE TABLE study_menu(
	menu VARCHAR2(100) PRIMARY KEY,
	price NUMBER NOT NULL,
	info VARCHAR2(100) NOT NULL
)

SELECT*FROM STUDY_MENU

INSERT INTO study_menu VALUES('김치찌개',7000,'맛있당ㅎ');

INSERT INTO study_menu(menu,price,info) VALUES(?,?,?);

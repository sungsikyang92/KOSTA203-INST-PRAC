CREATE TABLE A_menuforStudy(
id VARCHAR2(100) PRIMARY KEY,
menu VARCHAR2(100) not null,
price NUMBER not null
);
	

SELECT*FROM A_menuforStudy
DROP TABLE menuforStudy;
CREATE sequence A_menuforStudy_seq;
DROP SEQUENCE menuforStudy_seq;

INSERT INTO A_menuforStudy(id,menu,price)VALUES(A_menuforStudy_seq.nextval,'제육볶음',5000);
INSERT INTO A_menuforStudy(id,menu,price)VALUES(A_menuforStudy_seq.nextval,'떡볶이',2500);
INSERT INTO A_menuforStudy(id,menu,price)VALUES(A_menuforStudy_seq.nextval,'순대',2000);
INSERT INTO A_menuforStudy(id,menu,price)VALUES(A_menuforStudy_seq.nextval,'어묵',2300);

select id,menu,price from A_menuforStudy
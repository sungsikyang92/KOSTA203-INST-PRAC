drop table item;

CREATE TABLE item(
	item_no NUMBER PRIMARY KEY,
	name VARCHAR2(100) NOT NULL,
	maker VARCHAR2(100) NOT NULL,
	price NUMBER NOT NULL,
	detail VARCHAR2(2000) NOT NULL
)
DROP SEQUENCE item_seq;
CREATE SEQUENCE item_seq nocache;

INSERT INTO item(item_no,name,maker,price,detail)
VALUES(item_seq.nextval,'아이폰7','애플',1000,'스티브잡스가 만들었어요');
INSERT INTO item(item_no,name,maker,price,detail)
VALUES(item_seq.nextval,'갤럭시9','삼성',1500,'갤갤갤');
INSERT INTO item(item_no,name,maker,price,detail)
VALUES(item_seq.nextval,'G8','LG',2000,'마지막 시리즈입니다');

SELECT * FROM item;

commit















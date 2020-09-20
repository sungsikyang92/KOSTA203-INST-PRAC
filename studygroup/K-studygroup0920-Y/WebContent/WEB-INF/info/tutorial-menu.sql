CREATE TABLE web_table (
	tablenum NUMBER(2) PRIMARY KEY,
	occupation VARCHAR2(5)
	CONSTRAINT web_table_occupation_ck CHECK (occupation IN('false', 'true'))
);	

SELECT * FROM web_table;

INSERT INTO web_table(tablenum, occupation) VALUES(1, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(2, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(3, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(4, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(5, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(6, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(7, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(8, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(9, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(10, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(11, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(12, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(13, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(14, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(15, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(16, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(17, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(18, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(19, 'false');
INSERT INTO web_table(tablenum, occupation) VALUES(20, 'false');
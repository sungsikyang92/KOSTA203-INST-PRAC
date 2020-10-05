CREATE TABLE web_table (
	tablenum NUMBER(2) PRIMARY KEY,
	occupancy VARCHAR2(5)
	CONSTRAINT web_table_occupancy_ck CHECK (occupancy IN('false', 'true'))
);	

SELECT * FROM web_table;

INSERT INTO web_table(tablenum, occupancy) VALUES(1, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(2, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(3, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(4, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(5, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(6, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(7, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(8, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(9, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(10, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(11, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(12, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(13, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(14, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(15, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(16, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(17, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(18, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(19, 'false');
INSERT INTO web_table(tablenum, occupancy) VALUES(20, 'false');

CREATE TABLE web_admin(
	empNo NUMBER(10) PRIMARY KEY,
	id VARCHAR2(100) NOT NULL,
	password VARCHAR2(100) NOT NULL,
	name VARCHAR2(100) NOT NULL
)

INSERT INTO web_admin VALUES(1,'a','z','¶ì¿ä¿Ë');
INSERT INTO web_admin VALUES(2,'s','x','¶ì¿ä¿Ë');
INSERT INTO web_admin VALUES(3,'d','c','¶ì¿ä¿Ë');

SELECT*FROM web_admin;

COMMIT

DROP TABLE store_admin;
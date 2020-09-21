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
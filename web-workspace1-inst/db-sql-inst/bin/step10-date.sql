/*  date Ÿ�� : �����ͺ��̽� �ð� ( �� , �� , �� , ��, �� , �� ) �� �����ϴ� Ÿ��
 *  �ֿ� �Լ� 
 *  1. TO_CHAR() : �����ͺ��̽��� ����� DATE���� ������ ���ڿ��� ��ȯ���� �� ��� 
 *  2. TO_DATE() : ����Ÿ���� �ð� ������ �����ͺ��̽��� DATE������ ��ȯ�� ������ �� ��� 
 *  
 *  sysdate Ű���� : ���� �ð��� ǥ���ϴ� Ű���� 
 * 
 *  dual ���̺�(����Ŭ���� �����ϴ� �⺻���̺�)�� �̿��ؼ� ���� �ð��� ��ȸ 
 */
SELECT sysdate FROM DUAL;
-- TO_CHAR() : ���ϴ� �ð� ������ ������ ���ڿ��� ��ȯ�޴� �Լ� 
SELECT TO_CHAR(sysdate,'YYYY-MM-DD') FROM DUAL;
SELECT TO_CHAR(sysdate,'YYYY. MM. DD') FROM DUAL;
SELECT TO_CHAR(sysdate,'YYYY') FROM DUAL;
SELECT TO_CHAR(sysdate,'MM') FROM DUAL;
SELECT TO_CHAR(sysdate,'DD') FROM DUAL;
SELECT TO_CHAR(sysdate,'HH24:MI:SS') FROM DUAL;
SELECT TO_CHAR(sysdate,'HH:MI:SS') FROM DUAL;
SELECT TO_CHAR(sysdate,'DAY') FROM DUAL; -- ���� 
-- �� �� �� �� �� �� 
SELECT TO_CHAR(sysdate,'YYYY/MM/DD HH24:MI:SS') FROM DUAL;

-- ���� ���̺��� �����ؼ� �׽�Ʈ 
CREATE TABLE date_test(
	id VARCHAR2(100) PRIMARY KEY,
	mydate DATE NOT NULL
)
-- INSERT   : id java mydate ����ð��� ���� 
INSERT INTO date_test(id,mydate) VALUES('java',sysdate);
SELECT * FROM date_test;
-- ��.��.�� �� ��ȸ ( TO_CHAR() �� �̿� ) 
SELECT id,TO_CHAR(mydate,'YYYY.MM.DD') FROM date_test;
/*	TO_DATE(�ð�����,�ð�����)
 *  : ������ �����͸� DATE������ ��ȯ 
 * 	  
 *    �����ø����̼ǿ��� �ð� ������ ���޹޾� DB�� �����ϱ� ���� �ַ� ��� 
 */
INSERT INTO date_test(id,mydate) VALUES('jstl',TO_DATE('2020.9.1','YYYY.MM.DD'));

INSERT INTO date_test(id,mydate) 
VALUES('ajax',TO_DATE('1989.1.7 5:20:33','YYYY.MM.DD HH24:MI:SS'));

-- DATE �� ������ ���� 

-- �Ϸ��� 
SELECT id,  mydate , mydate-1 FROM date_test; 
-- ����ð��� ����ð��� �ϼ��� Ȯ�� 
SELECT id,  mydate , sysdate-mydate FROM date_test; 
-- �Ҽ��� ���ϴ� �����ڴ�  trunc() 
SELECT id,  mydate , trunc(sysdate-mydate) FROM date_test; 
-- ������� months_between(����ð�,��Ͻð�) 
SELECT id,  mydate , trunc(months_between(sysdate,mydate)) FROM date_test; 
-- ������� 
SELECT id,  mydate , trunc(months_between(sysdate,mydate)/12) FROM date_test;



















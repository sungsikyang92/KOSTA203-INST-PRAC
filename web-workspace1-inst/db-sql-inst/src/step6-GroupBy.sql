/*  GROUP BY : ���̺��� Ư�� �÷��� �������� �׷�ȭ�Ͽ� �˻��� �� ��� , 
 *                 �׷��Լ��� �Բ� ���
 * 					(�׷��Լ� - MAX, MIN , AVG , COUNT ) 
 *  HAVING : GROUP BY�� �Բ� ����ϴ� ������ ( �׷쿡 ���� ������ ���� ) 
 * 					
 *  ��) ��ǰ���̺��� �����纰 ��ǰ��, ��հ���   ,  �μ��� ����� , ��տ��� 
 */
-- �����纰 ��ǰ���� ��ȸ 
SELECT MAKER, COUNT(*) AS ��ǰ��
FROM PRODUCT
GROUP BY MAKER
-- HAVING COUNT(*)>1 -- GROUP BY �ÿ� ������ �ο��� �� HAVING �̿� 
ORDER BY ��ǰ�� DESC
--------------------------------------------
-- ������MAKER �� ��ǰ��հ��� ��ȸ�ϵ� ��հ� ������������ �����Ͽ� ��ȸ (MAKER,��հ�)
SELECT MAKER, AVG(PRICE) AS ��հ�
FROM PRODUCT
GROUP BY MAKER
ORDER BY ��հ� DESC;
-- MAKER ��  ��ǰ��հ� 1500 �� �ʰ��ϴ� ��ǰ�鸸 ��ȸ�ϵ� ,
--  MAKER �� ��ǰ��, ��հ��� ��ȸ�Ѵ� 
--	MAKER, ��ǰ�� , ��հ� �� ��ȸ�ǰ� ��հ� ������������ ���� 
SELECT MAKER,COUNT(*) AS ��ǰ��, AVG(PRICE) AS ��հ�
FROM PRODUCT
GROUP BY MAKER
HAVING AVG(PRICE)>1500
ORDER BY ��հ� ASC;

-- 
SELECT * FROM employee;

INSERT INTO employee(empno,name,job,salary) VALUES(employee_seq.nextval,'������','��ȹ',900);
INSERT INTO employee(empno,name,job,salary) VALUES(employee_seq.nextval,'����','��ȹ',1000);
INSERT INTO employee(empno,name,job,salary) VALUES(employee_seq.nextval,'�缺��','��ȹ',700);
-- job �÷��� �������� �׷�ȭ   job , ����� , ��տ��� �������� 
-- job �� ��տ����� 500�� �ʰ��ϴ� job�� ��ȸ�ϴ� ������ �׷� ��ȸ ������ �߰� 
SELECT job,COUNT(*) as �����,ROUND(AVG(salary)) as ��տ���
FROM employee
GROUP BY job
--HAVING ROUND(AVG(salary))>500
ORDER BY ��տ��� DESC;

-- job �׷캰 ���� ���� salary (��Ī highsal ) �� job �� ��ȸ(highsal ��������)
SELECT job, MAX(salary) as highsal 
FROM employee
GROUP BY job
ORDER BY highsal DESC;

-- job �� ������ ��ȸ 
SELECT DISTINCT(job) FROM employee;
















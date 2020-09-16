/*	GROUP BY: ���̺��� Ư�� �÷��� �������� �׷�ȭ�Ͽ� �˻��� �� ���,
 * 		   		�׷��Լ��� �Բ� ���(�׷��Լ� - MAX, MIN, COUNT)
 *	HAVING: GROUP BY�� �Բ� ����ϴ� ������(�׷쿡 ���� ������ ����)
 *	
 *	��) ��ǰ���̺��� �����纰 ��ǰ��, ��հ���, �μ��� �����, ��տ���
 */
--�����纰 ��ǰ���� ��ȸ
SELECT maker, COUNT(*) AS ��ǰ�� 
FROM product 
GROUP BY MAKER 
--HAVING COUNT(*)>1; --GROUP BY �ÿ� ������ �ο��� �� HAVING �̿�
ORDER BY ��ǰ�� DESC
----------------------------------------------------
--������ MAKER �� ��ǰ��հ��� ��ȸ�ϵ� ��հ� ������������ �����Ͽ� ��ȸ�Ѵ�.
SELECT maker, AVG(price) AS ��հ� 
FROM product 
GROUP BY MAKER 
ORDER BY ��հ� DESC
--��ǰ��հ� 1500�� �ʰ��ϴ� ��ǰ�鸸 ��ȸ�ϵ�, MAKER�� ��ǰ��, ��հ��� ��ȸ�Ѵ�
--MAKER, ��ǰ��, ��հ��� ��ȸ�ǰ� ��հ� ��������
SELECT maker, COUNT(*)AS ��ǰ��, AVG(price) AS ��հ�
FROM product
GROUP BY maker
HAVING AVG(price)>1500
ORDER BY ��հ� ASC

INSERT INTO employee(empno,name,job,salary)VALUES(employee_seq.nextval,'������','��ȹ',900);
INSERT INTO employee(empno,name,job,salary)VALUES(employee_seq.nextval,'����','��ȹ',1000);
INSERT INTO employee(empno,name,job,salary)VALUES(employee_seq.nextval,'�缺��','��ȹ',700);
----------------
SELECT*FROM employee
--job �÷��� �������� �׷�ȭ job, �����, ��տ��� ��������
SELECT job,COUNT(*) AS �����, ROUND(AVG(salary)) AS ��տ��� 
FROM employee 
GROUP BY job 
ORDER BY ��տ��� DESC
--job�� ��տ����� 500�� �ʰ��ϴ� job���� ��ȸ�ϴ� ������ �׷� ��ȸ ������ �߰�
SELECT job,COUNT(*) AS �����, ROUND(AVG(salary)) AS ��տ��� 
FROM employee 
GROUP BY job 
HAVING ROUND(AVG(salary))>500
ORDER BY ��տ��� DESC
--job �׷캰 ���� ���� salary(��Ī highsal)�� job�� ��ȸ(highsal ��������)
SELECT job, MAX(salary) AS highsal
FROM employee
GROUP BY job
ORDER BY highsal DESC;

-- job�� ������ ��ȸ�Ѵ�.
SELECT DISTINCT(job) FROM employee;
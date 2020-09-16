/*
 	JOIN SQL - ���� ���̺��� �����Ͽ� ������ ��ȸ�ϱ� ���� SQL
 	INNER JOIN - JOIN ���ǿ��� ���� ��ġ�ϴ� ���� ��ȯ
 		1) equi-join 2) non-equi-join
 		
 	OUTER JOIN - JOIN ���ǿ��� ���� ���� ��ġ���� �ʴ��� ���� ��ȯ
 	
  	SELF JOIN	
 */
--------------------------------------------
/*
		1.INNER JOIN
		1)equi join:���� ��� ���̺��� �����ϴ� �÷� ������ ��Ȯ�ϰ�
					��ġ�ϴ� ��쿡 ����ϴ� JOIN
					WHERE ���� = �����ڸ� �̿��� ���������� ���
					(����� �μ����̺��� �μ���ȣ�� �̿��� ����)
		2)non-equi-join:���� ���̺� ���� �����ϴ� �÷� ������ ���� ��
						����ϴ� JOIN
						(��� ���̺�� ���޵�����̺��� �÷��� �������� ������
						����� ���� ����� Ȯ���ϱ� ���� non-equi-join�̿�)
						WHERE ���� > �� ���� �����ڸ� �̿��� ���� ������ ���
 
*/
SELECT e.empno,e.ename,d.deptno,d.dname,d.loc
FROM emp e, dept d
WHERE e.deptno=d.deptno --���� ����
--�� SQL�� JOIN ON���� ǥ��
SELECT e.empno,e.ename,d.deptno,d.dname,d.loc
FROM emp e
INNER JOIN dept d ON e.deptno=d.deptno
--�� SQL�� JOIN USING���� ǥ��
SELECT e.empno,e.ename,deptno,d.dname,d.loc
FROM emp e
INNER JOIN dept d USING(deptno)

--���� ���� sal ������ �޴� ��� emp�� empno,ename,sal,deptno,loc�� ��ȸ
SELECT MAX(sal)FROM emp;
SELECT*FROM emp WHERE sal=5000;

--subquery�� join�� �̿��� ��ȸ
SELECT e.empno,e.ename,e.sal,d.deptno,d.loc
FROM emp e, dept d
WHERE e.deptno=d.deptno AND sal=(SELECT MAX(sal) FROM emp);

--non-equi-join
--ex) emp(���)		salgrade(���޵��)
--		sal				hisal, losal
--	�� ���̺��� �������� ����� sal�� salgrade�� �ְ�� hisal�� ������ losal ���̿� �ִ�.
SELECT*FROM emp;

SELECT e.ename, e.sal, s.grade,s.losal,s.hisal
FROM emp e, salgrade s
WHERE e.ename='SMITH' AND e.sal>=s.losal AND e.sal<=s.hisal; 

/*
	2.OUTER JOIN
	�Ϲ����� ���� ���ǿ� �������� �ʴ� ��쿡��
	�ٸ� ���� ��ȸ�ϱ� ���� ���
	�� INNER JOIN�� ���̺� ���� �÷��� ��ġ�Ǵ� ���� ���� ��쿡�� ��ȸ���� �ʴ´�.
	
	HOW? JOIN ���ǿ�(+)�� ���(���ν�ų ���� ���� ���� ǥ��)
	SELECT COLUMN ...
	FROM TABLE1,TABLE2
	WHERE TABLE1,�÷�(+)=TABLE2.�÷�;
	
	OUTER JOIN ��ʸ� ����
*/
SELECT DISTINCT(deptno)FROM emp;

SELECT DISTINCT(deptno)FROM dept;
-- �⺻ INNER JOIN������ ����� ���� �μ� ��ȣ 40�� �ش��ϴ� �μ������� ��ȸ���� �ʴ´�
SELECT e.ename, d.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno=d.deptno
ORDER BY e.deptno ASC;
--����� ���� �μ��������� ��� ��ȸ�ϰ��� �� ���� OUTER JOIN�� �̿��Ѵ�.
SELECT e.ename, d.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno(+)=d.deptno --�����Ͱ� �����ʿ� +�� �ٴ´� 
ORDER BY e.deptno ASC;

--LEFT OUTER JOIN ���·� �� SQL�� ����Ѵ�
--���� ���̺��� ����(dept d)�� ���ǿ� ���յ��� �ʾƵ� ��� ��ȸ
SELECT e.ename, d.deptno, d.dname
FROM dept d
LEFT OUTER JOIN emp e
ON d.deptno=e.deptno;

--RIGHT OUTER JOIN ���·� ���
--������ ���̺��� ����(dept d)�� ���ǿ� ���յ��� �ʾƵ� ��� ��ȸ
SELECT e.ename, d.deptno, d.dname
FROM emp e
RIGHT OUTER JOIN dept d
ON d.deptno=e.deptno;

/*
 * 	3.SELF JOIN: ���̺� ��ü���� ����
 * 	������ ���̺������� ���������� �ٸ� ������ ����
 * 	��� -  
 */
--SMITH�� �Ŵ�����ȣmgr�� 7902�̴�
SELECT empno,ename,mgr FROM emp WHERE empno=7369;
--SMITH�� �Ŵ�����ȣ mgr�� �� �ٸ� ����� empno�̴�
SELECT empno,ename,mgr FROM emp WHERE empno=7902;

SELECT*FROM emp

--���� ������� �����ȣempno, �����ename, �Ŵ�����ȣmgr, �Ŵ������� ��ȸ
SELECT e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp e, emp m
WHERE e.mgr=m.empno;
--�� SQL�� INNER JOIN���¹����� �Ŵ����� ���� ����� ���ܵǾ� 13���� ��ȸ(���� 14��)
--�Ŵ����� ���� ������� ��� ��ȸ�ϰ��� �� ���� OUTER JOIN�� �̿��Ѵ�.
SELECT e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp e, emp m
WHERE e.mgr=m.empno(+);

--7369 empno�� ename�� dname, �Ŵ�����(m.ename), grade(���޵��)�� ��ȸ
SELECT e.ename,d.dname,m.ename,s.grade
FROM emp e, dept d, emp m, salgrade s 
WHERE e.empno=7369
AND e.deptno=d.deptno
AND e.mgr=m.empno
AND e.sal>=s.losal
AND e.sal<=s.hisal;

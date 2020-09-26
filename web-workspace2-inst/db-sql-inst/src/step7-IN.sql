/*  IN ������ 
 *  Ư������ ���ԵǴ� �����͸� ��ȸ�ϰ��� �� �� ����ϴ� ������
 *  SELECT �÷�,�÷�
 *  FROM ���̺��
 *  WHERE �÷� IN('�Ե�','���׷�','����');
 * 
 *  NOT IN ������ 
 *  Ư������ ���Ե��� �ʴ� �����͸� ��ȸ�ϰ��� �� �� ����ϴ� ������
 *  SELECT �÷�,�÷�
 *  FROM ���̺��
 *  WHERE �÷�  NOT IN('�Ե�','���׷�','����');
 */
 -- MAKER�� �Ե� ���� ���׷��� ��ǰ�� ������ ��ȸ�Ѵ� 
 SELECT * FROM product
 WHERE maker='�Ե�' or maker='����' or maker='���׷�';
 -- �� sql �� IN���� ��ȸ�غ��� 
 SELECT * FROM product 
 WHERE maker IN('�Ե�','����','���׷�');

 -- MAKER�� �Ե��� �ƴ� ��ǰ���� ��ȸ 
 SELECT * FROM product
 WHERE maker<>'�Ե�' AND maker<>'����' AND maker<>'���׷�';
 
 -- �� sql �� NOT IN ���� ��ȸ 
 SELECT * FROM product
 WHERE maker NOT IN('�Ե�','����','���׷�');
 
 -- MAKER �� ��ǰ���� �ϳ��� MAKER�� ��ǰ�� ��ȸ (Subquery�� �̿�)
 -- 1. GROUP BY �� �̿��� MAKER �� ��ǰ���� Ȯ�� 
 --  ũ���  1 ...
 		SELECT maker,COUNT(*) FROM product
 		GROUP BY maker;
 -- 2. GROUP BY ������ HAVING�� �̿��� ��ǰ���� 1���� MAKER�鸸 ��ȸ 
 		SELECT maker,COUNT(*) FROM product
 		GROUP BY maker
 		HAVING COUNT(*)=1;
 -- 3. IN(SUBQUERY) �� �̿��� ��ǰ ������ ��ȸ 	 
 		SELECT * FROM product
 		WHERE maker IN(
 			SELECT maker FROM product
 			GROUP BY maker
 			HAVING COUNT(*)=1
 		);
 
 --  ��ü ����� ��� ���� 
 SELECT AVG(salary) FROM employee;
 
 SELECT * FROM employee;
 
 -- ��ü ��� ��� ���޺��� JOB�� ��տ����� ���� JOB�� ��� ������ ��ȸ ( job,name ) 
 -- 1) ��ü ��� ��� ���� 
 		SELECT AVG(salary) FROM employee;
 -- 2) JOB�� ��տ��� 
 		SELECT job,AVG(salary) FROM employee
 		GROUP BY job
 -- 3) ��ü ��� ��� ���޺��� ���� �޴� JOB 
 		SELECT job FROM employee
 		GROUP BY job
 		HAVING AVG(salary) > (
 			SELECT AVG(salary) FROM employee
 		)
 -- 4) �� JOB�� ����� job�� name 
 		SELECT job,name FROM employee
		WHERE job IN(
			SELECT job FROM employee
 			GROUP BY job
 			HAVING ROUND(AVG(salary)) > (
 			SELECT AVG(salary) FROM employee
 			)
		);



 
 
 
 
 
 
 
 





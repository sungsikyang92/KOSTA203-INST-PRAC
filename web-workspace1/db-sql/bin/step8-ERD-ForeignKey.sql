/*
 * ERD, Foreign Key, Join
 * 
 * ERD(Entity Relationship Diagram)
 * :��ü ���� �𵨸�, ������ �����ͺ��̽� ���踦 ���� ���̾�׷�
 * 
 * �� ������ �𵨸�
 * -������ ������ ���� �� ���踦 ������ ��.
 * 	��ü ���� ������ ���� ������Ҹ� �����ϰ� Ȯ���� �� �ִ�.
 * 
 * ���� ������ �𵨸�
 * -�� ������ ���� DBMS Ư���� �°� ��üȭ��Ų ���� ���Ѵ�.
 * 
 * �ĺ�����(Identified Relationship):	�θ� ���̺��� �⺻Ű Ȥ�� ����Ű��
 *									�ڽ� ���̺��� �⺻Ű Ȥ�� ����Ű�� ����������
 * 									���̵Ǵ� ����(ex-����� ��ü����)
 * 
 * ��ĺ�����(Non-Identified Relationship):	�θ� ���̺��� �⺻Ű Ȥ�� ����Ű��
 * 										�ڽ� ���̺��� �ϹݼӼ����� ���̵Ǵ� ����
 * 										(ex-�μ��� �������) 
 * 
 * ����ȭ(Normalization)- �����ͺ��̽� ����� �ߺ��� �ּ�ȭ�ϵ��� �����͸� ����ȭ�ϴ� �۾�.
 * 
 * ���) ��������� �����ϴ� ���̺� ���� 
 * 		�����ȣ, �����, ����, ����, �μ���, �μ�����, �μ���ǥ��ȣ, ...
 * 
 * 		���� ������
 * 		1.	������, ���� 1000 �������ߺ� �Ǳ� 0311231234..
 * 		2.	�����, ���� 2000 ��������� ��ȭ�� 024321321
		
		���� ���� ���·� ���̺��� �����ϸ� �ߺ��� �μ������� �ݺ������� ����
		�μ����� ������ �ټ��� ������ ����Ǿ�� �Ѵ�

		�� ��� ���̺��� ����  �� ����ȭ

		�μ����̺�			�������	
			   |------0|��

		�μ��� ����� 0���� �ټ� ����� ������ �� �ִ�
		����� �ݵ�� �ϳ��� �μ��� ���ؾ� �Ѵ�.

		������̺�
		�����ȣ	�����	����	�μ���ȣ	�÷�	Ű	������	��ȯ

		���� ���̺� ������ �ʿ�(����� �ó������� Ư���� ��쿡 �ʿ�ø� ��ȸ)

		������̺�		��ü�������̺�� �����ϴ� ���� �ٶ����ϴ�
					(�����ȣ�� �ܷ�ŰForeigh key�� ����)
					
	Foreign key(�ܷ�Ű):���� ���Ἲ�� ���� ��������
					    �ٸ� ���̺� ������ �����ϱ� ���� ���
					  ex) ���  ���̺�� ��ü���� ���̺��� �ְ�
						    ��ü���� ���̺��� ���Ἲ�� �����ϴ� �����͸� �����ϱ� ���ؼ���
						    ��� ���̺��� pk�� �����ȣ�� �����ؾ� �Ѵ�
						  (��������  Foreign key�� ����)
*/
DROP TABLE department;

CREATE TABLE department(
	deptno NUMBER PRIMARY KEY,
	dname VARCHAR2(100) NOT NULL,
	loc VARCHAR2(100) NOT NULL,
	tel VARCHAR2(100) NOT NULL
)
DROP TABLE k_employee;

CREATE TABLE k_employee(
	empno NUMBER PRIMARY KEY,
	ename VARCHAR2(100) NOT NULL,
	sal NUMBER NOT NULL,
	deptno NUMBER NOT NULL,
	CONSTRAINT fk_deptno FOREIGN KEY(deptno)REFERENCES department(deptno)
)
--CONSTRAINT �������Ǹ� fk_deptno FOREIGN KEY(�÷���)REFERENCES �������̺��(�÷���)
--���� ��� ���̺�(department)�� �θ� ���̺��̶�� �ϰ�
--�����ϴ� ���̺�(k_employee)�� �ڽ� ���̺��̶�� �Ѵ�
--�ڽ� ���̺��� FOREIGN KEY�� �����ϴ� ���̺��̴�.
--���̺� ������ �ݵ�� �θ� ���̺��� ���� ����� ���Ŀ� �ڽ����̺��� �����ؾ� �Ѵ�

--ERROR: ���� ���Ἲ ���� ������ ���� parent key not found
--FOREIGN KEY �������ǿ� ���� �μ����̺� �������� �ʴ� �μ���ȣ�� �Է��Ϸ� �Ͽ� ������ ����.
INSERT INTO K_employee(empno,ename,sal,deptno)VALUES(1,'�����',500,10);
INSERT INTO k_employee(empno,ename,sal,deptno)VALUES(2,'�ۿ���',1000,10);
INSERT INTO k_employee(empno,ename,sal,deptno)VALUES(3,'�����',800,20);
INSERT INTO department(deptno,dname,loc,tel)VALUES(10,'������ȹ','�Ǳ�','031');
INSERT INTO department(deptno,dname,loc,tel)VALUES(20,'�������','����','02');
INSERT INTO department(deptno,dname,loc,tel)VALUES(30,'�ؾ����','�λ�','051');

SELECT*FROM department;
SELECT COUNT(*) FROM department;
SELECT*FROM k_employee;
SELECT COUNT(*) FROM k_employee;

---------------------------------------------------------------------------------
--����� ����� �����ȣ, �����, ����, �μ���ȣ, �μ���, ������ ��ȸ�ϰ��� �Ѵ�.
SELECT*FROM k_employee;
SELECT*FROM department WHERE deptno=10;
--�� �� SQL�� �ϳ��� SQL�� ǥ��
/*
	JOIN SQL: �ϳ� �̻��� ���̺� ���� ������ �����ϱ� ���� SQL
	EX) ����� ��� ���� �� ����� ���� �μ� ������ �Բ� ��ȸ�ϱ� ���� JOIN SQL�� �̿�
		k_employee ���̺�� department ���̺��� �����Ͽ� ��ȸ�Ѵ�.
	
	SELECT ��Ī.�÷���, ��Ī,�÷���, ��Ī.������
	FROM ���̺�� ��Ī, ���̺�� ��Ī
	WHERE ��Ī.�÷���=��Ī.�÷��� --JOIN ����!	
	
	���� �̿�ÿ��� ��Ī�� ����. �� ���̺� �÷����� �ߺ��� �� �ֱ� ����.
 */
--SELECT e.*,d.*
SELECT e.empno,e.ename,e.sal,e.deptno,d.deptno,d.dname,d.loc,d.tel
FROM k_employee e, department d
WHERE e.deptno=d.deptno

--empno�� 2�� ����� ename�� dname�� ��ȸ�ϼ���(join �̿�)
SELECT e.ename,d.dname
FROM k_employee e, department d
WHERE e.deptno=d.deptno AND e.empno=2



SELECT e.*,d.*
FROM k_employee e, department d
WHERE e.deptno=d.deptno AND e.empno=2


SELECT e.ename,e.sal,d.deptno,d.dname,d.loc,d.tel
FROM k_employee e, department d
WHERE e.empno=1 AND e.deptno=d.deptno


select * from k_employee

select * from department












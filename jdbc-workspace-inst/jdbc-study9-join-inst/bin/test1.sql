SELECT e.ename,e.sal,d.deptno,d.loc,d.tel
FROM k_employee e,department d
WHERE e.deptno=d.deptno AND e.empno=1
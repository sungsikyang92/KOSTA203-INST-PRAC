/*
 	JOIN SQL - 여러 테이블을 결합하여 정보를 조회하기 위한 SQL
 	INNER JOIN - JOIN 조건에서 값이 일치하는 행을 반환
 		1) equi-join 2) non-equi-join
 		
 	OUTER JOIN - JOIN 조건에서 한쪽 값이 일치하지 않더라도 행을 반환
 	
  	SELF JOIN	
 */
--------------------------------------------
/*
		1.INNER JOIN
		1)equi join:조인 대상 테이블의 상응하는 컬럼 정보가 정확하게
					일치하는 경우에 사용하는 JOIN
					WHERE 절에 = 연산자를 이용해 조인조건을 명시
					(사원과 부서테이블의 부서번호를 이용해 조인)
		2)non-equi-join:조인 테이블 간의 상응하는 컬럼 정보가 없을 때
						사용하는 JOIN
						(사원 테이블과 월급등급테이블은 컬럼에 연관성은 없지만
						사원의 월급 등급을 확인하기 위해 non-equi-join이용)
						WHERE 절에 > 와 같은 연산자를 이용해 조인 조건을 명시
 
*/
SELECT e.empno,e.ename,d.deptno,d.dname,d.loc
FROM emp e, dept d
WHERE e.deptno=d.deptno --조인 조건
--위 SQL을 JOIN ON으로 표현
SELECT e.empno,e.ename,d.deptno,d.dname,d.loc
FROM emp e
INNER JOIN dept d ON e.deptno=d.deptno
--위 SQL을 JOIN USING으로 표현
SELECT e.empno,e.ename,deptno,d.dname,d.loc
FROM emp e
INNER JOIN dept d USING(deptno)

--가장 높은 sal 월급을 받는 사원 emp의 empno,ename,sal,deptno,loc를 조회
SELECT MAX(sal)FROM emp;
SELECT*FROM emp WHERE sal=5000;

--subquery와 join을 이용해 조회
SELECT e.empno,e.ename,e.sal,d.deptno,d.loc
FROM emp e, dept d
WHERE e.deptno=d.deptno AND sal=(SELECT MAX(sal) FROM emp);

--non-equi-join
--ex) emp(사원)		salgrade(월급등급)
--		sal				hisal, losal
--	두 테이블의 연관성은 사원의 sal과 salgrade의 최고액 hisal과 최저액 losal 사이에 있다.
SELECT*FROM emp;

SELECT e.ename, e.sal, s.grade,s.losal,s.hisal
FROM emp e, salgrade s
WHERE e.ename='SMITH' AND e.sal>=s.losal AND e.sal<=s.hisal; 

/*
	2.OUTER JOIN
	일반적인 조인 조건에 만족하지 않는 경우에도
	다른 행을 조회하기 위해 사용
	→ INNER JOIN은 테이블 간의 컬럼에 일치되는 값이 없는 경우에는 조회되지 않는다.
	
	HOW? JOIN 조건에(+)을 명시(조인시킬 값이 없는 측에 표기)
	SELECT COLUMN ...
	FROM TABLE1,TABLE2
	WHERE TABLE1,컬럼(+)=TABLE2.컬럼;
	
	OUTER JOIN 사례를 정리
*/
SELECT DISTINCT(deptno)FROM emp;

SELECT DISTINCT(deptno)FROM dept;
-- 기본 INNER JOIN에서는 사원이 없는 부서 번호 40에 해당하는 부서정보는 조회되지 않는다
SELECT e.ename, d.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno=d.deptno
ORDER BY e.deptno ASC;
--사원이 없는 부서정보까지 모두 조회하고자 할 때는 OUTER JOIN을 이용한다.
SELECT e.ename, d.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno(+)=d.deptno --데이터가 없는쪽에 +가 붙는다 
ORDER BY e.deptno ASC;

--LEFT OUTER JOIN 형태로 위 SQL을 기술한다
--왼쪽 테이블의 정보(dept d)는 조건에 부합되지 않아도 모두 조회
SELECT e.ename, d.deptno, d.dname
FROM dept d
LEFT OUTER JOIN emp e
ON d.deptno=e.deptno;

--RIGHT OUTER JOIN 형태로 기술
--오른쪽 테이블의 정보(dept d)는 조건에 부합되지 않아도 모두 조회
SELECT e.ename, d.deptno, d.dname
FROM emp e
RIGHT OUTER JOIN dept d
ON d.deptno=e.deptno;

/*
 * 	3.SELF JOIN: 테이블 자체에서 조인
 * 	동일한 테이블이지만 개념적으로 다른 정보를 결합
 * 	사례 -  
 */
--SMITH의 매니저번호mgr은 7902이다
SELECT empno,ename,mgr FROM emp WHERE empno=7369;
--SMITH의 매니저번호 mgr은 또 다른 사원의 empno이다
SELECT empno,ename,mgr FROM emp WHERE empno=7902;

SELECT*FROM emp

--현재 사원들의 사원번호empno, 사원명ename, 매니저번호mgr, 매니저명을 조회
SELECT e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp e, emp m
WHERE e.mgr=m.empno;
--위 SQL은 INNER JOIN형태미으로 매니저가 없는 사원은 제외되어 13명이 조회(원래 14명)
--매니저가 없는 사원까지 모두 조회하고자 할 때는 OUTER JOIN을 이용한다.
SELECT e.empno, e.ename, e.mgr, m.empno, m.ename
FROM emp e, emp m
WHERE e.mgr=m.empno(+);

--7369 empno의 ename과 dname, 매니저명(m.ename), grade(월급등급)을 조회
SELECT e.ename,d.dname,m.ename,s.grade
FROM emp e, dept d, emp m, salgrade s 
WHERE e.empno=7369
AND e.deptno=d.deptno
AND e.mgr=m.empno
AND e.sal>=s.losal
AND e.sal<=s.hisal;

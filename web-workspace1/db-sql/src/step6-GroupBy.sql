/*	GROUP BY: 테이블에서 특정 컬럼을 기준으로 그룹화하여 검색할 때 사용,
 * 		   		그룹함수와 함께 사용(그룹함수 - MAX, MIN, COUNT)
 *	HAVING: GROUP BY와 함께 사용하는 조건절(그룹에 대한 조건을 지정)
 *	
 *	예) 상품테이블에서 제조사별 상품수, 평균가격, 부서별 사원수, 평균월급
 */
--제조사별 상품수를 조회
SELECT maker, COUNT(*) AS 상품수 
FROM product 
GROUP BY MAKER 
--HAVING COUNT(*)>1; --GROUP BY 시에 조건을 부여할 때 HAVING 이용
ORDER BY 상품수 DESC
----------------------------------------------------
--제조사 MAKER 별 상품평균가를 조회하되 평균가 내림차순으로 정렬하여 조회한다.
SELECT maker, AVG(price) AS 평균가 
FROM product 
GROUP BY MAKER 
ORDER BY 평균가 DESC
--상품평균가 1500을 초과하는 상품들만 조회하되, MAKER별 상품수, 평균가를 조회한다
--MAKER, 상품수, 평균가가 조회되고 평균가 오름차순
SELECT maker, COUNT(*)AS 상품수, AVG(price) AS 평균가
FROM product
GROUP BY maker
HAVING AVG(price)>1500
ORDER BY 평균가 ASC

INSERT INTO employee(empno,name,job,salary)VALUES(employee_seq.nextval,'강지훈','기획',900);
INSERT INTO employee(empno,name,job,salary)VALUES(employee_seq.nextval,'강희석','기획',1000);
INSERT INTO employee(empno,name,job,salary)VALUES(employee_seq.nextval,'양성식','기획',700);
----------------
SELECT*FROM employee
--job 컬럼을 기준으로 그룹화 job, 사원수, 평균월급 내림차순
SELECT job,COUNT(*) AS 사원수, ROUND(AVG(salary)) AS 평균월급 
FROM employee 
GROUP BY job 
ORDER BY 평균월급 DESC
--job별 평균월급이 500을 초과하는 job들을 조회하는 것으로 그룹 조회 조건을 추가
SELECT job,COUNT(*) AS 사원수, ROUND(AVG(salary)) AS 평균월급 
FROM employee 
GROUP BY job 
HAVING ROUND(AVG(salary))>500
ORDER BY 평균월급 DESC
--job 그룹별 가장 높은 salary(별칭 highsal)와 job을 조회(highsal 내림차순)
SELECT job, MAX(salary) AS highsal
FROM employee
GROUP BY job
ORDER BY highsal DESC;

-- job의 종류만 조회한다.
SELECT DISTINCT(job) FROM employee;
/*  GROUP BY : 테이블에서 특정 컬럼을 기준으로 그룹화하여 검색할 때 사용 , 
 *                 그룹함수와 함께 사용
 * 					(그룹함수 - MAX, MIN , AVG , COUNT ) 
 *  HAVING : GROUP BY와 함께 사용하는 조건절 ( 그룹에 대한 조건을 지정 ) 
 * 					
 *  예) 상품테이블에서 제조사별 상품수, 평균가격   ,  부서별 사원수 , 평균월급 
 */
-- 제조사별 상품수를 조회 
SELECT MAKER, COUNT(*) AS 상품수
FROM PRODUCT
GROUP BY MAKER
-- HAVING COUNT(*)>1 -- GROUP BY 시에 조건을 부여할 때 HAVING 이용 
ORDER BY 상품수 DESC
--------------------------------------------
-- 제조사MAKER 별 상품평균가를 조회하되 평균가 내림차순으로 정렬하여 조회 (MAKER,평균가)
SELECT MAKER, AVG(PRICE) AS 평균가
FROM PRODUCT
GROUP BY MAKER
ORDER BY 평균가 DESC;
-- MAKER 별  상품평균가 1500 을 초과하는 상품들만 조회하되 ,
--  MAKER 별 상품수, 평균가를 조회한다 
--	MAKER, 상품수 , 평균가 가 조회되고 평균가 오름차순으로 정렬 
SELECT MAKER,COUNT(*) AS 상품수, AVG(PRICE) AS 평균가
FROM PRODUCT
GROUP BY MAKER
HAVING AVG(PRICE)>1500
ORDER BY 평균가 ASC;

-- 
SELECT * FROM employee;

INSERT INTO employee(empno,name,job,salary) VALUES(employee_seq.nextval,'강지훈','기획',900);
INSERT INTO employee(empno,name,job,salary) VALUES(employee_seq.nextval,'강희석','기획',1000);
INSERT INTO employee(empno,name,job,salary) VALUES(employee_seq.nextval,'양성식','기획',700);
-- job 컬럼을 기준으로 그룹화   job , 사원수 , 평균월급 내림차순 
-- job 별 평균월급이 500을 초과하는 job들 조회하는 것으로 그룹 조회 조건을 추가 
SELECT job,COUNT(*) as 사원수,ROUND(AVG(salary)) as 평균월급
FROM employee
GROUP BY job
--HAVING ROUND(AVG(salary))>500
ORDER BY 평균월급 DESC;

-- job 그룹별 가장 높은 salary (별칭 highsal ) 와 job 을 조회(highsal 내림차순)
SELECT job, MAX(salary) as highsal 
FROM employee
GROUP BY job
ORDER BY highsal DESC;

-- job 의 종류만 조회 
SELECT DISTINCT(job) FROM employee;
















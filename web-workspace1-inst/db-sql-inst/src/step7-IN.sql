/*  IN 연산자 
 *  특정값이 포함되는 데이터를 조회하고자 할 때 사용하는 연산자
 *  SELECT 컬럼,컬럼
 *  FROM 테이블명
 *  WHERE 컬럼 IN('롯데','빙그레','진로');
 * 
 *  NOT IN 연산자 
 *  특정값이 포함되지 않는 데이터를 조회하고자 할 때 사용하는 연산자
 *  SELECT 컬럼,컬럼
 *  FROM 테이블명
 *  WHERE 컬럼  NOT IN('롯데','빙그레','진로');
 */
 -- MAKER가 롯데 진로 빙그레인 상품의 정보를 조회한다 
 SELECT * FROM product
 WHERE maker='롯데' or maker='진로' or maker='빙그레';
 -- 위 sql 을 IN으로 조회해본다 
 SELECT * FROM product 
 WHERE maker IN('롯데','진로','빙그레');

 -- MAKER가 롯데가 아닌 상품들을 조회 
 SELECT * FROM product
 WHERE maker<>'롯데' AND maker<>'진로' AND maker<>'빙그레';
 
 -- 위 sql 을 NOT IN 으로 조회 
 SELECT * FROM product
 WHERE maker NOT IN('롯데','진로','빙그레');
 
 -- MAKER 별 상품수가 하나인 MAKER의 상품을 조회 (Subquery를 이용)
 -- 1. GROUP BY 를 이용해 MAKER 별 상품수를 확인 
 --  크라운  1 ...
 		SELECT maker,COUNT(*) FROM product
 		GROUP BY maker;
 -- 2. GROUP BY 조건절 HAVING을 이용해 상품수가 1개인 MAKER들만 조회 
 		SELECT maker,COUNT(*) FROM product
 		GROUP BY maker
 		HAVING COUNT(*)=1;
 -- 3. IN(SUBQUERY) 를 이용해 상품 정보를 조회 	 
 		SELECT * FROM product
 		WHERE maker IN(
 			SELECT maker FROM product
 			GROUP BY maker
 			HAVING COUNT(*)=1
 		);
 
 --  전체 사원의 평균 월급 
 SELECT AVG(salary) FROM employee;
 
 SELECT * FROM employee;
 
 -- 전체 사원 평균 월급보다 JOB별 평균월급이 많은 JOB의 사원 정보를 조회 ( job,name ) 
 -- 1) 전체 사원 평균 월급 
 		SELECT AVG(salary) FROM employee;
 -- 2) JOB별 평균월급 
 		SELECT job,AVG(salary) FROM employee
 		GROUP BY job
 -- 3) 전체 사원 평균 월급보다 많이 받는 JOB 
 		SELECT job FROM employee
 		GROUP BY job
 		HAVING AVG(salary) > (
 			SELECT AVG(salary) FROM employee
 		)
 -- 4) 그 JOB인 사원의 job과 name 
 		SELECT job,name FROM employee
		WHERE job IN(
			SELECT job FROM employee
 			GROUP BY job
 			HAVING ROUND(AVG(salary)) > (
 			SELECT AVG(salary) FROM employee
 			)
		);



 
 
 
 
 
 
 
 





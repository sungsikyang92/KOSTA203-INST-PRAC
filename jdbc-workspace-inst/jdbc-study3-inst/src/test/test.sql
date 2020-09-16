SELECT COUNT(*) FROM product;
-- id 로 검색해서 상품이 존재하는 지 유무를 판단 
SELECT COUNT(*) FROM product
WHERE id='d'; -- 없으면 0 을 반환 

SELECT COUNT(*) FROM product
WHERE id='2'; -- 있으면 1을 반환 

SELECT name,price FROM product WHERE price BETWEEN 2000 AND 3000 ORDER BY price DESC;
-- 할인가로 조회 
SELECT name,price-(price*10/100) as 할인가 
FROM product 
ORDER BY price ASC
















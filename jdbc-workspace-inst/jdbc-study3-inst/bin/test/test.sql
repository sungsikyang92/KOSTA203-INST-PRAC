SELECT COUNT(*) FROM product;
-- id �� �˻��ؼ� ��ǰ�� �����ϴ� �� ������ �Ǵ� 
SELECT COUNT(*) FROM product
WHERE id='d'; -- ������ 0 �� ��ȯ 

SELECT COUNT(*) FROM product
WHERE id='2'; -- ������ 1�� ��ȯ 

SELECT name,price FROM product WHERE price BETWEEN 2000 AND 3000 ORDER BY price DESC;
-- ���ΰ��� ��ȸ 
SELECT name,price-(price*10/100) as ���ΰ� 
FROM product 
ORDER BY price ASC
















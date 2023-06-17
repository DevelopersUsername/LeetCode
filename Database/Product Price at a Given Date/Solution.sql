SELECT DISTINCT product_id, 10 AS price
FROM Products
GROUP BY product_id
HAVING (MIN(change_date)) > '2019-08-16'
UNION
SELECT P.product_id, P.new_price AS price
FROM Products P
         INNER JOIN (SELECT product_id, MAX(change_date) AS change_date
                     FROM Products
                     WHERE change_date <= '2019-08-16'
                     GROUP BY product_id) T ON P.product_id = T.product_id AND P.change_date = T.change_date
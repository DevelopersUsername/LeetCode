SELECT p.product_id,
       p.product_name
FROM sales AS s
         INNER JOIN product AS p ON p.product_id = s.product_id
GROUP BY p.product_id,
         p.product_name
HAVING (max(sale_date) BETWEEN '20190101' AND '20190331')
   AND (min(sale_date) BETWEEN '20190101' AND '20190331')
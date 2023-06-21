SELECT product_name, SUM(unit) AS unit
FROM Products
         JOIN Orders O on Products.product_id = O.product_id AND
                          order_date BETWEEN '2020-02-01 00:00:00' AND '2020-02-29 23:59:59'
GROUP BY product_name
HAVING SUM(unit) >= 100
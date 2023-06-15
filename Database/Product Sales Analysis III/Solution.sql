SELECT S.product_id, S.year AS first_year, quantity, price
FROM Sales S
         INNER JOIN (SELECT product_id, MIN(year) AS Year FROM Sales GROUP BY product_id) T
                    ON S.product_id = T.product_id AND S.year = T.Year
SELECT product_name, year, price
FROM sales
         LEFT JOIN product p on sales.product_id = p.product_id
SELECT user_id AS buyer_id, join_date, IF(orders_in_2019 IS NULL, 0, orders_in_2019) AS orders_in_2019
FROM Users
         LEFT JOIN (SELECT COUNT(DISTINCT order_id) AS orders_in_2019, buyer_id
                    FROM Orders
                    WHERE YEAR(order_date) = '2019'
                    GROUP BY buyer_id) AS T ON buyer_id = user_id
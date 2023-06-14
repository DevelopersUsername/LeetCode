SELECT ROUND(SUM(IF(order_date = customer_pref_delivery_date, 1, 0)) / COUNT(DISTINCT customer_id) *
             100, 2) as immediate_percentage
FROM Delivery D
WHERE order_date = (SELECT MIN(order_date) FROM Delivery T WHERE D.customer_id = T.customer_id)
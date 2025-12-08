SELECT customer_id,
       total_orders,
       peak_hour_percentage,
       average_rating
FROM (SELECT customer_id,
             count(DISTINCT order_id)     AS total_orders,
             round(
                     count(
                             DISTINCT IF(
                             (
                                 TIME(order_timestamp) BETWEEN '11:00:00' AND '14:00:00'
                                     OR TIME(order_timestamp) BETWEEN '18:00:00' AND '21:00:00'
                                 ),
                             order_id,
                             NULL
                                      )
                     ) / count(DISTINCT order_id) * 100
             )                            AS peak_hour_percentage,
             round(avg(order_rating), 2)  AS average_rating,
             count(
                     DISTINCT IF(order_rating IS NOT NULL, order_id, NULL)
             ) / count(DISTINCT order_id) AS order_rated
      FROM restaurant_orders
      GROUP BY customer_id) t
WHERE total_orders > 2
  AND peak_hour_percentage >= 60
  AND average_rating >= 4.0
  AND order_rated >= 0.5
ORDER BY average_rating DESC,
         customer_id DESC
SELECT customer_id
FROM customer_transactions
GROUP BY customer_id
HAVING max(transaction_date) - min(transaction_date) >= 30
   AND count(transaction_type = 'purchase') >= 3
   AND sum(
               CASE
                   WHEN transaction_type = 'refund' THEN 1
                   ELSE 0
                   END
       ) / count(transaction_id)::FLOAT * 100 < 20
ORDER BY customer_id
SELECT customer_id, COUNT(v.visit_id) AS count_no_trans
FROM visits AS v
         LEFT JOIN transactions t on v.visit_id = t.visit_id
WHERE transaction_id IS NULL
GROUP BY customer_id
ORDER BY count_no_trans DESC
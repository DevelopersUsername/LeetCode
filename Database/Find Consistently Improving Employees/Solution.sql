WITH reviews AS (SELECT employee_id,
                       review_date,
                       ROW_NUMBER() OVER (
                           PARTITION BY
                               employee_id
                           ORDER BY
                               review_date DESC
                           ) AS rn,
                       (
                           LAG(rating) OVER (
                               PARTITION BY
                                   employee_id
                               ORDER BY
                                   review_date DESC
                               ) - rating
                           ) AS score
                FROM performance_reviews)
SELECT employee_id,
       name,
       SUM(score) AS improvement_score
FROM reviews
         JOIN employees USING (employee_id)
WHERE rn > 1
  AND rn <= 3
GROUP BY 1
HAVING COUNT(*) = 2
   AND MIN(score) > 0
ORDER BY 3 DESC,
         2;
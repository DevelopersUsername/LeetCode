SELECT T.visited_on, SUM(T1.amount) AS amount, ROUND(SUM(T1.amount) / 7, 2) AS average_amount
FROM (SELECT C.visited_on
      FROM Customer C
               JOIN Customer T ON DATEDIFF(C.visited_on, T.visited_on) = 6
      GROUP BY C.visited_on) AS T
         JOIN Customer T1 ON DATEDIFF(T.visited_on, T1.visited_on) BETWEEN 0 AND 6
GROUP BY T.visited_on
ORDER BY visited_on
SELECT T1.person_name
FROM Queue T1
         JOIN Queue T2 ON T1.turn >= T2.turn
GROUP BY T1.turn, T1.person_name
HAVING SUM(T2.weight) <= 1000
ORDER BY T1.turn DESC
LIMIT 1
# 1. Fast solution
SELECT S.user_id, ROUND(AVG(IF(C.action = 'confirmed', 1, 0)), 2) AS confirmation_rate
FROM Signups S
         LEFT JOIN Confirmations C on s.user_id = C.user_id
GROUP BY user_id;

# 2. With sub query
SELECT t.user_id,
       ROUND(IF((t.confirmed_count / COUNT(C.action)) IS NULL, 0, (t.confirmed_count / COUNT(C.action))),
             2) AS confirmation_rate
FROM (SELECT s.user_id, COUNT(C.action) AS confirmed_count
      FROM Signups s
               LEFT JOIN Confirmations C on s.user_id = C.user_id AND C.action = 'confirmed'
      GROUP BY s.user_id) t
         LEFT JOIN Confirmations C on t.user_id = C.user_id
GROUP BY t.user_id, t.confirmed_count
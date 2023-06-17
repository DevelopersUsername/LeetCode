SELECT DISTINCT T1.num AS ConsecutiveNums
FROM Logs T1
         JOIN Logs T2 ON T1.num = T2.num AND T1.id = T2.id + 1
         JOIN Logs T3 ON T1.num = T3.num AND T1.id = T3.id + 2;
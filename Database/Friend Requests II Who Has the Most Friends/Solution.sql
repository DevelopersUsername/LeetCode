SELECT id, SUM(num) AS num
FROM (SELECT accepter_id AS id, COUNT(accepter_id) AS num
      FROM RequestAccepted
      GROUP BY accepter_id
      UNION ALL
      SELECT requester_id AS id, COUNT(requester_id) AS num
      FROM RequestAccepted
      GROUP BY requester_id) AS T
GROUP BY id
ORDER BY num DESC
LIMIT 1
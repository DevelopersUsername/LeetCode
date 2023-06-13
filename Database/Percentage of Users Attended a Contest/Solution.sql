SELECT R.contest_id, ROUND(COUNT(R.user_id) / (SELECT COUNT(user_id) FROM Users) * 100, 2) AS percentage
FROM Register R
GROUP BY contest_id
ORDER BY percentage DESC, contest_id
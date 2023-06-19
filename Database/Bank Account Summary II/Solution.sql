SELECT name, SUM(amount) AS balance
FROM Users
         LEFT JOIN Transactions T on Users.account = T.account
GROUP BY name
HAVING SUM(amount) > 10000
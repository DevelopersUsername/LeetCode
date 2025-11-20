SELECT user_id, email
FROM Users
WHERE email ~ '^[\w]+@[A-Za-z]+\.com$'
ORDER BY user_id;
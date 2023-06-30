SELECT name, IF(SUM(distance) IS NULL, 0, SUM(distance)) AS travelled_distance
FROM Users
         LEFT JOIN Rides R on Users.id = R.user_id
GROUP BY name, user_id
ORDER BY travelled_distance DESC, name
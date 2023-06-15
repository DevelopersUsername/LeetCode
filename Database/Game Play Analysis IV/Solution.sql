SELECT ROUND((SELECT COUNT(DISTINCT a.player_id)
              FROM Activity A
                       INNER JOIN
                   (SELECT player_id, MIN(event_date) AS first_logged
                    FROM Activity
                    GROUP BY player_id) T ON DATEDIFF(A.event_date, T.first_logged) = 1
                       AND A.player_id = T.player_id)
                 /
             (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) AS fraction
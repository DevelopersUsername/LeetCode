SELECT results
FROM (SELECT name AS results
      FROM Users U
               LEFT JOIN MovieRating M ON M.user_id = U.user_id
      GROUP BY name
      ORDER BY COUNT(DISTINCT M.movie_id) DESC, name, LENGTH(name)
      LIMIT 1) AS T1
UNION ALL
SELECT (SELECT M.title AS results
        FROM Movies M
                 LEFT JOIN MovieRating T ON T.movie_id = M.movie_id AND created_at BETWEEN '2020-02-01' AND '2020-02-29'
        GROUP BY title
        ORDER BY AVG(T.rating) DESC, title, LENGTH(title) DESC
        LIMIT 1) AS T2
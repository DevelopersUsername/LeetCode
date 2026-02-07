WITH StadiumGroups AS (SELECT id,
                              visit_date,
                              people,
                              id - ROW_NUMBER() OVER (
                                  ORDER BY
                                      id
                                  ) AS group_id
                       FROM Stadium
                       WHERE people >= 100)
SELECT id,
       visit_date,
       people
FROM StadiumGroups
WHERE group_id IN (SELECT group_id
                   FROM StadiumGroups
                   GROUP BY group_id
                   HAVING COUNT(*) >= 3)
ORDER BY visit_date;
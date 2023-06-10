# MySQL Solution
SELECT w.id AS id
FROM weather AS w
         INNER JOIN weather t on DATE_ADD(w.recorddate, INTERVAL -1 DAY) = t.recorddate AND w.temperature > t.temperature

# PG Solution
#SELECT w.id AS id
#FROM weather AS w
#         INNER JOIN weather t on w.recorddate - INTERVAL '1 day' = t.recorddate AND w.temperature > t.#temperature
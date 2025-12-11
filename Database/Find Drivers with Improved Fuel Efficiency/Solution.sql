WITH stats AS (SELECT driver_id,
                      YEAR(trip_date)                  AS trip_year,
                      MONTH(trip_date) < 7 AS isFirstHalf,
                      avg(distance_km / fuel_consumed) AS efficiency
               FROM trips
               GROUP BY 1,
                        2,
                        3)
SELECT t1.driver_id,
       d.driver_name,
       round(t1.efficiency, 2)                 AS first_half_avg,
       round(t2.efficiency, 2)                 AS second_half_avg,
       round(t2.efficiency - t1.efficiency, 2) AS efficiency_improvement
FROM stats t1
         INNER JOIN stats t2 ON t1.driver_id = t2.driver_id
    AND t1.trip_year = t2.trip_year
    AND t1.isFirstHalf > t2.isFirstHalf
    AND t1.efficiency < t2.efficiency
         LEFT JOIN drivers d ON t1.driver_id = d.driver_id
ORDER BY efficiency_improvement DESC,
         d.driver_name

SELECT e.employee_id,
       e.employee_name,
       e.department,
       COUNT(e.employee_id) AS meeting_heavy_weeks
FROM (SELECT employee_id,
             EXTRACT(
                     WEEK
                     FROM
                     meeting_date
             )                   AS week,
             SUM(duration_hours) AS meet
      FROM meetings
      GROUP BY employee_id,
               week
      HAVING SUM(duration_hours) > 20) AS ws
         LEFT JOIN employees AS e ON ws.employee_id = e.employee_id
GROUP BY e.employee_id,
         e.employee_name,
         e.department
HAVING COUNT(e.employee_id) >= 2
ORDER BY meeting_heavy_weeks DESC,
         e.employee_name
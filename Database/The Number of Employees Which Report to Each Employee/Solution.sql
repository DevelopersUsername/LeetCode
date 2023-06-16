SELECT E.employee_id, E.name, COUNT(T.name) AS reports_count, ROUND(AVG(T.age)) AS average_age
FROM Employees E
         LEFT JOIN Employees T on E.employee_id = T.reports_to
GROUP BY E.employee_id, E.name
HAVING COUNT(T.name) > 0
ORDER BY employee_id
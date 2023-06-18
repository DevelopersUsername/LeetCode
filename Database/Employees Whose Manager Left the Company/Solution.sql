SELECT E.employee_id
FROM Employees E
         LEFT JOIN Employees T on E.manager_id = T.employee_id
WHERE E.salary < 30000
  AND E.manager_id IS NOT NULL
  AND T.employee_id IS NULL
ORDER BY employee_id
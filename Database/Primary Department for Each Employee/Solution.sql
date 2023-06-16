SELECT employee_id, department_id
FROM (SELECT employee_id, MAX(department_id) AS department_id
      FROM Employee
      GROUP BY employee_id
      HAVING COUNT(department_id) = 1
      UNION ALL
      SELECT employee_id, department_id
      FROM Employee
      WHERE primary_flag = 'Y') AS T
GROUP BY employee_id, department_id
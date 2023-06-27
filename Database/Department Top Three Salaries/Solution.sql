SELECT D.name AS Department, E.name AS Employee, T2.salary AS Salary
FROM (SELECT salary, departmentId
      FROM (SELECT salary, departmentId, DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS rg
            FROM Employee
            GROUP BY salary, departmentId) AS T
      WHERE T.rg <= 3) AS T2
         LEFT JOIN Department D ON id = departmentId
         LEFT JOIN Employee E ON T2.salary = E.salary AND T2.departmentId = E.departmentId
ORDER BY T2.departmentId, E.name, salary DESC
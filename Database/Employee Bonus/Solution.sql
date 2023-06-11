SELECT name, bonus
FROM Employee
         LEFT JOIN Bonus B on Employee.empId = B.empId
WHERE bonus < 1000
   OR bonus IS NULL
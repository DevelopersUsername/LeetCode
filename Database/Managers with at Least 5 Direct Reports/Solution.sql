SELECT e.name
FROM Employee e
         LEFT JOIN Employee t ON t.managerId = e.id
GROUP BY e.name
HAVING COUNT(e.name) > 4
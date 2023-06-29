SELECT E.name AS Employee
FROM Employee E
         JOIN Employee T on E.managerId = T.id AND E.salary > T.salary
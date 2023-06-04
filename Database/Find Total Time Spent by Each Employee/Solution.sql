SELECT event_day as day, emp_id, SUM(out_time - employees.in_time) AS total_time
FROM employees
GROUP BY event_day, emp_id
ORDER BY day, total_time DESC;
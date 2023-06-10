SELECT a.machine_id, ROUND(SUM(a.timestamp - t.timestamp) / COUNT(a.process_id), 3) AS processing_time
FROM Activity AS a
         INNER JOIN Activity t
                    on a.machine_id = t.machine_id AND a.process_id = t.process_id AND a.activity_type = 'end' AND
                       t.activity_type = 'start'
GROUP BY a.machine_id
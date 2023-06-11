SELECT s.student_id, student_name, sub.subject_name, COUNT(e.subject_name) AS attended_exams
FROM Students AS s
         JOIN Subjects sub
         LEFT JOIN Examinations e
                   ON e.student_id = s.student_id AND e.subject_name = sub.subject_name
GROUP BY s.student_id, student_name, sub.subject_name, e.subject_name
ORDER BY s.student_id, sub.subject_name, attended_exams DESC
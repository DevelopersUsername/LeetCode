SELECT
    s.student_id,
    s.subject,
    s1.score AS first_score,
    s2.score AS latest_score
FROM
    (
        SELECT
            student_id,
            subject,
            min(exam_date) AS minDate,
            max(exam_date) AS maxDate
        FROM
            scores
        GROUP BY
            student_id,
            subject
        HAVING
            count(DISTINCT exam_date) > 1
    ) s
        LEFT JOIN scores s1 ON s.student_id = s1.student_id
        AND s.subject = s1.subject
        AND s.minDate = s1.exam_date
        LEFT JOIN scores s2 ON s.student_id = s2.student_id
        AND s.subject = s2.subject
        AND s.maxDate = s2.exam_date
WHERE
    s1.score < s2.score
ORDER BY
    s.student_id,
    subject
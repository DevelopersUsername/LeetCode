SELECT user_id,
       round(
               sum(
                       CASE
                           WHEN activity_type = 'free_trial' THEN activity_duration::NUMERIC
                           ELSE 0
                           END
               ) / nullif(
                       count(
                               CASE
                                   WHEN activity_type = 'free_trial' THEN 1
                                   END
                       ),
                       0
                   ),
               2
       ) AS trial_avg_duration,
       round(
               sum(
                       CASE
                           WHEN activity_type = 'paid' THEN activity_duration::NUMERIC
                           ELSE 0
                           END
               ) / nullif(
                       count(
                               CASE
                                   WHEN activity_type = 'paid' THEN 1
                                   END
                       ),
                       0
                   ),
               2
       ) AS paid_avg_duration
FROM useractivity
GROUP BY user_id
HAVING max(activity_type) = 'paid'
ORDER BY user_id
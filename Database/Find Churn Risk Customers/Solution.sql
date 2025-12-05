WITH all_events AS (SELECT user_id,
                           event_id,
                           event_date,
                           event_type,
                           plan_name,
                           monthly_amount,
                           row_number() OVER (
                               PARTITION BY
                                   user_id
                               ORDER BY
                                   event_date DESC,
                                   event_id DESC
                               ) AS rn_latest,
                           max(monthly_amount) OVER (
                               PARTITION BY
                                   user_id
                               ) AS max_revenue,
                           max(
                           CASE
                               WHEN event_type = 'downgrade' THEN 1
                               ELSE 0
                               END
                              ) OVER (
                               PARTITION BY
                                   user_id
                               ) AS has_downgraded,
                           min(event_date) OVER (
                               PARTITION BY
                                   user_id
                               ) AS first_event_date,
                           max(event_date) OVER (
                               PARTITION BY
                                   user_id
                               ) AS last_event_date
                    FROM subscription_events),
     candidates AS (SELECT *,
                           last_event_date - first_event_date AS days_as_subscriber
                    FROM all_events
                    WHERE rn_latest = 1
                      AND event_type != 'cancel'
                      AND monthly_amount < 0.5 * max_revenue
                      AND has_downgraded = 1
                      AND last_event_date - first_event_date >= 60)
SELECT user_id,
       plan_name      AS current_plan,
       monthly_amount AS current_monthly_amount,
       max_revenue    AS max_historical_amount,
       days_as_subscriber
FROM candidates
ORDER BY days_as_subscriber DESC,
         user_id;
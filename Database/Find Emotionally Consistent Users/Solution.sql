WITH count AS (SELECT user_id,
                      reaction AS dominant_reaction,
                      count(*) OVER (
                          PARTITION BY
                              user_id
                          )    AS cnt,
                      round(
                              count(*) OVER (
                                  PARTITION BY
                                      user_id,
                                      reaction
                                  ) * 1.00 / count(*) OVER (
                                  PARTITION BY
                                      user_id
                                  ),
                              2
                      )        AS reaction_ratio
               FROM reactions)
SELECT DISTINCT user_id,
                dominant_reaction,
                reaction_ratio
FROM count
WHERE cnt >= 5
  AND reaction_ratio >= 0.6
ORDER BY reaction_ratio DESC,
         user_id
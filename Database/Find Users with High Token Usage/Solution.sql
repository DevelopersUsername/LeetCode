WITH t AS (SELECT user_id,
                  count(prompts.prompt)         AS prompt_count,
                  round(avg(prompts.tokens), 2) AS avg_tokens,
                  max(prompts.tokens)           AS max_token
           FROM prompts
           GROUP BY 1
           HAVING count(prompts.prompt) >= 3)
SELECT user_id,
       prompt_count,
       avg_tokens
FROM t
WHERE max_token > avg_tokens
ORDER BY avg_tokens DESC,
         t.user_id
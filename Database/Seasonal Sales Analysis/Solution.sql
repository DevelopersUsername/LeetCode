select s.product_id,
       case
           when EXTRACT(MONTH FROM sale_date) > 0 and EXTRACT(MONTH FROM sale_date) < 3 then 'Winter'
           when EXTRACT(MONTH FROM sale_date) > 2 and EXTRACT(MONTH FROM sale_date) < 6 then 'Spring'
           when EXTRACT(MONTH FROM sale_date) > 5 and EXTRACT(MONTH FROM sale_date) < 9 then 'Summer'
           when EXTRACT(MONTH FROM sale_date) > 8 and EXTRACT(MONTH FROM sale_date) < 12 then 'Fall'
           else 'Winter'
           end                 AS season,
       sum(s.quantity)         as quantity,
       sum(s.quantity * price) as total_revenue
from sales s
         inner join (select product_id,
                            case
                                when EXTRACT(MONTH FROM sale_date) > 0 and EXTRACT(MONTH FROM sale_date) < 3
                                    then 'Winter'
                                when EXTRACT(MONTH FROM sale_date) > 2 and EXTRACT(MONTH FROM sale_date) < 6
                                    then 'Spring'
                                when EXTRACT(MONTH FROM sale_date) > 5 and EXTRACT(MONTH FROM sale_date) < 9
                                    then 'Summer'
                                when EXTRACT(MONTH FROM sale_date) > 8 and EXTRACT(MONTH FROM sale_date) < 12
                                    then 'Fall'
                                else 'Winter'
                                end               AS season,
                            sum(quantity)         as quantity,
                            sum(quantity * price) as total_revenue
                     from sales
                     group by product_id, season) t on s.product_id = t.product_id
group by s.product_id, season



SELECT product_id,
       season,
       rank
from (SELECT rank()
             OVER (PARTITION BY quantity, quantity * price ORDER BY product_id, EXTRACT(MONTH FROM sale_date) DESC) AS rank,
             product_id,
             case
                 when EXTRACT(MONTH FROM sale_date) > 0 and EXTRACT(MONTH FROM sale_date) < 3
                     then 'Winter'
                 when EXTRACT(MONTH FROM sale_date) > 2 and EXTRACT(MONTH FROM sale_date) < 6
                     then 'Spring'
                 when EXTRACT(MONTH FROM sale_date) > 5 and EXTRACT(MONTH FROM sale_date) < 9
                     then 'Summer'
                 when EXTRACT(MONTH FROM sale_date) > 8 and EXTRACT(MONTH FROM sale_date) < 12
                     then 'Fall'
                 else 'Winter'
                 end                                                                                                AS season
      FROM sales) sq
WHERE rank = 1;


select category, *
from (select rank() OVER (PARTITION BY season ORDER BY total_quantity, total_revenue DESC) AS rank,
             product_id,
             season,
             total_quantity,
             total_revenue

      from (select product_id,
                   case
                       when EXTRACT(MONTH FROM sale_date) > 0 and EXTRACT(MONTH FROM sale_date) < 3
                           then 'Winter'
                       when EXTRACT(MONTH FROM sale_date) > 2 and EXTRACT(MONTH FROM sale_date) < 6
                           then 'Spring'
                       when EXTRACT(MONTH FROM sale_date) > 5 and EXTRACT(MONTH FROM sale_date) < 9
                           then 'Summer'
                       when EXTRACT(MONTH FROM sale_date) > 8 and EXTRACT(MONTH FROM sale_date) < 12
                           then 'Fall'
                       else 'Winter'
                       end               AS season,
                   sum(quantity)         as total_quantity,
                   sum(quantity * price) as total_revenue
            from sales
            group by product_id, season) t) t1
         left join products on t1.product_id = products.product_id
where rank = 1



WITH
    SeasonalSales AS (
        SELECT
            CASE
                WHEN EXTRACT(MONTH FROM sale_date) IN (12, 1, 2) THEN 'Winter'
                WHEN EXTRACT(MONTH FROM sale_date) IN (3, 4, 5) THEN 'Spring'
                WHEN EXTRACT(MONTH FROM sale_date) IN (6, 7, 8) THEN 'Summer'
                WHEN EXTRACT(MONTH FROM sale_date) IN (9, 10, 11) THEN 'Fall'
                END AS season,
            category,
            SUM(quantity) AS total_quantity,
            SUM(quantity * price) AS total_revenue
        FROM
            sales
                JOIN products USING (product_id)
        GROUP BY 1, 2
    ),
    TopCategoryPerSeason AS (
        SELECT
            *,
            RANK() OVER (
                PARTITION BY season
                ORDER BY total_quantity DESC, total_revenue DESC
                ) AS rk
        FROM SeasonalSales
    )
SELECT season, category, total_quantity, total_revenue
FROM TopCategoryPerSeason
WHERE rk = 1
ORDER BY 1;


SELECT
    p.category,
    (CASE
         WHEN EXTRACT(MONTH FROM s.sale_date) BETWEEN 3 AND 5
             THEN 'Spring'
         WHEN EXTRACT(MONTH FROM s.sale_date) BETWEEN 6 AND 8
             THEN 'Summer'
         WHEN EXTRACT(MONTH FROM s.sale_date) BETWEEN 9 AND 11
             THEN 'Fall'
         ELSE 'Winter'
        END) AS season,
    SUM(s.quantity) AS total_quantity,
    SUM(s.quantity * s.price) AS total_revenue
FROM sales AS s
         LEFT JOIN
     products AS p
     ON s.product_id = p.product_id
GROUP BY s.season, p.category


SELECT season, category, total_quantity, total_revenue
FROM (SELECT *,
             RANK() OVER (
                 PARTITION BY season
                 ORDER BY total_quantity DESC, total_revenue DESC
                 ) AS rank
      FROM (SELECT CASE
                       WHEN EXTRACT(MONTH FROM sale_date) IN (12, 1, 2) THEN 'Winter'
                       WHEN EXTRACT(MONTH FROM sale_date) IN (3, 4, 5) THEN 'Spring'
                       WHEN EXTRACT(MONTH FROM sale_date) IN (6, 7, 8) THEN 'Summer'
                       WHEN EXTRACT(MONTH FROM sale_date) IN (9, 10, 11) THEN 'Fall'
                       END               AS season,
                   category,
                   SUM(quantity)         AS total_quantity,
                   SUM(quantity * price) AS total_revenue
            FROM sales
                     LEFT JOIN products USING (product_id)
            GROUP BY 1, 2) t1) t2
WHERE rank = 1
ORDER BY 1;
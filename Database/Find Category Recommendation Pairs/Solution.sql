WITH userCat AS (SELECT DISTINCT ProductPurchases.user_id,
                                 ProductInfo.category
                 FROM ProductPurchases
                          INNER JOIN ProductInfo USING (product_id)),
     catPairs AS (SELECT userCat.user_id,
                         LEAST(userCat.category, UserCategories2.category)    AS category1,
                         GREATEST(userCat.category, UserCategories2.category) AS category2
                  FROM userCat
                           INNER JOIN userCat AS UserCategories2 ON (
                      userCat.user_id = UserCategories2.user_id
                          AND userCat.category < UserCategories2.category
                      )),
     customerpairs AS (SELECT category1,
                              category2,
                              COUNT(DISTINCT user_id) AS customer_count
                       FROM catPairs
                       GROUP BY 1,
                                2)
SELECT category1,
       category2,
       customer_count
FROM customerpairs
WHERE customer_count > 2
ORDER BY customer_count DESC,
         category1,
         category2;
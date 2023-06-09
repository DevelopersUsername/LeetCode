SELECT product_id, 'store1' AS store, store1 AS price
FROM products
WHERE store1 IS NOT NULL
  AND store1 > 0
UNION
SELECT product_id, 'store2' AS store, store2 AS price
FROM products
WHERE store2 IS NOT NULL
  AND store2 > 0
UNION
SELECT product_id, 'store3' AS store, store3 AS price
FROM products
WHERE store3 IS NOT NULL
  AND store3 > 0
ORDER BY product_id, store
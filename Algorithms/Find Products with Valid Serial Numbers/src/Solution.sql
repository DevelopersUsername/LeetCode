SELECT *
FROM products
WHERE description ~ '( |^)SN\d{4}-\d{4}($|[^\d])'
ORDER BY 1;
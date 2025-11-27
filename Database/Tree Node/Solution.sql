SELECT
    Tree.id,
    CASE
        WHEN Tree.p_id IS NULL THEN 'Root'
        WHEN t.p_id ISNULL THEN 'Leaf'
        ELSE 'Inner'
        END AS type
FROM
    Tree AS TREE
        LEFT JOIN Tree AS t ON Tree.id = t.p_id
GROUP BY
    Tree.id,
    type
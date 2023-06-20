DELETE T
FROM Person P
         JOIN Person T ON P.Email = T.Email AND P.Id < T.Id
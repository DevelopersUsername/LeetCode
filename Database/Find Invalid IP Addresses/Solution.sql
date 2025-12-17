SELECT ip,
       COUNT(*) AS invalid_count
FROM (SELECT ip
      FROM Logs
      WHERE LENGTH(ip) - LENGTH(REPLACE(ip, '.', '')) != 3
         OR ip regexp '(^|\\.)0[0-9]'
         OR ip regexp '(^|\\.)([0-9]{4,}|[3-9][0-9]{2}|2[6-9][0-9]|25[6-9])(\\.|$)') t
GROUP BY ip
ORDER BY invalid_count DESC,
         ip DESC;
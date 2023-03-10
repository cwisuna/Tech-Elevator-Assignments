-- 15. The name and date established of the newest national park.
-- (1 row)
SELECT MAX(date_established) AS date_established, park_name
FROM park
GROUP BY park_name, date_established 
ORDER BY date_established DESC
LIMIT 1;
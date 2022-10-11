-- 14. The name and date established of the top 10 oldest national parks.
-- Order the results with the oldest park first.
-- (10 rows)
SELECT MIN(date_established) date_established, park_name
FROM park
GROUP BY park_name, date_established
ORDER BY date_established ASC
LIMIT 10;
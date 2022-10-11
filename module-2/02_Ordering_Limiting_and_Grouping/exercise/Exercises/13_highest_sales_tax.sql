-- 13. The state (or territory) name and sales tax for the top five highest sales of tax of all states and territories. 
-- Order the results by sales tax with the highest number first, then by state name alphabetically.
-- (5 rows)
SELECT MAX(sales_tax) AS sales_tax, state_name   
FROM state
GROUP BY state_name, sales_tax
ORDER BY sales_tax DESC, state_name ASC
Limit 5;


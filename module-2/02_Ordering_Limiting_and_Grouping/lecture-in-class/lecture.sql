-- Concatenation

SELECT city_name || ', ' || state_abbreviation
from city;



SELECT ABS(-10 + 8) as someNumber,
       -10 + 8 as realResult;
-- ORDERING RESULTS

-- Populations of all states from largest to smallest.

SELECT state_abbreviation, population
from state
ORDER BY population ASC;


SELECT city_name, state_abbreviation
from city
ORDER BY state_abbreviation ASC, city_name DESC
LIMIT 5;



SELECT COUNT(*) as all_states,
	   COUNT(state_nickname) as states_with_nicknames
FROM state;

SELECT COUNT(state_nickname)
from state;

SELECT state_abbreviation, population
FROM state
WHERE population in (
						SELECT MIN(population)
						FROM state);
						
SELECT state_abbreviation, population
FROM state
ORDER BY population ASC
LIMIT 1;


SELECT AVG(population) as avg_city_population,
		AVG(area) as avg_city_area,
		state_abbreviation
from city
group by state_abbreviation

having AVG(population) > 322848
ORDER BY AVG(population),  avg_city_area DESC
;


select census_region,  count(*)
from state
group by census_region
having count(*) > 9



select city_name, count(*)
from city
group by city_name
having count(*) > 1

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT state_name, census_region
from state
--group by census_region, state_name
order by census_region desc , state_name ASC

-- The biggest park by area
SELECT park_name, area
from park
order by area desc
LIMIT 1;

SELECT park_name
from park
ORDER BY area DESC
LIMIT 1;

-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT city_name, population
from city
order by population DESC
LIMIT 10;
-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
--SELECT CURRENT_DATE - date_established as age, CURRENT_DATE as currentDate,  date_established, park_name

SELECT (CURRENT_DATE - date_established) /365 as age, park_name

SELECT (date_part('year', CURRENT_DATE) - date_part('year', date_established)) as age, park_name


SELECT (EXTRACT(year FROM CURRENT_DATE) - EXTRACT(year from date_established)) as age, park_name
from park
ORDER BY age DESC, park_name ASC
LIMIT 20;




-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.


-- The all parks by name and date established.


-- The census region and state name of all states in the West & Midwest sorted in ascending order.



-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG(population)
from state;

-- Total population in the West and South census regions

SELECT SUM(population)
from state
WHERE census_region in ('West', 'South')

SELECT SUM(population)
from state
WHERE census_region = 'West'
OR census_region = 'South'

SELECT SUM(population)
from state
WHERE state_name like '%a%'
and  (census_region = 'West'
		OR 
	census_region = 'South');

SELECT census_region,  SUM(population)
from state
group by census_region
having census_region in ('West', 'South');


SELECT census_region , SUM(population)
from state
WHERE census_region in ('West', 'South')
group by census_region
-- The number of cities with populations greater than 1 million


-- The number of state nicknames.


-- The area of the smallest and largest parks.
SELECT  MIN(area),  MAX(area)
from park;




-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.


-- Determine the average park area depending upon whether parks allow camping or not.


-- Sum of the population of cities in each state ordered by state abbreviation.


-- The smallest city population in each state ordered by city population.



-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)



-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,


-- Include the names of the smallest and largest parks


-- List the capital cities for the states in the Northeast census region.


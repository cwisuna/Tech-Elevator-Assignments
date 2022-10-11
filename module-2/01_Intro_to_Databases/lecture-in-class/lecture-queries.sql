-- SELECT
-- Use a SELECT statement to return a literal string

SELECT 'Hello SQL';

-- Use a SELECT statement to add two numbers together (and label the result "sum")

SELECT 'Hello SQL' as greeting, 2 + 2 as sum;

-- SELECT ... FROM
-- Write queries to retrieve...

-- The names from all the records in the state table

SELECT state_abbreviation, state_name, population
from state;


-- The names and populations of all cities
SELECT  city_name as city, 
		state_abbreviation as state,  
		population
from city;

SELECT  city.city_name , 
		city.state_abbreviation as state, 
		city.population
from city;


SELECT  c.city_name as city , 
		c.state_abbreviation as state, 
		c.population
from city as c;
-- All columns from the park table

SELECT *
from park;


-- SELECT __ FROM __ WHERE
-- Write queries to retrieve...

-- The names of cities in California (CA)
SELECT city_id, city_name
FROM city
WHERE state_abbreviation = 'CA';

-- The names and state abbreviations of cities NOT in California
SELECT city.city_name, 
	   city.state_abbreviation
FROM city
WHERE city.state_abbreviation <> 'CA';

-- The names and areas of cities smaller than 25 square kilometers 
SELECT city.city_name, city.area
FROM city
WHERE city.area < 25;

-- The names from all records in the state table that have no assigned census region
SELECT *
from state
where state.census_region IS NULL;

-- The names and census regions from all records in the state table that have an assigned census region
SELECT state.state_name, state.census_region
FROM state
WHERE state.census_region  IS NOT NULL;


-- WHERE with AND/OR
-- Write queries to retrieve...

-- The names, areas, and populations of cities smaller than 25 sq. km. with more than 100,000 people
SELECT city_name, area, population
FROM city
WHERE city.area < 25 
AND population > 100000;

-- The names and census regions of all states (and territories and districts) not in the Midwest region (including those that don't have any census region)
SELECT *
from state
WHERE census_region <> 'Midwest'
OR census_region IS NULL;


-- The names, areas, and populations of cities in California (CA) or Florida (FL)
SELECT city_name, state_abbreviation, area, population
from city
WHERE state_abbreviation = 'CA' 
OR state_abbreviation = 'FL';


-- The names, areas, and populations of cities in New England -- Connecticut (CT), Maine (ME), Massachusetts (MA), New Hampshire (NH), Rhode Island (RI) and Vermont (VT)

SELECT city_name, state_abbreviation, area, population
from city
WHERE state_abbreviation IN ('CT', 'ME','MA', 'NH', 'RI', 'VT');

SELECT city_name, state_abbreviation, area, population
from city
WHERE state_abbreviation IN (SELECT state.state_abbreviation 
							from state	
							where state.census_region = 'Northeast');



select * from state
WHERE state_abbreviation IN ('CT', 'ME','MA', 'NH', 'RI', 'VT');

-- SELECT statements involving math
-- Write a query to retrieve the names and areas of all parks in square METERS
-- (the values in the database are stored in square kilometers)
-- Label the second column "area_in_square_meters"

SELECT park_name, area, (area * 1000000 ) as area_in_kilometers
from park;

-- All values vs. distinct values

-- Write a query to retrieve the names of all cities and notice repeats (like Springfield and Columbus)
SELECT city_name
from city
WHERE city_name IN ('Springfield', 'Columbus', 'Columbia');


-- Do it again, but without the repeats (note the difference in row count)
SELECT DISTINCT city_name, state_abbreviation
from city
WHERE city_name IN ('Springfield', 'Columbus', 'Columbia');


-- LIKE
-- Write queries to retrieve...

-- The names of all cities that begin with the letter "A"
SELECT city_name
from city
where city_name LIKE 'A%';


-- The names of all cities that end with "Falls"
SELECT city_name
from city
where city_name LIKE '%Falls';


-- The names of all cities that contain a space
SELECT city_name
from city
where city_name LIKE '% %';


-- BETWEEN
-- Write a query to retrieve the names and areas of parks of at least 100 sq. kilometers but no more than 200 sq. kilometers
SELECT park_name, area
FROM park
Where area between 100 and 200;


select park_name, area
FROM park
WHERE area >= 100
AND area <= 200;



-- DATES
-- Write a query to retrieve the names and dates established of parks established before 1900

SELECT park_name, date_established
from park
where date_established <'01/12/1900';

-- select * 
-- from the_table
-- where the_timestamp_column::date = date '2015-07-15';
SELECT park_name, date_established
from park
where date_established::date < date'1900-01-01';



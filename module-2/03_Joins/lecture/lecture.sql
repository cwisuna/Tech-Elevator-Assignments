-- INNER JOIN

-- Write a query to retrieve the name and state abbreviation for the 2 cities named "Columbus" in the database

SELECT city_name, state_abbreviation
FROM city
WHERE city_name = 'Columbus'

-- Modify the previous query to retrieve the names of the states (rather than their abbreviations).

SELECT city_name, city.state_abbreviation, state_name
FROM city
INNER JOIN state
ON state.state_abbreviation = city.state_abbreviation 
WHERE city_name = 'Columbus'

-- Write a query to retrieve the names of all the national parks with their state abbreviations.
-- (Some parks will appear more than once in the results, because they cross state boundaries.)

SELECT park.park_name, park_state.state_abbreviation
FROM park
INNER JOIN park_state
ON park_state.park_id = park.park_id

-- The park_state table is an associative table that can be used to connect the park and state tables.
-- Modify the previous query to retrieve the names of the states rather than their abbreviations.


SELECT park.park_name, park_state.state_abbreviation, state.state_name
FROM park
INNER JOIN park_state
ON park_state.park_id = park.park_id
INNER JOIN state
ON state.state_abbreviation = park_state.state_abbreviation



-- Modify the previous query to include the name of the state's capital city.

SELECT park.park_name, park_state.state_abbreviation, state.state_name
FROM park
INNER JOIN park_state
ON park_state.park_id = park.park_id
INNER JOIN state
ON state.state_abbreviation = park_state.state_abbreviation
INNER JOIN city
ON city.city_id = state.capital

-- Modify the previous query to include the area of each park.

SELECT park.park_name,park.area, park_state.state_abbreviation, state.state_name
FROM park
INNER JOIN park_state
ON park_state.park_id = park.park_id
INNER JOIN state
ON state.state_abbreviation = park_state.state_abbreviation
INNER JOIN city
ON city.city_id = state.capital

-- Write a query to retrieve the names and populations of all the cities in the Midwest census region.

SELECT city.city_name, city.population
FROM city
JOIN state 
ON state.state_abbreviation = city.state_abbreviation
WHERE state.census_region = 'Midwest'


-- Write a query to retrieve the number of cities in the city table for each state in the Midwest census region.

SELECT COUNT(city_name) AS city_count, state.state_name
FROM state
JOIN city 
ON state.state_abbreviation = city.state_abbreviation
WHERE state.census_region = 'Midwest'
GROUP BY state.state_name

-- Modify the previous query to sort the results by the number of cities in descending order.

SELECT COUNT(city_name) AS city_count, state.state_name
FROM state
JOIN city 
ON state.state_abbreviation = city.state_abbreviation
WHERE state.census_region = 'Midwest'
GROUP BY state.state_name
ORDER BY city_count DESC

-- LEFT JOIN

-- Write a query to retrieve the state name and the earliest date a park was established in that state (or territory) for every record in the state table that has park records associated with it.

--NOT RIGHT 
SELECT state.state_name, MIN(park.date_established) AS earliest_date
FROM state
LEFT JOIN park_state
ON park_state.state_abbreviation = state.state_abbreviation
LEFT JOIN park
ON park.park_id = park_state.park_id
GROUP BY state.state_name


-- Modify the previous query so the results include entries for all the records in the state table, even if they have no park records associated with them.
SELECT state.state_name, MIN(park.date_established) AS earliest_date
FROM state
LEFT JOIN park_state
ON park_state.state_abbreviation = state.state_abbreviation
LEFT JOIN park
ON park.park_id = park_state.park_id
GROUP BY state.state_name


-- UNION

-- Write a query to retrieve all the place names in the city and state tables that begin with "W" sorted alphabetically. (Washington is the name of a city and a state--how many times does it appear in the results?)

SELECT city.city_name AS place_name
FROM city
WHERE city.city_name LIKE 'W%'
UNION 
SELECT state.state_name AS place_name
FROM state
WHERE state.state_name LIKE 'W%'
ORDER BY place_name

-- Modify the previous query to include a column that indicates whether the place is a city or state.

SELECT city.city_name AS place_name, 'city' AS place_type
FROM city
WHERE city.city_name LIKE 'W%'
UNION ALL
SELECT state.state_name AS place_name,  'state' AS place_type
FROM state
WHERE state.state_name LIKE 'W%'
ORDER BY place_name


-- MovieDB
-- After creating the MovieDB database and running the setup script, make sure it is selected in pgAdmin and confirm it is working correctly by writing queries to retrieve...

-- The names of all the movie genres

select genre_name from genre

-- The titles of all the Comedy movies

select *
from genre
INNER JOIN movie_genre AS mg
ON mg.genre_id = genre.genre_id
INNER JOIN movie AS m
ON m.movie_id = mg.movie_id
where genre.genre_name = 'Comedy'


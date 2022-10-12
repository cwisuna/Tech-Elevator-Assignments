-- INNER JOIN

-- Write a query to retrieve the name and state abbreviation for the 2 cities named "Columbus" in the database
SELECT city_name, state_abbreviation
from city
where city_name = 'Columbus';

-- Modify the previous query to retrieve the names of the states (rather than their abbreviations).
SELECT city.city_name, 
	   city.state_abbreviation, 
	   state.state_name
from city
INNER JOIN state
	on state.state_abbreviation = city.state_abbreviation
where city_name = 'Columbus';

-- Write a query to retrieve the names of all the national parks with their state abbreviations.
-- (Some parks will appear more than once in the results, because they cross state boundaries.)
select park.park_name,
	   park_state.state_abbreviation
from park
INNER JOIN park_state
	on park_state.park_id = park.park_id;


-- The park_state table is an associative table that can be used to connect the park and state tables.
-- Modify the previous query to retrieve the names of the states rather than their abbreviations.
select park.park_name,
	   park_state.state_abbreviation,
	   state.state_name
from park
INNER JOIN park_state
	on park_state.park_id = park.park_id
INNER JOIN state
	on state.state_abbreviation = park_state.state_abbreviation;
-- Modify the previous query to include the name of the state's capital city.
select park.park_name,
	   state.state_name,
	   city.city_name
from park
INNER JOIN park_state
	on park_state.park_id = park.park_id
INNER JOIN state
	on state.state_abbreviation = park_state.state_abbreviation
INNER JOIN city
	on city.city_id = state.capital;
	--and city.state_abbreviation = state.state_abbreviation;

-- Modify the previous query to include the area of each park.
select park.park_name,
	   park.area,
	   state.state_name,
	   city.city_name
from park
INNER JOIN park_state
	on park_state.park_id = park.park_id
INNER JOIN state
	on state.state_abbreviation = park_state.state_abbreviation
INNER JOIN city
	on city.city_id = state.capital;

-- Write a query to retrieve the names and populations of all the cities in the Midwest census region.
SELECT city.city_name, 
	   city.population
from state 
INNER JOIN city
	on state.state_abbreviation = city.state_abbreviation
WHERE state.census_region = 'Midwest';


-- Write a query to retrieve the number of cities in the city table for each state in the Midwest census region.
SELECT COUNT(city_name) as city_count,
	   state.state_name
from state 
INNER JOIN city
	on state.state_abbreviation = city.state_abbreviation
WHERE state.census_region = 'Midwest'
group by state.state_name;

-- Modify the previous query to sort the results by the number of cities in descending order.
SELECT COUNT(city_name) as city_count,
	   state.state_name
from state 
INNER JOIN city
	on state.state_abbreviation = city.state_abbreviation
WHERE state.census_region = 'Midwest'
group by state.state_name
ORDER by city_count DESC;


-- LEFT JOIN

-- Write a query to retrieve the state name and the earliest date a park was established in that state (or territory) for every record in the state table that has park records associated with it.

SELECT state.state_name,
	   MIN(park.date_established) as earliest_date
from state
INNER JOIN park_state
	on park_state.state_abbreviation = state.state_abbreviation
INNER JOIN park
	on park.park_id = park_state.park_id
group by state.state_name;

-- Modify the previous query so the results include entries for all the records in the state table, even if they have no park records associated with them.
SELECT state.state_name,
	   city.city_name,
	   MIN(park.date_established) as earliest_date
from state
LEFT JOIN park_state
		on park_state.state_abbreviation = state.state_abbreviation
LEFT JOIN park
	on park.park_id = park_state.park_id
INNER JOIN city
	on state.state_abbreviation = city.state_abbreviation
group by state.state_name, city.city_name


-- UNION

-- Write a query to retrieve all the place names in the city and state tables that begin with "W" sorted alphabetically. (Washington is the name of a city and a state--how many times does it appear in the results?)
	SELECT city.city_name as place_name
	from city
	WHERE city.city_name like 'W%'
UNION 
	SELECT state.state_name as place_name
	from state
	WHERE state.state_name like 'W%'
	ORDER BY place_name;

-- Modify the previous query to include a column that indicates whether the place is a city or state.
	SELECT city.city_name as place_name,
		  'city' as place_type
	from city
	WHERE city.city_name like 'W%'
UNION ALL
	SELECT state.state_name as place_name,
	     'state' as place_type
	from state
	WHERE state.state_name like 'W%'
	ORDER BY place_name;


-- MovieDB
-- After creating the MovieDB database and running the setup script, make sure it is selected in pgAdmin and confirm it is working correctly by writing queries to retrieve...

-- The names of all the movie genres
select genre_name
from genre

-- The titles of all the Comedy movies
select m.title
from genre
INNER JOIN movie_genre as mg
	ON mg.genre_id = genre.genre_id
INNER JOIN movie as m
	on m.movie_id = mg.movie_id
WHERE genre.genre_name = 'Comedy';


SELECT movie.title, 
	  director.person_name as director,
	  actor.person_name as actor
from movie
INNER JOIN person as director
	on movie.director_id = director.person_id
INNER JOIN movie_actor
	on movie_actor.movie_id = movie.movie_id
INNER JOIN person as actor
	on actor.person_id = movie_actor.actor_id
WHERE director.person_name = 'Tom Hanks'
AND actor.person_name = 'Tom Hanks'

SELECT movie.title
from movie

INNER JOIN movie_actor tom_movieActor
	on tom_movieActor.movie_id = movie.movie_id
INNER JOIN person as tom_actor
	on tom_actor.person_id = tom_movieActor.actor_id
	
INNER JOIN movie_actor meg_movieActor
	ON meg_movieActor.movie_id = movie.movie_id
INNER JOIN person as meg_actor
	ON meg_actor.person_id = meg_movieActor.actor_id
	
WHERE tom_actor.person_name = 'Tom Hanks'
AND meg_actor.person_name = 'Meg Ryan'
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

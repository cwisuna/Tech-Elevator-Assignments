-- INSERT

-- Add Disneyland to the park table. (It was established on 7/17/1955, has an area of 2.1 square kilometers and does not offer camping.)


INSERT INTO park(park_name, date_established, area, has_camping)
VALUES ('DisneyLand', '7/17/1955', 2.1, false);

INSERT INTO park(park_name, date_established, area, has_camping)
VALUES ('Kings Island', '7/17/1972', 2.1, false);

select * from park where park_name = 'DisneyLand';

-- Add Hawkins, IN (with a population of 30,000 and an area of 38.1 square kilometers) and Cicely, AK (with a popuation of 839 and an area of 11.4 square kilometers) to the city table.

INSERT INTO city(city_name, state_abbreviation, population, area)
VALUES  ('Hawkins', 'IN', 30000, 38.1),
	    ('Cicely', 'AK', 839, 11.4);
		
-- Since Disneyland is in California (CA), add a record representing that to the park_state table.
SELECT * from park where park_name = 'DisneyLand';


INSERT INTO park_state(park_id, state_abbreviation)
SELECT park.park_id, 'CA'
from park 
WHERE park_name = 'DisneyLand';
-- UPDATE

UPDATE park
	set park_name = 'Disneyland'
where park_name = 'DisneyLand';

select *
from park
where park_name = 'Disneyland';

-- Change the state nickname of California to "The Happiest Place on Earth."

SELECT * 
from state
where state_abbreviation = 'CA';

UPDATE state
	set state_nickname = 'The Happiest Place on Earth.'
where state_abbreviation = 'CA';

-- Increase the population of California by 1,000,000.

UPDATE state
	set population = population + 1000000
where state_abbreviation = 'CA';

-- Change the capital of California to Anaheim.

UPDATE state
 set capital = (
				SELECT city.city_id from city 
				where city.city_name = 'Anaheim'
				and city.state_abbreviation = 'CA'
	 			LIMIT 1
	 			)
WHERE state.state_abbreviation  = 'CA';

-- Change California's nickname back to "The Golden State", reduce the population by 1,000,000, and change the capital back to Sacramento.

UPDATE state
	set state_nickname = 'The Golden State',
	    population = population - 1000000,
		capital = (
				SELECT city.city_id from city 
				where city.city_name = 'Sacramento'
				and city.state_abbreviation = 'CA'
	 			LIMIT 1
	 			)
WHERE state.state_abbreviation  = 'CA';
-- DELETE

-- Delete Hawkins, IN from the city table.
SELECT *
from city
where city.city_name = 'Hawkins'
and city.state_abbreviation = 'IN';

DELETE From city
where city.city_name = 'Hawkins'
and city.state_abbreviation = 'IN';

-- Delete all cities with a population of less than 1,000 people from the city table.

SELECT *
from city
where city.population < 1000;

BEGIN TRANSACTION;

DELETE from city
where city.population < 1000;


SELECT *
from city
where city.population < 1000;

ROLLBACK;
COMMIT;

START TRANSACTION;

delete from park_state

select * from park_state

ROLLBACK

select *
from park
INNER JOIN  park_state
	on park_state.park_id = park.park_id
WHERE park.park_name = 'Yellowstone'

select * from park


UPDATE park_state
	set park_id = 64,
	    state_abbreviation = park_state.state_abbreviation
from park
INNER JOIN  park_state as p
	on p.park_id = park.park_id
WHERE park.park_name = 'Yellowstone'
and park_state.name 

-- REFERENTIAL INTEGRITY

-- Try adding a city to the city table with "XX" as the state abbreviation.

INSERT INTO CITY(city_name, state_abbreviation, population, area)
VALUES ('City', 'XX', 300,10);

-- Try deleting California from the state table.
START Transaction;
DELETE FROM state
where state_abbreviation = 'CA';

ROLLBACK;


-- Try deleting Disneyland from the park table. Try again after deleting its record from the park_state table.

DELETE from park where park_name = 'Disneyland';

START TRANSACTION;


DELETE from park_state 
where park_id in (select park.park_id from park where park_name = 'Disneyland');
DELETE from park
where park_name = 'Disneyland';


select *  from park where park_name = 'Disneyland';
ROLLBACK;



-- CONSTRAINTS

-- NOT NULL constraint
-- Try adding Smallville, KS to the city table without specifying its population or area.

INSERT INTO CITY(city_name, state_abbreviation, area)
VALUES ('Smallville', 'KS',1);

select * from city where city_name = 'Smallville'
-- DEFAULT constraint
-- Try adding Smallville, KS again, specifying an area but not a population.


-- Retrieve the new record to confirm it has been given a default, non-null value for population.


-- UNIQUE constraint
-- Try changing California's nickname to "Vacationland" (which is already the nickname of Maine).
UPDATE state
  set state_nickname = 'Vacationland'
 where state_abbreviation = 'CA'

-- CHECK constraint
-- Try changing the census region of Florida (FL) to "Southeast" (which is not a valid census region).
UPDATE state
	set census_region = 'Southeast'
where state_abbreviation = 'FL'



-- TRANSACTIONS

-- Delete the record for Smallville, KS within a transaction.


-- Delete all of the records from the park_state table, but then "undo" the deletion by rolling back the transaction.


-- Update all of the cities to be in the state of Texas (TX), but then roll back the transaction.


-- Demonstrate two different SQL connections trying to access the same table where one is inside of a transaction but hasn't committed yet.

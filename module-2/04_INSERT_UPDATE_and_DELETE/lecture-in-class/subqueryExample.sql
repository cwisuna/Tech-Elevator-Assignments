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

select tom_hanks.*
from (  SELECT movie_actor.movie_id, person.person_id, person.person_name as actor
		from  movie_actor 
		INNER JOIN person 
			on person.person_id = movie_actor.actor_id
		WHERE person.person_name = 'Tom Hanks') as tom_hanks
INNER JOIN (SELECT movie_actor.movie_id, person.person_id, person.person_name as actor
			from  movie_actor 
			INNER JOIN person 
				on person.person_id = movie_actor.actor_id
			WHERE person.person_name = 'Meg Ryan') as meg_ryan
ON tom_hanks.movie_id = meg_ryan.movie_id
INNER JOIN movie
	on movie.movie_id = tom_hanks.movie_id
	and movie.movie_id = meg_ryan.movie_id
	

select *
from (  SELECT movie_actor.movie_id, person.person_id, person.person_name as actor
		from  movie_actor 
		INNER JOIN person 
			on person.person_id = movie_actor.actor_id
		WHERE person.person_name = 'Tom Hanks') as tom_hanks

INNER JOIN movie
	on movie.movie_id = tom_hanks.movie_id
WHERE tom_hanks.movie_id NOT IN (SELECT movie_actor.movie_id
								from  movie_actor 
								INNER JOIN person 
									on person.person_id = movie_actor.actor_id
								WHERE person.person_name in ( 'Meg Ryan', 'Matt Damon') )

-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie.
-- Order the results by movie title (A-Z)
-- (73 rows)
SELECT person.person_name, movie.title
FROM person
JOIN movie_actor
ON person.person_id = movie_actor.actor_id
JOIN movie
ON movie_actor.movie_id = movie.movie_id
WHERE person_id = director_id
ORDER BY title ASC
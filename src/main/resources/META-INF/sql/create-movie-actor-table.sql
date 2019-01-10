CREATE TABLE movie_actor
(
  movie_id BIGINT NOT NULL,
  actor_id BIGINT NOT NULL,
  PRIMARY KEY (movie_id, actor_id),
  CONSTRAINT FK_movie_actor_1 FOREIGN KEY (movie_id)
  REFERENCES movie (movie_id) ON DELETE CASCADE,
  CONSTRAINT FK_movie_actor_2 FOREIGN KEY (actor_id)
  REFERENCES actor (actor_id) ON DELETE CASCADE
);
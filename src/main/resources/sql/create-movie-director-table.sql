CREATE TABLE movie_director
(
  movie_id BIGINT NOT NULL,
  director_id BIGINT NOT NULL,
  PRIMARY KEY (movie_id, director_id),
  CONSTRAINT FK_movie_director_1 FOREIGN KEY (movie_id)
  REFERENCES movie (movie_id) ON DELETE CASCADE,
  CONSTRAINT FK_movie_director_2 FOREIGN KEY (director_id)
  REFERENCES director (director_id) ON DELETE CASCADE
);
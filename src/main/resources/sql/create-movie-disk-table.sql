CREATE TABLE movie_disk
(
  movie_id BIGINT NOT NULL,
  disk_id BIGINT NOT NULL,
  PRIMARY KEY (movie_id, disk_id),
  CONSTRAINT FK_movie_disk_1 FOREIGN KEY (movie_id)
  REFERENCES movie (movie_id) ON DELETE CASCADE,
  CONSTRAINT FK_movie_disk_2 FOREIGN KEY (disk_id)
  REFERENCES disk (disk_id) ON DELETE CASCADE
);
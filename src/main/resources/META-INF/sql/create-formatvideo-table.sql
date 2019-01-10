CREATE TABLE format_video
(
  format_video_id SERIAL NOT NULL,
  type VARCHAR(50) NOT NULL,
  movie_id BIGINT,
  CONSTRAINT pk_format_video PRIMARY KEY (format_video_id),
  CONSTRAINT fk_format_video FOREIGN KEY (movie_id) REFERENCES movie (movie_id)
);


CREATE TABLE movie_format_video
(
  movie_id BIGINT NOT NULL,
  format_video_id BIGINT NOT NULL,
  PRIMARY KEY (movie_id, format_video_id),
  CONSTRAINT FK_movie_format_video_1 FOREIGN KEY (movie_id)
  REFERENCES movie (movie_id) ON DELETE CASCADE,
  CONSTRAINT FK_movie_format_video_2 FOREIGN KEY (format_video_id)
  REFERENCES format_video (format_video_id) ON DELETE CASCADE
);
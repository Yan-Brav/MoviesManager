CREATE TABLE director
(
  director_id SERIAL NOT NULL,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  birth_year INT,
  death_year INT,
  sex CHAR(1) NOT NULL,
  CONSTRAINT pk_director PRIMARY KEY (director_id)
);
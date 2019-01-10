CREATE TABLE actor
(
  actor_id SERIAL NOT NULL,
  first_name character varying(50) NOT NULL,
  last_name character varying(50) NOT NULL,
  role character varying(50),
  birthday date,
  death_year integer,
  sex character(1) NOT NULL,
  CONSTRAINT pk_actor PRIMARY KEY (actor_id)
);
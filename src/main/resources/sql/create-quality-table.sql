CREATE TABLE quality
(
  quality_id SERIAL NOT NULL ,
  quality VARCHAR(50) NOT NULL,
  description TEXT,
  CONSTRAINT pk_quality PRIMARY KEY (quality_id)
);
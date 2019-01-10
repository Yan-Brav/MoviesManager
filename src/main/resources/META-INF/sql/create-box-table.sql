CREATE TABLE box
(
  box_id SERIAL NOT NULL ,
  box_number INT NOT NULL UNIQUE ,
  title VARCHAR(50),
  capacity INT,
  location_id BIGINT,
  empty_cells INT,
  description TEXT,
  CONSTRAINT pk_box PRIMARY KEY (box_id)
);
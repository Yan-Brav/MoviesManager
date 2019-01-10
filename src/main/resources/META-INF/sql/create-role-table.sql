CREATE TABLE role
(
  role_id SERIAL NOT NULL,
  role VARCHAR(50) NOT NULL UNIQUE ,
  role_definition TEXT,
  CONSTRAINT pk_role PRIMARY KEY (role_id)
);
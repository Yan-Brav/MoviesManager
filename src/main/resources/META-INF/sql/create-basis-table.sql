CREATE TABLE basis
(
  basis_id SERIAL NOT NULL ,
  type VARCHAR(50) NOT NULL,
  CONSTRAINT pk_basis PRIMARY KEY (basis_id)
);
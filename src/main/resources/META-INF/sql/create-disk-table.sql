CREATE TABLE disk
(
  disk_id SERIAL NOT NULL ,
  disk_number VARCHAR(10) NOT NULL,
  basis_id BIGINT,
  box_id BIGINT,
  CONSTRAINT pk_disk PRIMARY KEY (disk_id)
);
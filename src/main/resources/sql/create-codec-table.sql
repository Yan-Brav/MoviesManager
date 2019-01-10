CREATE TABLE codec
(
  codec_id SERIAL NOT NULL ,
  type VARCHAR(50) NOT NULL,
  CONSTRAINT pk_codec PRIMARY KEY (codec_id)
);
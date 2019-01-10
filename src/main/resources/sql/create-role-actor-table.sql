CREATE TABLE role_actor
(
  role_id BIGINT NOT NULL,
  actor_id BIGINT NOT NULL,
  PRIMARY KEY (role_id, actor_id),
  CONSTRAINT FK_role_actor_1 FOREIGN KEY (role_id)
  REFERENCES role (role_id) ON DELETE CASCADE,
  CONSTRAINT FK_role_actor_2 FOREIGN KEY (actor_id)
  REFERENCES actor (actor_id) ON DELETE CASCADE
);
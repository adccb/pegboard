CREATE TABLE sess (
  user_id VARCHAR(20),
  token VARCHAR(20),

  PRIMARY KEY (token),
  FOREIGN KEY (user_id) REFERENCES users(user_id)
);

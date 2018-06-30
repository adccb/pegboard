CREATE TABLE pins (
  pin_id VARCHAR(20),
  user_id VARCHAR(20),
  text VARCHAR(255),

  PRIMARY KEY (pin_id),
  FOREIGN KEY (user_id) REFERENCES users(user_id)
);

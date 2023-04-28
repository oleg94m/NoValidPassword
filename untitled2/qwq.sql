create database Les3;
use  Les3;
CREATE TABLE Animal (
  id INT NOT NULL AUTO_INCREMENT,
  age INT,
  name VARCHAR(50),
  tail VARCHAR(50),
  PRIMARY KEY (id)
);
INSERT INTO Animal (age, name, tail)
VALUES
(2, 'Tom', true),
(4, 'Jerry', false),
(1, 'Spike', true);

create database MyJoinsDB1;
use MyJoinsDB1;
CREATE TABLE employees (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255),
  phone VARCHAR(255)
);

CREATE TABLE salary (
  id INT AUTO_INCREMENT PRIMARY KEY,
  position VARCHAR(255),
  salary INT
);

CREATE TABLE personal_info (
  id INT AUTO_INCREMENT PRIMARY KEY,
  marital_status VARCHAR(255),
  birth_date DATE,
  address VARCHAR(255)
);

INSERT INTO employees (name, phone)
VALUES
("John Smith", "555-1234"),
("Jane Doe", "555-5678"),
("Bob Johnson", "555-9012");

INSERT INTO salary (position, salary)
VALUES
("CEO", 100000),
("Manager", 50000),
("Worker", 25000);

INSERT INTO personal_info (marital_status, birth_date, address)
VALUES
("Married", "1980-05-10", "10 Main St, Anytown, USA"),
("Single", "1995-12-15", "20 Broad St, Anytown, USA"),
("Married", "1972-08-01", "5 Elm St, Anytown, USA");

 
 create database LastTask;
 use LastTask;
CREATE TABLE employees (
  id INT PRIMARY KEY,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  email VARCHAR(100),
  phone VARCHAR(20),
  hire_date DATE,
  department_id INT,
  FOREIGN KEY (department_id) REFERENCES departments(id)
);

CREATE TABLE departments (
  id INT PRIMARY KEY,
  name VARCHAR(50)
);

CREATE TABLE salaries (
  id INT PRIMARY KEY,
  salary INT,
  position VARCHAR(50),
  FOREIGN KEY (id) REFERENCES employees(id)
);

CREATE TABLE personal_info (
  id INT PRIMARY KEY,
  date_of_birth DATE,
  address VARCHAR(100),
  marital_status VARCHAR(20),
  FOREIGN KEY (id) REFERENCES employees(id)
);

INSERT INTO departments (id, name)
VALUES (1, 'Sales'),
       (2, 'Marketing'),
       (3, 'Finance'),
       (4, 'Human Resources');

-- Insert data into the employees table
INSERT INTO employees (id, first_name, last_name, email, phone, hire_date, department_id)
VALUES (1, 'Jon', 'fgdf', 'john@example.com', '+38067-555-1234', '2022-01-01', 1),
       (2, 'Jan', 'dfgdf', 'jane@example.com', '+38067-555-5678', '2021-05-01', 2),
       (3, 'Bob', 'trt', 'bob@example.com', '+38067-555-9876', '2021-10-15', 1),
       (4, 'Sarah', 'eeet', 'sarah@example.com', '+38067-555-4321', '2020-03-01', 3),
       (5, 'Tom', 'fho', 'tom@example.com', '+38067-555-2468', '2019-12-01', 4);

-- Insert data into the salaries table
INSERT INTO salaries (id, salary, position)
VALUES (1, 100000, 'Manager'),
       (2, 80000, 'Analyst'),
       (3, 90000, 'Manager'),
       (4, 75000, 'Accountant'),
       (5, 60000, 'Assistant');

-- Insert data into the personal_info table
INSERT INTO personal_info (id, date_of_birth, address, marital_status)
VALUES (1, '1980-01-01', '123 Main ', 'Married'),
       (2, '1990-05-15', '456 Oak ', 'Single'),
       (3, '1985-09-30', '789 Elm', 'Divorced'),
       (4, '1995-03-10', '321 Pine ', 'Single'),
       (5, '1999-11-20', '987 Maple', 'Single');
       
       select * from salaries;
       select * from personal_info;
       select * from employees;
	   select * from departments;
       
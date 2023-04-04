CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    phone_number VARCHAR(20)
);

CREATE TABLE salaries (
    id INT PRIMARY KEY,
    employee_id INT,
    salary DECIMAL(10, 2),
    position VARCHAR(50)
);

CREATE TABLE personal_info (
    id INT PRIMARY KEY,
    employee_id INT,
    marital_status VARCHAR(20),
    date_of_birth DATE,
    address VARCHAR(100)
);

INSERT INTO employees (id, name, phone_number)
VALUES 
  (1, 'John ', '2323232'),
  (2, 'Jane Doe', '2321312312'),
  (3, 'Bob Johnson', '12312312312');

INSERT INTO salaries (id, employee_id, salary, position)
VALUES 
  (1, 1, 100000.00, 'Manager'),
  (2, 2, 4000.00, 'Sales '),
  (3, 3, 3500.00, 'Customer');
INSERT INTO personal_info (id, employee_id, marital_status, date_of_birth, address)
VALUES 
  (1, 1, 'single', '1980-01-01', 'Ukraine'),
  (2, 2, 'married', '1985-05-10', 'Poland'),
  (3, 3, 'married', '1975-11-23', 'USA');
  
SELECT employee_id FROM salaries WHERE salary > 10000;

UPDATE personal_info SET marital_status = 'married' WHERE employee_id = 1;
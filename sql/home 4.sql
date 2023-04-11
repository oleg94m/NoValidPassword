create  database MyJoinsDB;
use MyJoinsDB;
CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    phone VARCHAR(20) NOT NULL
);
CREATE TABLE salaries (
    id INT PRIMARY KEY,
    position VARCHAR(20) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL
);

CREATE TABLE personal_info (
    id INT PRIMARY KEY,
    marital_status VARCHAR(20) NOT NULL,
    date_of_birth DATE NOT NULL,
    address VARCHAR(100) NOT NULL
);

INSERT INTO employees (id, name, phone)
VALUES 
    (1, 'Jon ', '+38067-555-1234'),
    (2, 'Jan ', '+38067-555-5678'),
    (3, 'Bob ', '+38067-555-9012'),
    (4, 'anton ', '+38067-555-3456'),
    (5, 'oleg ', '+38067-555-7890');
    
    INSERT INTO salaries (id, position, salary)
VALUES 
    (1, 'CEO', 100000),
    (2, 'Manager', 50000),
    (3, 'Worker', 30000);
    
    INSERT INTO personal_info (id, marital_status, date_of_birth, address)
VALUES 
    (1, 'Married', '1980-05-12', 'Lenina str., 10'),
    (2, 'Single', '1990-10-22', 'Pushkina str., 15'),
    (3, 'Married', '1985-02-01', 'Gagarina str., 5'),
    (4, 'Single', '1995-07-18', 'Stalina str., 20'),
    (5, 'Divorced', '1978-12-04', 'Kirova str., 12');
    
SELECT employees.phone, personal_info.address
FROM employees INNER JOIN personal_info ON employees.id = personal_info.id;

SELECT employees.id, personal_info.date_of_birth
FROM employees INNER JOIN personal_info ON employees.id = personal_info.id
WHERE personal_info.marital_status = 'Single';

SELECT employees.phone, personal_info.date_of_birth
FROM employees INNER JOIN salaries ON employees.id = salaries.id
JOIN personal_info ON employees.id = personal_info.id
WHERE salaries.position = 'Manager';

    

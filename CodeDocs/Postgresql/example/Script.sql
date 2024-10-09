***********************1*******************************

create schema demo1;

set search_path to demo1;    
-- DDL -- alter table, drop
CREATE TABLE player_details(
player_name VARCHAR(2)
);
-- DQL
select player_name from player_details;
-- DML - update, delete
INSERT INTO player_details
VALUES('Dh');
-- 
select player_name from player_details;


CREATE TABLE sample_data (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),           -- String type
    age INT,                    -- Integer type
    height FLOAT,               -- Floating point number
    is_active BOOLEAN,          -- Boolean type
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  -- Date and time
    balance NUMERIC(10, 2)      -- Exact numeric type with precision
);


INSERT INTO sample_data (name, age, height, is_active, balance) VALUES
('Alice', 30, 5.7, TRUE, 1500.50),
('Bob', 25, 6.1, FALSE, 2000.00),
('Charlie', 28, 5.9, TRUE, 2500.75),
('Diana', 35, 5.4, TRUE, 3000.00);
-- Next set of datatypes
CREATE TABLE additional_data (
    id SERIAL PRIMARY KEY,
    email TEXT,                   -- Text type (unlimited length)
    registration_date DATE,       -- Date type
    binary_data BYTEA,            -- Binary data type
    json_data JSONB               -- JSON data type (Binary JSON)
);

INSERT INTO additional_data (email, registration_date, binary_data, json_data) VALUES
('alice@example.com', '2024-01-15', '\xDEADBEEF', '{"preferences": {"theme": "dark"}}'),
('bob@example.com', '2024-02-20', '\xBEEFCAFE', '{"preferences": {"theme": "light"}}');

select * from additional_data;

***********************2*******************************
-- null handling
create schema demo1;

set search_path to demo1;

CREATE TABLE products (
    product_id SERIAL PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL,
    price NUMERIC(10, 2),
    quantity INT,
    description TEXT
);


INSERT INTO products (product_name, price, quantity, description) VALUES
('Laptop', 999.99, 50, 'High performance laptop'),
('Smartphone', NULL, 100, 'Latest model smartphone'),  -- price is NULL
('Tablet', 299.99, NULL, NULL),                          -- quantity and description are NULL
('Smartwatch', 199.99, 75, NULL);                        -- description is NULL

update products
set description='High performance and latest model laptop'
where product_id = 1;

delete from products
where product_id =2;

select * from products;




select * from products;

SELECT * FROM products WHERE price IS NOT NULL;
select * from products where description is not null and price is not null;

select product_id, COALESCE(price, 0) as price from products where price is null;
SELECT product_name, COALESCE(description, 'N/A') as description FROM products;




SELECT COUNT(*) AS quantity_empty FROM products WHERE quantity IS NULL;
SELECT COUNT(6) AS null_price_count FROM products WHERE price IS NULL;

select * from products;


SELECT COUNT(*) as total_records FROM products;


***********************3*******************************

--   Order by

select * from products order by price ASC;
select * from products order by price DESC;
select * from products order by quantity DESC;


SELECT * FROM products
ORDER BY quantity NULLS FIRST;  -- NULLs will be at the beginning

SELECT * FROM products
ORDER BY price DESC NULLS LAST;  -- NULLs will be at the end

SELECT * FROM products
ORDER BY price ASC, quantity DESC;

SELECT * FROM products
ORDER BY price NULLS LAST, quantity NULLS FIRST;


***********************4*******************************


create table players(
player_name VARCHAR(50),
score int,
country VARCHAR(50)
);

insert into players
values
('Dhoni',200,'India'),
('Virat',150,'India'),
('Dijo',250,'Aus' ),
('Jose',100,'Aus'),
('Anto',null,'Aus');
insert into players
values
('Shantanu',null,'NZ');
select * from players where score > 100;

select country,COALESCE(SUM(score),0) as sum_val from players
group by country;




select country,SUM(score) from players
where score > 200
group by country
having SUM(score) >100;

select * from players;

select country from players
where score > 100
group by country
having SUM(score) >100;




***********************5*******************************
drop table employees;


CREATE TABLE employees (
    employee_id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    salary NUMERIC(10, 2),
    department VARCHAR(100)
);

-- Insert sample data into employees table
INSERT INTO employees (name, salary, department) VALUES
('John Doe', 50000, 'HR'),
('Jane Smith', 60000, 'Engineering'),
('Alice Johnson', 70000, 'Engineering'),
('Bob Williams', 45000, 'Marketing'),
('Sara Lee', 60000, 'HR');


select * from employees;

-- Example 1: Using WHERE with equality
SELECT * FROM employees WHERE salary = 60000;

-- Example 2: Using WHERE with inequality
SELECT * FROM employees WHERE salary > 60000;

-- Example 3: Using WHERE with AND condition
SELECT * FROM employees WHERE salary > 50000 AND department = 'Engineering';

-- Example 4: Using WHERE with OR condition
SELECT * FROM employees WHERE department = 'HR' OR department = 'Marketing';

-- Example 5: Using WHERE with NOT condition
SELECT * FROM employees WHERE NOT department = 'Engineering';

-- Example 6: Using WHERE with LIKE for pattern matching
SELECT * FROM employees WHERE name LIKE '%e';  -- Names starting with 'J'
SELECT * FROM employees WHERE name LIKE '__h%';  -- Names starting with 'J'

-- Example 7: Using WHERE with ILIKE for case-insensitive pattern matching
SELECT * FROM employees WHERE name ILIKE 'j%';  -- Names starting with 'j' (case insensitive)

-- Example 8: Using WHERE with IN for matching against a list
SELECT * FROM employees;
SELECT * FROM employees WHERE department IN ('HR', 'Engineering');

-- Example 9: Using WHERE with BETWEEN for range matching
SELECT * FROM employees WHERE salary BETWEEN 50000 AND 70000;

-- Example 10: Using WHERE with IS NULL
SELECT * FROM employees WHERE department IS NULL;

-- Example 11: Using WHERE with EXISTS (assuming a dependent subquery)
-- show in for the below option, so that students understand




SELECT * FROM employees e WHERE EXISTS (
    SELECT 1 FROM employees WHERE department = e.department AND salary > 60000
);

SELECT * FROM employees e WHERE EXISTS (
    SELECT 1 FROM employees WHERE salary > 60000
);



select * from employees;

select * from employees
where employee_id=1;
select * from employees
where employee_id=(select employee_id from employees where name = 'John Doe');


set search_path to demo1;

select count(1) from products;

select product_id, product_name from products 
where price in (select price from products);

select * from products;
select product_name from products  p
where  exists (select 1 from products where price is not null);


       
    
SELECT product_name,
       CASE 
           WHEN quantity IS NULL THEN 'Unknown'
           WHEN quantity > 0 THEN 'In Stock'
           ELSE 'Out of Stock'
       END AS availability
FROM products;

***********************6(Oct-09-2024)*******************************
set search_path to demo1;

select product_name,count(1) from products;

select product_id, product_name from products 
where price in (select price from products);

select * from products;
select product_name from products  p
where  exists (select 1 from products where price is not null);


       
    
SELECT product_name,
       CASE 
           WHEN quantity IS NULL THEN 'Unknown'
           WHEN quantity > 0 THEN 'In Stock'
           ELSE 'Out of Stock'
       END AS availability
FROM products;

create table newPlayers as
select * from players;
truncate table newPlayers; 
select * from newPlayers;

insert into newPlayers
select * from players;

delete from newPlayers where player_name = 'Dhoni';

select distinct player_name,score from players; -- unique records


select player_name, score,
RANK() over (partition by country order by score desc)   from players;

select player_name ,
RANK() over(partition by country order by score desc)
from players;

select * from players;

select country,sum(score) from players
group by country;

WITH - clause - CTE - Common Table expressions: 

WITH high_Score_members as(
-- logic
) select   from high_Score_members;



with ranked_players AS(
select player_name ,
RANK() over(partition by country order by score desc) as rank_recieved
from players
)
select player_name from ranked_players where 
rank_recieved = 1;


select * from players
where score is not null
order by score desc limit 3 offset 1;

-- Date


drop table book_Sales;
CREATE TABLE book_sales (
    sale_id SERIAL PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    book_title VARCHAR(100) NOT NULL,
    quantity_sold INT NOT NULL,
    sale_date DATE NOT NULL
);

INSERT INTO book_sales (customer_name, book_title, quantity_sold, sale_date) VALUES
('Ravi Kumar', 'The God of Small Things', 2, '2024-01-15'),
('Sita Sharma', 'A Suitable Boy', 1, '2024-02-16'),
('Meera Reddy', 'The White Tiger', 1, '2024-02-20'),
('Ravi Kumar', 'Gitanjali', 1, '2024-03-10'),
('Sita Sharma', 'The Blue Umbrella', 3, '2024-03-15'),
('Meera Reddy', 'The Inheritance of Loss', 2, '2024-04-01'),
('Ravi Kumar', 'The Guide', 1, '2024-04-05');


SELECT *
FROM book_sales; 

-- ******************************************************
-- Using EXTRACT() to Filter by Month
-- To filter records where sales occurred in February:

SELECT *
FROM book_sales
WHERE EXTRACT(MONTH FROM sale_date) = 2;
select * from book_sales
where extract(day from sale_Date) = 1;
select * from book_sales
where extract(year from sale_Date) = 2024;
**********************************************************
-- Using TO_CHAR() to Filter by Month
-- Alternatively, you can filter February sales using the TO_CHAR() function:


SELECT *
FROM book_sales
WHERE TO_CHAR(sale_date, 'MM') = '02';



SELECT *
FROM book_sales
WHERE TO_CHAR(sale_date, 'DD') = '16';

SELECT *
FROM book_sales
WHERE TO_CHAR(sale_date, 'YYYY') = '2024';


SELECT CURRENT_DATE,
CURRENT_DATE + INTERVAL '5 days'
as future_date;


SELECT CURRENT_TIMESTAMP,
CURRENT_TIMESTAMP - INTERVAL '3 hours'
as past_timestamp;

select * from players;	
-- 1 case
-- username, password
-- score
Employees

CREATE VIEW emp_view AS
SELECT EmployeeID, Name, Salary
FROM Employees
WHERE Salary > 50000;

-- join, no proper unique id - update,delete is not possible



CREATE SEQUENCE employee_id_seq
    START WITH 1                 -- Start the sequence at 1
    INCREMENT BY 1              -- Increment by 1 for each new value
    NO MINVALUE                 -- No minimum value restriction
    MAXVALUE 1000               -- Set the maximum value to 1000
    CACHE 10;                   -- Cache 10 sequence numbers in memory

CREATE TABLE employees (
    employee_id INT DEFAULT nextval('employee_id_seq') PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(50)
);

INSERT INTO employees (name, department) VALUES
('Alice Johnson', 'HR'),
('Bob Smith', 'Finance'),
('Charlie Brown', 'Engineering');

SELECT * FROM employees;

-- CREATE SYNONYM emp FOR employees;

-- The management wants a summary view of employees showing 
-- only their names and departments. 
-- How can you create a view for this purpose?

select * from employees;
CREATE VIEW employee_summary AS
SELECT name, department
FROM employees;
select * from employee_summary;


CREATE INDEX idx_department ON employees (department);
SELECT * FROM employees WHERE department = 'Engineering';
drop index idx_department;




***********************1*******************************


***********************1*******************************



***********************1*******************************


***********************1*******************************





***********************1*******************************





***********************1*******************************



***********************1*******************************




***********************1*******************************



***********************1*******************************




***********************1*******************************




***********************1*******************************



***********************1*******************************




***********************1*******************************



***********************1*******************************





***********************1*******************************

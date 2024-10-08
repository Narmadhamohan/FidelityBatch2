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



***********************1*******************************





***********************1*******************************

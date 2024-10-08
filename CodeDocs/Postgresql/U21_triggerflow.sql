
select * from employees;
    UPDATE employees SET salary = 40000 WHERE employee_id = 1;

SELECT * FROM salary_changes;



CREATE TABLE employees (
    name VARCHAR(100)
);
ALTER TABLE employees
ADD COLUMN SALARY VARCHAR(20);

select * from employees;

ALTER TABLE employees
ALTER COLUMN name SET NOT NULL;




--works
ALTER TABLE employees
ALTER COLUMN salary TYPE VARCHAR(20)
USING salary::NUMERIC(10, 2);

select * from employees;

alter table employees
drop column salary;


ALTER TABLE employees
ADD CONSTRAINT unique_employee_name UNIQUE(name);
ALTER TABLE employees
ADD CONSTRAINT check_employeename CHECK(char_length(name)>0);

select * from employees;

create schema demo2;
set search_path to demo2;
CREATE TABLE employees (
    employee_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(50) NOT NULL,
    salary NUMERIC NOT NULL CHECK (salary >= 0)
);


CREATE TABLE salary_changes (
    change_id SERIAL PRIMARY KEY,
    employee_id INT NOT NULL,
    old_salary NUMERIC NOT NULL,
    new_salary NUMERIC NOT NULL,
    change_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id)
);
INSERT INTO employees (name, department, salary) VALUES
('Alice Johnson', 'HR', 50000),
('Bob Smith', 'Finance', 60000),
('Charlie Brown', 'Engineering', 70000);
CREATE TRIGGER salary_change_trigger
AFTER UPDATE OF salary ON employees
FOR EACH ROW
WHEN (OLD.salary IS DISTINCT FROM NEW.salary) -- Only log if the salary changes
EXECUTE FUNCTION log_salary_change();
CREATE OR REPLACE FUNCTION log_salary_change()
RETURNS TRIGGER AS $$
BEGIN
    -- Log the salary change in the salary_changes table
    INSERT INTO salary_changes (employee_id, old_salary, new_salary) 
    VALUES (NEW.employee_id, OLD.salary, NEW.salary);
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;




select * from employees;
    UPDATE employees SET salary = 40000 WHERE employee_id = 1;

SELECT * FROM salary_changes;






create schema demo2;
set search_path to demo2;
drop table employees;
CREATE TABLE Employees (
    id SERIAL PRIMARY KEY,          -- Auto-incrementing ID
    name VARCHAR(50),              -- Employee name
    salary DECIMAL(10, 2)          -- Employee salary
);


CREATE OR REPLACE PROCEDURE ManageEmployee(
    emp_name IN VARCHAR(50),         -- IN parameter to specify employee name
    emp_salary IN DECIMAL(10, 2),    -- IN parameter to specify employee salary
    emp_id OUT INT,                  -- OUT parameter to return the employee ID
    emp_salary_out OUT DECIMAL(10, 2)  -- OUT parameter to return the updated salary
)
LANGUAGE plpgsql
AS $$
BEGIN
    -- Insert new employee
    INSERT INTO Employees (name, salary) VALUES (emp_name, emp_salary)
    RETURNING id INTO emp_id;  -- Get the ID of the newly inserted employee

    -- Update salary (for demonstration, let's just add 500 to the existing salary)
    UPDATE Employees 
    SET salary = salary + 500 
    WHERE id = emp_id 
    RETURNING salary INTO emp_salary_out;  -- Return the updated salary
END
$$;

DO $$
DECLARE
    new_emp_id INT;                   -- Variable to hold the new employee ID
    updated_salary DECIMAL(10, 2);    -- Variable to hold the updated salary
BEGIN
    -- Call the ManageEmployee procedure
    CALL ManageEmployee('John Doe', 3000, new_emp_id, updated_salary);

    -- Display the new employee ID and updated salary
    RAISE NOTICE 'New Employee ID: %, Updated Salary: %', new_emp_id, updated_salary;  
END $$;




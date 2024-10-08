CREATE OR REPLACE FUNCTION calculate_bonus(emp_salary NUMERIC, bonus_percent NUMERIC)
RETURNS NUMERIC AS $$
BEGIN
    -- Calculate bonus as salary * bonus percentage
    RETURN emp_salary * (bonus_percent / 100);
END;
$$ LANGUAGE plpgsql;


************************************************************
CREATE OR REPLACE PROCEDURE increase_salary(emp_id INT, increase_percent NUMERIC)
LANGUAGE plpgsql AS $$
BEGIN
    -- Update the salary of the employee by increasing it by the given percentage
    UPDATE employees
    SET salary = salary + (salary * (increase_percent / 100))
    WHERE employee_id = emp_id;
END;

********************************************************

CREATE OR REPLACE PROCEDURE apply_bonus(threshold_salary NUMERIC, bonus_amount NUMERIC)
LANGUAGE plpgsql AS $$
DECLARE
    emp_record RECORD;  -- Declare a record to hold each employee row fetched by the cursor
    emp_cursor CURSOR FOR  -- Declare the cursor to select employees below the salary threshold
        SELECT employee_id, name, salary FROM employees WHERE salary < threshold_salary;
BEGIN
    -- Open the cursor to begin fetching rows
    OPEN emp_cursor;
    
    -- Loop through the rows fetched by the cursor
    LOOP
        -- Fetch each row into emp_record
        FETCH emp_cursor INTO emp_record;
        
        -- Exit the loop when no more rows are returned
        EXIT WHEN NOT FOUND;
        
        -- Update the employee's bonus based on the cursor's fetched data
        UPDATE employees
        SET bonus = emp_record.bonus + bonus_amount
        WHERE employee_id = emp_record.employee_id;
        
        -- Optionally, output a message for each employee who receives a bonus (for debugging or logging purposes)
        RAISE NOTICE 'Bonus of % applied to employee % (ID: %)', bonus_amount, emp_record.name, emp_record.employee_id;
    END LOOP;
    
    -- Close the cursor after processing all rows
    CLOSE emp_cursor;
END;
$$;
********************************************************************************



--- Trigger definition

CREATE TRIGGER salary_change_trigger
AFTER UPDATE OF salary ON employees
FOR EACH ROW
WHEN (OLD.salary IS DISTINCT FROM NEW.salary) -- Only log if the salary changes
EXECUTE FUNCTION log_salary_change();

-- trigger calls this
CREATE OR REPLACE FUNCTION log_salary_change()
RETURNS TRIGGER AS $$
BEGIN
    -- Log the salary change in the salary_changes table
    INSERT INTO salary_changes (employee_id, old_salary, new_salary) 
    VALUES (NEW.employee_id, OLD.salary, NEW.salary);
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;


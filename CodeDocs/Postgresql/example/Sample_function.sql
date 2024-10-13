CREATE OR REPLACE FUNCTION get_student_count_by_nth_highest_score(nth_rank INT)
RETURNS INT AS $$

DECLARE
    nth_highest_score NUMERIC;
    student_count INT;
BEGIN
    -- Get the nth highest distinct score based on provided rank
    SELECT DISTINCT score 
    INTO nth_highest_score 
    FROM STUDENT
    ORDER BY score DESC 
    LIMIT 1 OFFSET nth_rank - 1;

    -- Count the number of students with the nth highest score
    SELECT COUNT(*) 
    INTO student_count
    FROM STUDENT
    WHERE score = nth_highest_score;

    -- Return the count of students
    RETURN student_count;
END $$ LANGUAGE plpgsql;

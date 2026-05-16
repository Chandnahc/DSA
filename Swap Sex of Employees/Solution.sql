# Write your MySQL query statement below
-- SELECT
-- id, name, 
-- CASE
--     WHEN sex = 'f' THEN 'm'
--     ELSE 'f'
-- END as sex, salary
-- FROM
-- Salary;

UPDATE 
Salary
SET sex = CASE
    WHEN sex = 'm' THEN 'f'
    WHEN sex = 'f' THEN 'm'
END;
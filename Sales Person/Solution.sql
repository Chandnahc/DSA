# Write your MySQL query statement below
-- select sp.name from SalesPerson sp LEFT JOIN Orders o on sp.sales_id = o.sales_id LEFT JOIN Company c on o.com_id = c.com_id and c.name != 'RED' where c.com_id is null;

SELECT name
FROM SalesPerson
WHERE sales_id NOT IN (
    SELECT o.sales_id
    FROM Orders o
    JOIN Company c ON o.com_id = c.com_id
    WHERE c.name = 'RED'
);    
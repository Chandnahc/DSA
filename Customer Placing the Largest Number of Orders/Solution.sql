# Write your MySQL query statement below
select
    customer_number
from 
    Orders
group by 
    customer_number
having 
    count(*) = (select MAX(group_count) as max_count from (select count(*) as group_count from Orders group by customer_number) as a);
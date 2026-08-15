# Write your MySQL query statement below
select p.product_name, SUM(o.unit) as unit from Products p join Orders o using(product_id) where o.order_date >= '2020-02-01'
AND o.order_date < '2020-03-01' GROUP BY p.product_id having SUM(o.unit) >= 100;
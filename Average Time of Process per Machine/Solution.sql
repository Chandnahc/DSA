# Write your MySQL query statement below
-- select machine_id, ROUND(SUM(CASE(WHEN ))/COUNT(process_id),3) from Activity group by machine_id, process_id;

-- select a1.machine_id, ROUND(SUM(a2.timestamp - a1.timestamp)/COUNT(a1.process_id),3) as processing_time from Activity a1 join Activity a2 on a2.activity_type = 'end' AND a1.activity_type = 'start' group by a1.machine_id, a1.process_id;


SELECT machine_id,ROUND((SUM(CASE WHEN activity_type = 'end' THEN  timestamp ELSE 0 END) - SUM(CASE WHEN activity_type = 'start' THEN  timestamp ELSE 0 END))/COUNT(DISTINCT process_id),3) as processing_time FROM Activity GROUP BY machine_id;
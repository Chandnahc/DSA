# Write your MySQL query statement below
-- select p.product_id, ROUND(
--     SUM(CASE WHEN us.purchase_date <= p.end_date AND us.purchase_date >= p.start_date THEN (p.price * us.units) ELSE 0 END)/SUM(CASE WHEN us.purchase_date <= p.end_date AND us.purchase_date >= p.start_date THEN us.units ELSE 0 END)
-- ,2) as average_price from Prices p join UnitsSold us USING(product_id) group by p.product_id;

SELECT 
    p.product_id,
    ROUND(
        COALESCE(
            SUM(
                CASE 
                    WHEN us.purchase_date BETWEEN p.start_date AND p.end_date
                    THEN p.price * us.units
                    ELSE 0
                END
            ) 
            /
            NULLIF(
                SUM(
                    CASE 
                        WHEN us.purchase_date BETWEEN p.start_date AND p.end_date
                        THEN us.units
                        ELSE 0
                    END
                ),
                0
            ),
            0
        ),
        2
    ) AS average_price
FROM Prices p
LEFT JOIN UnitsSold us 
    USING (product_id)
GROUP BY p.product_id;
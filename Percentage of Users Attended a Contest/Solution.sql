SELECT
    r.contest_id,
    ROUND(
        100 * COUNT(*) / (SELECT COUNT(*) FROM Users),
        2
    ) AS percentage
FROM Register r
GROUP BY r.contest_id order by percentage DESC,r.contest_id ASC;
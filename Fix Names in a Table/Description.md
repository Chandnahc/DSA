# 1667. Fix Names in a Table

**Difficulty:** Easy  
**Topics:** Database  

---

## Problem Description

Table: `Users`
| Column Name | Type |
| --- | --- |
| user_id | int |
| name | varchar |

`user_id` is the primary key (column with unique values) for this table.  
This table contains the ID and the name of the user. The name consists of only lowercase and uppercase characters.

Write a solution to fix the names so that only the first character is uppercase and the rest are lowercase.

Return the result table ordered by `user_id`.

---

## Examples

### Example 1
**Input:**  
`Users` table:
| user_id | name |
| --- | --- |
| 1 | aLice |
| 2 | bOB |

**Output:**  
| user_id | name |
| --- | --- |
| 1 | Alice |
| 2 | Bob |

---

## Constraints

* The tables do not have explicit constraints listed in the problem description other than standard schema rules.

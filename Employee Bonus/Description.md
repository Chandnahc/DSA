# [577. Employee Bonus](https://leetcode.com/problems/employee-bonus/)

## 🟢 Easy

---

### **Problem Statement**

Write a solution to report the **name** and **bonus amount** of each employee who satisfies either of the following criteria:
1. The employee has a bonus **less than 1000**.
2. The employee **did not receive any bonus** (their bonus is `null`).

---

### **Schema**

**Table: `Employee`**
| Column Name | Type    |
| :--- | :--- |
| empId (PK)  | int     |
| name        | varchar |
| supervisor  | int     |
| salary      | int     |

**Table: `Bonus`**
| Column Name | Type |
| :--- | :--- |
| empId (FK)  | int  |
| bonus       | int  |

---

### **Example**

**Input:** 
`Employee` table:
| empId | name | salary |
| :--- | :--- | :--- |
| 3 | Brad | 4000 |
| 1 | John | 1000 |
| 2 | Dan | 2000 |

`Bonus` table:
| empId | bonus |
| :--- | :--- |
| 2 | 500 |

**Output:** 
| name | bonus |
| :--- | :--- |
| Brad | null |
| John | null |
| Dan | 500 |

---

### **Approach: LEFT JOIN and NULL Handling**



To solve this, we need to combine the two tables based on the `empId`.

#### **1. Why LEFT JOIN?**
An `INNER JOIN` only returns rows where there is a match in **both** tables. If an employee doesn't have a record in the `Bonus` table, they would be excluded entirely. A `LEFT JOIN` ensures all employees from the `Employee` table are included, filling in `null` for the bonus column where no match is found.

#### **2. Handling the Filter**
Once the tables are joined, we need to filter for two conditions:
*   `bonus < 1000`
*   `bonus IS NULL` (This captures the employees who were not in the Bonus table).

#### **The Solution (SQL):**
```sql
SELECT 
    e.name, 
    b.bonus
FROM Employee e
LEFT JOIN Bonus b ON e.empId = b.empId
WHERE b.bonus < 1000 OR b.bonus IS NULL;

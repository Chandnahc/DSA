# [610. Triangle Judgement](https://leetcode.com/problems/triangle-judgement/)

## 🟢 Easy

---

### **Problem Statement**

Report for every three line segments $(x, y, z)$ whether they can form a triangle.

#### **Database Schema**

**Table:** `Triangle`
| Column Name | Type |
|-------------|------|
| x           | int  |
| y           | int  |
| z           | int  |

In SQL, $(x, y, z)$ is the primary key column for this table. Each row contains the lengths of three line segments.

---

### **Example**

**Input:** 
`Triangle` table:
| x  | y  | z  |
|----|----|----|
| 13 | 15 | 30 |
| 10 | 20 | 15 |

**Output:** 
| x  | y  | z  | triangle |
|----|----|----|----------|
| 13 | 15 | 30 | No       |
| 10 | 20 | 15 | Yes      |

---

### **Complexity Analysis**

* **Time Complexity:** $O(N)$  
  The database performs a simple linear scan across all $N$ rows to evaluate the condition for each record.
* **Space Complexity:** $O(1)$  
  No additional storage or complex data structures are needed beyond the output table.

---

### **Approach: Triangle Inequality Theorem**

To determine if three line segments can form a triangle, they must satisfy the **Triangle Inequality Theorem**. This theorem states that for any triangle, the sum of the lengths of any two sides must be greater than the length of the remaining side.

For sides $x, y,$ and $z$, all three conditions must be true:
1. $x + y > z$
2. $x + z > y$
3. $y + z > x$

#### **Implementation**
In SQL, we can use a `CASE` statement or an `IF` function to evaluate these conditions row by row.

#### **SQL Solution**
```sql
SELECT 
    x, 
    y, 
    z,
    CASE 
        WHEN x + y > z AND x + z > y AND y + z > x THEN 'Yes'
        ELSE 'No'
    END AS triangle
FROM 
    Triangle;

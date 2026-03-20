# [181. Employees Earning More Than Their Managers](https://leetcode.com/problems/employees-earning-more-than-their-managers/)

## 🟢 Easy

---

### **Problem Statement**

**Table:** `Employee`
| Column Name | Type    |
| :--- | :--- |
| id          | int     |
| name        | varchar |
| salary      | int     |
| managerId   | int     |

`id` is the primary key for this table. Each row indicates the ID of an employee, their name, salary, and the ID of their manager.

**Task:** Write a solution to find the employees who earn more than their managers.

---

### **Example 1**

**Input:** Employee table:
| id | name  | salary | managerId |
| :--- | :--- | :--- | :--- |
| 1  | Joe   | 70000  | 3         |
| 2  | Henry | 80000  | 4         |
| 3  | Sam   | 60000  | Null      |
| 4  | Max   | 90000  | Null      |

**Output:** | Employee |
| :--- |
| Joe      |

**Explanation:** Joe (70,000) earns more than his manager Sam (60,000). Henry (80,000) earns less than his manager Max (90,000).

---

### **Complexity Analysis**

* **Time Complexity:** $O(n^2)$ or $O(n \log n)$  
  Depending on the database engine's join optimization and indexing on `managerId`.
* **Space Complexity:** $O(n)$  
  To store the resulting list of employee names.

---

### **Approach: Self-Join**



The most common way to solve this is to join the `Employee` table with itself. We can alias the table twice—once for the "Employee" and once for the "Manager".

1.  **Aliasing:** Use `Employee AS e` to represent the workers and `Employee AS m` to represent the managers.
2.  **Joining Logic:** Join them where the employee's `managerId` matches the manager's `id` (`e.managerId = m.id`).
3.  **Filtering:** Add a `WHERE` clause to compare the salaries: `e.salary > m.salary`.
4.  **Selection:** Select only the employee's name.

#### **Alternative: Using a Subquery**
You can also use a correlated subquery to check the manager's salary for every row, but a Join is generally more idiomatic and often faster in SQL.

---

**Topics:** `Database` | `SQL`

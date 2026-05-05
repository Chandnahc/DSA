# [584. Find Customer Referee](https://leetcode.com/problems/find-customer-referee/)

## 🟢 Easy

---

### **Problem Statement**

Find the names of the customers that are **not** referred by the customer with `id = 2`.

This includes:
1. Customers referred by anyone else (`id != 2`).
2. Customers who were **not referred at all** (their `referee_id` is `null`).

---

### **Schema**

**Table: `Customer`**
| Column Name | Type    |
| :--- | :--- |
| id (PK)     | int     |
| name        | varchar |
| referee_id  | int     |

---

### **Example**

**Input:** 
`Customer` table:
| id | name | referee_id |
| :--- | :--- | :--- |
| 1 | Will | null |
| 2 | Jane | null |
| 3 | Alex | 2 |
| 4 | Bill | null |
| 5 | Zack | 1 |
| 6 | Mark | 2 |

**Output:** 
| name |
| :--- |
| Will |
| Jane |
| Bill |
| Zack |

---

### **Approach: Handling Three-Valued Logic**

The most common mistake in this problem is using a simple `WHERE referee_id != 2`. In SQL, comparisons with `NULL` always result in `UNKNOWN`, and rows with an `UNKNOWN` status are filtered out.

#### **The Strategy:**
To get the correct result, you must explicitly ask for the `NULL` values.

1.  **Condition A:** The `referee_id` is a number other than 2.
2.  **Condition B:** The `referee_id` is `NULL`.

#### **The Solution (SQL):**
```sql
SELECT name
FROM Customer
WHERE referee_id != 2 OR referee_id IS NULL;

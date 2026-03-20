# [182. Duplicate Emails](https://leetcode.com/problems/duplicate-emails/)

## 🟢 Easy

---

### **Problem Statement**

**Table:** `Person`
| Column Name | Type    |
| :--- | :--- |
| id          | int     |
| email       | varchar |

`id` is the primary key for this table. Each row contains an email (lowercase only).

**Task:** Write a solution to report all the duplicate emails. It is guaranteed that the email field is not `NULL`.

---

### **Example 1**

**Input:** Person table:
| id | email   |
| :--- | :--- |
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |

**Output:** | Email   |
| :--- |
| a@b.com |

**Explanation:** `a@b.com` is repeated two times.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  The database must scan all $n$ rows to group and count the emails.
* **Space Complexity:** $O(n)$  
  In the worst case where many emails are unique, the intermediate grouping table will store $n$ entries.

---

### **Approach: Grouping and Filtering**



To find duplicates, we look for values that appear more than once in the dataset.

1.  **Grouping:** Use `GROUP BY email` to collect all identical email addresses into their own "buckets."
2.  **Counting:** Use the aggregate function `COUNT(email)` to see how many rows exist in each bucket.
3.  **Filtering Groups:** Unlike the `WHERE` clause (which filters individual rows), the `HAVING` clause is used to filter **groups**.
4.  **Condition:** Set the condition `HAVING COUNT(email) > 1`.

#### **Alternative: Using a Self-Join**
You can also solve this by joining the table to itself:
- Join `Person p1` and `Person p2` on `p1.email = p2.email`.
- Add a condition where the IDs are different (`p1.id != p2.id`).
- Select `DISTINCT p1.email`.
*Note: The `GROUP BY` approach is generally more efficient and readable.*

---

**Topics:** `Database` | `SQL`

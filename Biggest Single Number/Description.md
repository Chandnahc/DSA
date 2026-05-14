# [619. Biggest Single Number](https://leetcode.com/problems/biggest-single-number/)

## 🟢 Easy

---

### **Problem Statement**

A **single number** is a number that appears only once in the `MyNumbers` table.

Find the largest **single number**. If there is no single number, report `null`.

#### **Database Schema**

**Table:** `MyNumbers`
| Column Name | Type |
|-------------|------|
| num         | int  |

This table may contain duplicates; it has no primary key.

---

### **Examples**

**Example 1:**
> **Input:** `num = [8, 8, 3, 3, 1, 4, 5, 6]`  
> **Output:** `6`  
> **Explanation:** The single numbers (appearing exactly once) are 1, 4, 5, and 6. The largest is 6.

**Example 2:**
> **Input:** `num = [8, 8, 7, 7, 3, 3, 3]`  
> **Output:** `null`  
> **Explanation:** There are no numbers that appear only once.

---

### **Complexity Analysis**

* **Time Complexity:** $O(N)$  
  The database must scan the table to group the numbers and count their occurrences.
* **Space Complexity:** $O(K)$  
  Where $K$ is the number of unique integers in the table, used for the grouping operation.

---

### **Approach: Subquery with Group By and Having**

To solve this, we need to filter the numbers based on their frequency and then pick the maximum from that filtered list.

#### **1. Identify Single Numbers**
Use `GROUP BY num` combined with `HAVING COUNT(num) = 1`. This isolates the numbers that appear exactly once.

#### **2. Find the Maximum**
Wrap the first step in a subquery and use the `MAX()` function. A key feature of `MAX()` is that if the subquery returns no rows (empty set), `MAX()` will naturally return `null`.

#### **SQL Solution**
```sql
SELECT
    MAX(num) AS num
FROM (
    SELECT
        num
    FROM
        MyNumbers
    GROUP BY
        num
    HAVING
        COUNT(num) = 1
) AS single_numbers;

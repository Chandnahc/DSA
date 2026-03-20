# [175. Combine Two Tables](https://leetcode.com/problems/combine-two-tables/)

## 🟢 Easy

---

### **Problem Statement**

**Table:** `Person`
| Column Name | Type    |
| :--- | :--- |
| personId    | int     |
| lastName    | varchar |
| firstName   | varchar |

`personId` is the primary key for this table.

**Table:** `Address`
| Column Name | Type    |
| :--- | :--- |
| addressId   | int     |
| personId    | int     |
| city        | varchar |
| state       | varchar |

`addressId` is the primary key for this table.

**Task:** Write a solution to report the `firstName`, `lastName`, `city`, and `state` of each person in the `Person` table. If the address of a `personId` is not present in the `Address` table, report `null` instead.

---

### **Example 1**

**Input:** Person table:
| personId | lastName | firstName |
| :--- | :--- | :--- |
| 1        | Wang     | Allen     |
| 2        | Alice    | Bob       |

Address table:
| addressId | personId | city | state |
| :--- | :--- | :--- | :--- |
| 1         | 2        | New York City | New York |
| 2         | 3        | Leetcode      | California |

**Output:** | firstName | lastName | city | state |
| :--- | :--- | :--- | :--- |
| Allen     | Wang     | null | null |
| Bob       | Alice    | New York City | New York |

**Explanation:** There is no address for `personId = 1`, so the `city` and `state` are returned as `null`.

---

### **Complexity Analysis**

* **Time Complexity:** $O(m + n)$  
  Where $m$ and $n$ are the number of rows in the `Person` and `Address` tables respectively.
* **Space Complexity:** $O(m + n)$  
  The space required for the output table.

---

### **Approach: Using LEFT JOIN**



In SQL, a **JOIN** clause is used to combine rows from two or more tables based on a related column between them.

1.  **Selection:** We need to select `firstName` and `lastName` from the `Person` table, and `city` and `state` from the `Address` table.
2.  **The Join Choice:** * An `INNER JOIN` would only return people who **have** an entry in the Address table. 
    * A `LEFT JOIN` (or `LEFT OUTER JOIN`) returns **all** records from the left table (`Person`), and the matched records from the right table (`Address`).
3.  **Null Handling:** If there is no match, the result is `null` (or `None`) from the right side, which perfectly satisfies the problem's requirements.

---

**Topics:** `Database` | `SQL`

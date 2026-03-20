# [183. Customers Who Never Order](https://leetcode.com/problems/customers-who-never-order/)

## 🟢 Easy

---

### **Problem Statement**

**Table:** `Customers`
| Column Name | Type    |
| :--- | :--- |
| id          | int     |
| name        | varchar |

`id` is the primary key for this table. Each row indicates the ID and name of a customer.

**Table:** `Orders`
| Column Name | Type |
| :--- | :--- |
| id          | int  |
| customerId  | int  |

`id` is the primary key for this table. `customerId` is a foreign key of the ID from the `Customers` table.

**Task:** Write a solution to find all customers who never order anything.

---

### **Example 1**

**Input:** Customers table:
| id | name  |
| :--- | :--- |
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |

Orders table:
| id | customerId |
| :--- | :--- |
| 1  | 3          |
| 2  | 1          |

**Output:** | Customers |
| :--- |
| Henry     |
| Max       |

---

### **Complexity Analysis**

* **Time Complexity:** $O(n + m)$  
  Where $n$ is the number of customers and $m$ is the number of orders. Most database engines optimize this using hash joins or index lookups.
* **Space Complexity:** $O(n)$  
  To store the resulting list of names.

---

### **Approach: Identifying Missing Relationships**



There are three primary ways to solve this in SQL. Choosing the right one often depends on the specific database size and indexing.

#### **1. Using `NOT IN` (Subquery)**
The most intuitive approach is to find all `customerId`s present in the `Orders` table and then select customers whose `id` is **not** in that list.
- **Logic:** `SELECT name FROM Customers WHERE id NOT IN (SELECT customerId FROM Orders)`

#### **2. Using `LEFT JOIN` and `NULL` Check**
Perform a `LEFT JOIN` from `Customers` to `Orders`. If a customer has no orders, the columns from the `Orders` table will be `NULL`.
- **Logic:** Join on `Customers.id = Orders.customerId` and filter `WHERE Orders.id IS NULL`.

#### **3. Using `NOT EXISTS`**
This checks for the non-existence of a record in the `Orders` table for each customer. It is often the most performant for large datasets.
- **Logic:** `WHERE NOT EXISTS (SELECT 1 FROM Orders WHERE Orders.customerId = Customers.id)`

---

**Topics:** `Database` | `SQL`

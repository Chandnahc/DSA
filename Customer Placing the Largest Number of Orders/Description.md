# [586. Customer Placing the Largest Number of Orders](https://leetcode.com/problems/customer-placing-the-largest-number-of-orders/)

## 🟢 Easy

---

### **Problem Statement**

Find the `customer_number` for the customer who has placed the **largest number of orders**.

**Note:** The test cases guarantee that exactly one customer will have placed more orders than any other customer (no ties for the top spot).

---

### **Schema**

**Table: `Orders`**
| Column Name      | Type |
| :--------------- | :--- |
| order_number (PK)| int  |
| customer_number  | int  |

---

### **Example**

**Input:** 
`Orders` table:
| order_number | customer_number |
| :----------- | :-------------- |
| 1            | 1               |
| 2            | 2               |
| 3            | 3               |
| 4            | 3               |

**Output:** 
| customer_number |
| :-------------- |
| 3               |

**Explanation:** 
- Customer 1 has 1 order.
- Customer 2 has 1 order.
- Customer 3 has 2 orders.
Customer 3 has the most orders.

---

### **Approach: Group By, Order By, and Limit**

To solve this, we need to perform three main operations in sequence:

#### **1. Grouping**
We use `GROUP BY customer_number` to gather all orders belonging to the same customer into a single "bucket."

#### **2. Counting and Sorting**
We count the number of records in each bucket using `COUNT(order_number)`. To get the largest count at the top, we sort the results in **descending** order (`DESC`).

#### **3. Limiting**
Since the problem guarantees exactly one top customer, we use `LIMIT 1` to grab only the first row of our sorted list.

#### **The Solution (SQL):**
```sql
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(order_number) DESC
LIMIT 1;

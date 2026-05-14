# [607. Sales Person](https://leetcode.com/problems/sales-person/)

## 🟢 Easy

---

### **Problem Statement**

Find the names of all the salespersons who **did not** have any orders related to the company with the name **"RED"**.

#### **Database Schema**

**Table:** `SalesPerson`
| Column Name     | Type    |
|-----------------|---------|
| sales_id        | int     |
| name            | varchar |
| salary          | int     |
| commission_rate | int     |
| hire_date       | date    |

**Table:** `Company`
| Column Name | Type    |
|-------------|---------|
| com_id      | int     |
| name        | varchar |
| city        | varchar |

**Table:** `Orders`
| Column Name | Type |
|-------------|------|
| order_id    | int  |
| order_date  | date |
| com_id      | int  |
| sales_id    | int  |
| amount      | int  |

---

### **Example**

**Input:** 
`SalesPerson` table:
| sales_id | name |
|----------|------|
| 1        | John |
| 2        | Amy  |
| 3        | Mark |
| 4        | Pam  |
| 5        | Alex |

`Company` table:
| com_id | name   |
|--------|--------|
| 1      | RED    |
| 2      | ORANGE |

`Orders` table:
| order_id | com_id | sales_id |
|----------|--------|----------|
| 3        | 1      | 1        |
| 4        | 1      | 4        |

**Output:** 
| name |
|------|
| Amy  |
| Mark |
| Alex |

**Explanation:** John (ID 1) and Pam (ID 4) have orders with company RED. The rest (Amy, Mark, Alex) do not.

---

### **Complexity Analysis**

* **Time Complexity:** $O(N + M)$  
  Where $N$ is the number of orders and $M$ is the number of salespersons. The database performs joins and filtering efficiently.
* **Space Complexity:** $O(M)$  
  The intermediate result set stores the IDs of salespersons linked to "RED".

---

### **Approach: Subquery with NOT IN**

The most straightforward way to solve this is to first identify everyone who *did* have an order with "RED" and then exclude them from the main list.

#### **1. Find "RED" Salespeople**
Join the `Orders` table with the `Company` table to find all `sales_id`s associated with the company name `'RED'`.

#### **2. Filter the Main Table**
Select names from the `SalesPerson` table where the `sales_id` is **NOT IN** the result of the previous subquery.

#### **SQL Solution**
```sql
SELECT
    name
FROM
    SalesPerson
WHERE
    sales_id NOT IN (
        SELECT
            sales_id
        FROM
            Orders
        JOIN
            Company ON Orders.com_id = Company.com_id
        WHERE
            Company.name = 'RED'
    );

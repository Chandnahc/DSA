# [511. Game Play Analysis I](https://leetcode.com/problems/game-play-analysis-i/)

## 🟢 Easy

---

### **Problem Statement**

**Table:** `Activity`
| Column Name  | Type    |
| :----------- | :------ |
| player_id    | int     |
| device_id    | int     |
| event_date   | date    |
| games_played | int     |

The table tracks player login activity. `(player_id, event_date)` is the primary key.

**Goal:** Write a solution to find the **first login date** for each player.

---

### **Example**

**Input:** 

| player_id | device_id | event_date | games_played |
| :-------- | :-------- | :--------- | :----------- |
| 1         | 2         | 2016-03-01 | 5            |
| 1         | 2         | 2016-05-02 | 6            |
| 3         | 1         | 2016-03-02 | 0            |

**Output:** 

| player_id | first_login |
| :-------- | :---------- |
| 1         | 2016-03-01  |
| 3         | 2016-03-02  |

---

### **Approach: SQL Aggregation**

To find the first login, we need to look at all dates associated with a single `player_id` and pick the chronologically earliest one.

#### **The Strategy:**
1.  **Group By:** Use `GROUP BY player_id` to collect all rows belonging to the same player into a single bucket.
2.  **Aggregate:** Use the `MIN()` function on the `event_date` column to find the smallest (earliest) date in each bucket.
3.  **Alias:** Rename the resulting column to `first_login` using the `AS` keyword to match the expected output.

#### **SQL Solution:**
```sql
SELECT 
    player_id, 
    MIN(event_date) AS first_login
FROM 
    Activity
GROUP BY 
    player_id;

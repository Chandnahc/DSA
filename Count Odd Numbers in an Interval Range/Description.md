# [1523. Count Odd Numbers in an Interval Range](https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/)

## 🟢 Easy

---

### **Problem Statement**

Given two non-negative integers `low` and `high`. Return the **count of odd numbers** between `low` and `high` (inclusive).

---

### **Examples**

**Example 1:**
> **Input:** `low = 3, high = 7`  
> **Output:** `3`  
> **Explanation:** The odd numbers between 3 and 7 are `[3, 5, 7]`.

**Example 2:**
> **Input:** `low = 8, high = 10`  
> **Output:** `1`  
> **Explanation:** The only odd number between 8 and 10 is `[9]`.

---

### **Constraints**

- $0 \le \text{low} \le \text{high} \le 10^9$

---

### **Complexity Analysis**

* **Time Complexity:** $O(1)$  
  We use a simple mathematical formula that executes in constant time, regardless of the size of the input.
* **Space Complexity:** $O(1)$  
  No extra memory is required.

---

### **Approach: Mathematical Logic (The "Half" Rule)**

The number of integers in the range $[low, high]$ is $(high - low + 1)$. In any sequence of consecutive integers, exactly half are even and half are odd, provided the count is even.

#### **The Strategy:**
1.  **Count Total Numbers:** The total count of numbers in the range is `high - low + 1`.
2.  **Initial Estimate:** Half of those numbers are odd. We can represent this as `(high - low + 1) // 2`.
3.  **Adjust for Odd Boundaries:** If both `low` and `high` are **odd**, the division above will miss one because both the starting and ending points are odd. 
    * *Example:* For `3` to `7`, the numbers are `[3, 4, 5, 6, 7]`. Total is 5. $5 // 2 = 2$. But there are actually 3 odds.
    * **Rule:** If `low % 2 != 0` OR `high % 2 != 0`, we need to account for that "extra" potential odd number.

#### **The Optimized Formula:**
The simplest way to write this in one line is:
1. Find how many odd numbers are between $0$ and $N$. This is simply $(N + 1) // 2$.
2. The answer for $[low, high]$ is: `countOdds(high) - countOdds(low - 1)`.

Alternatively, the "greedy" math way:
```python
# If either low or high is odd, the count is (high - low) // 2 + 1
# Otherwise, it's (high - low) // 2
return (high - low) // 2 + (1 if (low % 2 != 0 or high % 2 != 0) else 0)

# [441. Arranging Coins](https://leetcode.com/problems/arranging-coins/)

## 🟢 Easy

---

### **Problem Statement**

You have `n` coins and you want to build a staircase where the $i^{th}$ row has exactly $i$ coins. The last row may be incomplete.

**Goal:** Given `n`, return the number of **complete rows** of the staircase you can build.

---

### **Examples**

**Example 1:**

![example_1](https://assets.leetcode.com/uploads/2021/04/09/arrangecoins1-grid.jpg);

> **Input:** `n = 5`  
> **Output:** `2`  
> **Explanation:** > Row 1: 1 coin (Total 1)
> Row 2: 2 coins (Total 3)
> Row 3: 3 coins (Total 6) -> We only have 5 coins, so row 3 is incomplete. Return 2.

**Example 2:**

![example_2](https://assets.leetcode.com/uploads/2021/04/09/arrangecoins2-grid.jpg);

> **Input:** `n = 8`  
> **Output:** `3`  
> **Explanation:** 1 + 2 + 3 = 6. The next row would need 4 coins (Total 10), which we don't have.

---

### **Constraints**

- $1 \le n \le 2^{31} - 1$

---

### **Complexity Analysis**

* **Time Complexity:** $O(\log n)$ using Binary Search, or $O(1)$ using the Math approach.
* **Space Complexity:** $O(1)$ as we only store a few variables.

---

### **Approach 1: Binary Search (Algorithmic)**

The sum of $k$ rows is given by the arithmetic series formula: 
$$\text{Sum} = \frac{k(k + 1)}{2}$$

We need to find the largest $k$ such that $\frac{k(k + 1)}{2} \le n$. Since the function is monotonically increasing, we can binary search for $k$.

#### **The Strategy:**
1.  **Initialize:** `left = 0`, `right = n`.
2.  **Loop:** While `left <= right`:
    * `mid = left + (right - left) / 2`
    * `curr = mid * (mid + 1) / 2`
    * If `curr == n`, return `mid`.
    * If `curr < n`, move `left = mid + 1`.
    * If `curr > n`, move `right = mid - 1`.
3.  **Return:** `right` (the largest $k$ that fits).

---

### **Approach 2: Math (The Quadratic Formula)**

We can solve for $k$ directly using the quadratic equation:
$$\frac{k^2 + k}{2} = n \implies k^2 + k - 2n = 0$$

Using the quadratic formula $k = \frac{-b + \sqrt{b^2 - 4ac}}{2a}$ (where $a=1, b=1, c=-2n$):
$$k = \lfloor \frac{-1 + \sqrt{1 + 8n}}{2} \rfloor$$



#### **The Strategy:**
1. Simply calculate the result of the formula above.
2. Return the result cast to an integer (floored).

---

**Topics:** `Math` | `Binary Search`

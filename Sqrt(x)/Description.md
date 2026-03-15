# [69. Sqrt(x)](https://leetcode.com/problems/sqrtx/)

## 🟢 Easy

---

### **Problem Statement**

Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer. The returned integer should be **non-negative** as well.

You **must not use** any built-in exponent function or operator (e.g., `pow(x, 0.5)` in C++ or `x ** 0.5` in Python).

---

### **Examples**

**Example 1:**
> **Input:** `x = 4`  
> **Output:** `2`  
> **Explanation:** The square root of 4 is 2, so we return 2.

**Example 2:**
> **Input:** `x = 8`  
> **Output:** `2`  
> **Explanation:** The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

---

### **Constraints**

- `0 <= x <= 2^31 - 1`

---

### **Complexity Analysis**

* **Time Complexity:** $O(\log x)$  
  Using Binary Search, we halve the search space in each iteration.
* **Space Complexity:** $O(1)$  
  We only use a constant amount of space for variables.

---

### **Approach: Binary Search**



The square root of $x$ must lie between $0$ and $x$. Since the range is sorted, we can use binary search to find the largest integer $i$ such that $i^2 \le x$.

1.  **Initialize** `left = 0` and `right = x`.
2.  **Loop** while `left <= right`:
    * Calculate `mid = left + (right - left) / 2`.
    * If `mid * mid == x`, return `mid`.
    * If `mid * mid < x`, store `mid` as a potential answer and move the `left` pointer to `mid + 1`.
    * If `mid * mid > x`, move the `right` pointer to `mid - 1`.
3.  **Return** the stored answer.

> **Note:** To avoid integer overflow during `mid * mid`, use long long in C++ or check the condition as `mid <= x / mid`.

---

**Topics:** `Math` | `Binary Search`

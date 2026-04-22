# [507. Perfect Number](https://leetcode.com/problems/perfect-number/)

## 🟢 Easy

---

### **Problem Statement**

A **perfect number** is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.

**Goal:** Given an integer `num`, return `true` if it is a perfect number, otherwise return `false`.

---

### **Examples**

**Example 1:**
> **Input:** `num = 28`  
> **Output:** `true`  
> **Explanation:** The divisors of 28 (excluding 28) are 1, 2, 4, 7, and 14.  
> $1 + 2 + 4 + 7 + 14 = 28$.

**Example 2:**
> **Input:** `num = 7`  
> **Output:** `false`  
> **Explanation:** The only divisor (excluding 7) is 1. $1 \neq 7$.

---

### **Constraints**

- $1 \le num \le 10^8$

---

### **Complexity Analysis**

* **Time Complexity:** $O(\sqrt{num})$  
  We only iterate up to the square root of the number to find all pairs of divisors.
* **Space Complexity:** $O(1)$  
  We only use a single variable to maintain the running sum of divisors.

---

### **Approach: Optimized Divisor Summation**



The key observation is that divisors always come in pairs. If $i$ is a divisor of $n$, then $n/i$ is also a divisor. One of these must be less than or equal to $\sqrt{n}$.

#### **The Strategy:**
1.  **Edge Case:** If `num <= 1`, return `false` (Perfect numbers must be positive and $1$ has no divisors smaller than itself).
2.  **Initialize:** Start with `sum = 1` (since 1 is a divisor for every number $>1$).
3.  **Iterate:** Loop from $i = 2$ up to $\sqrt{num}$:
    * If `num % i == 0`:
        * Add $i$ to the `sum`.
        * If $i \neq num/i$, add $num/i$ to the `sum` as well (this prevents double-counting the square root of a perfect square like 25).
4.  **Final Comparison:** Return `true` if `sum == num`.

#### **Why $\sqrt{num}$?**
For `num = 10^8`, $\sqrt{num}$ is only $10,000$. Checking $10,000$ numbers is nearly instantaneous for a computer, whereas checking $100,000,000$ numbers would cause a noticeable delay or a Time Limit Exceeded (TLE) error.

---

**Topics:** `Math`

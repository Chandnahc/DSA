# [509. Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)

## 🟢 Easy

---

### **Problem Statement**

The **Fibonacci numbers**, commonly denoted $F(n)$, form a sequence where each number is the sum of the two preceding ones, starting from $0$ and $1$.

- $F(0) = 0, F(1) = 1$
- $F(n) = F(n - 1) + F(n - 2)$, for $n > 1$

**Goal:** Given $n$, calculate $F(n)$.

---

### **Examples**

**Example 1:**
> **Input:** `n = 2`  
> **Output:** `1`  
> **Explanation:** $F(2) = F(1) + F(0) = 1 + 0 = 1$.

**Example 2:**
> **Input:** `n = 4`  
> **Output:** `3`  
> **Explanation:** $F(4) = F(3) + F(2) = 2 + 1 = 3$.

---

### **Constraints**

- $0 \le n \le 30$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We compute each Fibonacci number once up to $n$.
* **Space Complexity:** $O(1)$  
  By only tracking the last two numbers in the sequence, we avoid using an array or a deep recursion stack.

---

### **Approach: Iterative Space Optimization**



While you can solve this with recursion, a simple loop is much faster and uses less memory.

#### **The Strategy:**
1.  **Base Cases:** If $n = 0$, return `0`. If $n = 1$, return `1`.
2.  **Initialize:** Create two variables, `prev1 = 0` and `prev2 = 1`. These represent $F(n-2)$ and $F(n-1)$.
3.  **Iterate:** Loop from `i = 2` up to `n`:
    * Calculate the current number: `current = prev1 + prev2`.
    * Update `prev1 = prev2`.
    * Update `prev2 = current`.
4.  **Return:** `prev2` (which now holds the value of $F(n)$).

#### **Why not use basic Recursion?**


Simple recursion ($F(n) = F(n-1) + F(n-2)$) repeats the same calculations many times. For example, to find $F(5)$, it calculates $F(3)$ multiple times. This leads to an exponential time complexity. Using the iterative approach (or memoization) turns that into a linear $O(n)$ process.

---

**Topics:** `Math` | `Dynamic Programming` | `Recursion` | `Memoization`

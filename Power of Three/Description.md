# [326. Power of Three](https://leetcode.com/problems/power-of-three/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer `n`, return `true` if it is a power of three. Otherwise, return `false`.

An integer `n` is a power of three if there exists an integer `x` such that $n = 3^x$.

---

### **Examples**

**Example 1:**
> **Input:** `n = 27`  
> **Output:** `true`  
> **Explanation:** $3^3 = 27$

**Example 2:**
> **Input:** `n = 0`  
> **Output:** `false`

**Example 3:**
> **Input:** `n = -1`  
> **Output:** `false`

---

### **Constraints**

- $-2^{31} \le n \le 2^{31} - 1$

---

### **Complexity Analysis**

* **Time Complexity:** $O(1)$  
  If using the mathematical limitation approach, we perform a single modulo operation.
* **Space Complexity:** $O(1)$  
  No extra space is required.

---

### **Approach: Integer Limitations (The Constant Time Trick)**

In a 32-bit signed integer environment, the maximum value is $2^{31} - 1$. We can pre-calculate the largest power of 3 that fits within this limit.



#### **The Logic:**
1.  **Find the Max Power:** The largest power of 3 less than $2^{31}$ is $3^{19} = 1,162,261,467$.
2.  **The Property:** Since 3 is a prime number, any power of 3 (like $3^x$) will only have 3 as its prime factor. Therefore, $3^{19}$ is divisible by every $3^x$ where $x \le 19$.
3.  **The Check:** * Ensure $n > 0$.
    * Check if $1,162,261,467 \pmod n == 0$.

#### **Alternative: Loop / Recursion**
You can also solve this by repeatedly dividing `n` by 3 as long as `n % 3 == 0`. If you end up with `n == 1`, it was a power of three. This takes $O(\log_3 n)$ time.

#### **Alternative: Logarithms**
Using $\log_{3}(n) = \frac{\log_{10}(n)}{\log_{10}(3)}$, you can check if the result is an integer. However, be careful with floating-point precision errors in some languages!

---

**Topics:** `Math` | `Recursion`

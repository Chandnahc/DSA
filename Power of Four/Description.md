# [342. Power of Four](https://leetcode.com/problems/power-of-four/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer `n`, return `true` if it is a power of four. Otherwise, return `false`.

An integer `n` is a power of four if there exists an integer `x` such that $n = 4^x$.

---

### **Examples**

**Example 1:**
> **Input:** `n = 16`  
> **Output:** `true`  
> **Explanation:** $4^2 = 16$

**Example 2:**
> **Input:** `n = 5`  
> **Output:** `false`

**Example 3:**
> **Input:** `n = 1`  
> **Output:** `true`

---

### **Constraints**

- $-2^{31} \le n \le 2^{31} - 1$

---

### **Complexity Analysis**

* **Time Complexity:** $O(1)$  
  Using bitwise operations or mathematical properties allows for a constant-time check.
* **Space Complexity:** $O(1)$  
  No extra space is used.

---

### **Approach: Bit Manipulation + Parity**



A power of four must first be a **power of two**. However, it has an additional constraint on where its single `1` bit is located.

#### **The Logic:**
1.  **Is it a Power of Two?** As we saw in Problem 231, $n > 0$ and `(n & (n - 1)) == 0` ensures there is exactly one `1` bit.
2.  **Is the '1' bit in the right place?** In binary:
    - $4^0 = 1$ (Bit 0)
    - $4^1 = 4$ (Bit 2)
    - $4^2 = 16$ (Bit 4)
    - $4^3 = 64$ (Bit 6)  
    Notice the `1` bit always appears at an **even** index (0, 2, 4...).
3.  **The Modulo 3 Trick:** Alternatively, a mathematical property of powers of four is that $4^x \pmod 3$ always equals $1$. Other powers of two (like $2, 8, 32$) result in $2 \pmod 3$.

#### **The Elegant Solution:**
```python
return n > 0 and (n & (n - 1)) == 0 and (n % 3 == 1)

# [258. Add Digits](https://leetcode.com/problems/add-digits/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it.

---

### **Examples**

**Example 1:**
> **Input:** `num = 38`  
> **Output:** `2`  
> **Explanation:** The process is:  
> 38 --> 3 + 8 --> 11  
> 11 --> 1 + 1 --> 2  
> Since 2 has only one digit, return it.

**Example 2:**
> **Input:** `num = 0`  
> **Output:** `0`

---

### **Constraints**

- $0 \le \text{num} \le 2^{31} - 1$

---

### **Complexity Analysis**

* **Time Complexity:** $O(1)$  
  Using the mathematical Digital Root formula, we calculate the result in a single step.
* **Space Complexity:** $O(1)$  
  No extra space or recursion stack is required.

---

### **Approach: The Digital Root (Mathematical Solution)**

The problem asks for the "Digital Root" of a number. A well-known property in number theory is that a number and the sum of its digits have the same remainder when divided by 9.



#### **The Logic:**
- If `num == 0`, the result is `0`.
- If `num % 9 == 0`, the result is `9` (because a non-zero number whose digits sum to a multiple of 9 must eventually reduce to 9).
- Otherwise, the result is simply `num % 9`.

#### **The Formula:**
This can be condensed into a single elegant expression:
$$1 + (num - 1) \pmod 9$$

#### **Why not Simulation?**
While a `while` loop works ($O(\log n)$ time), the $O(1)$ approach is the expected "optimal" answer in high-level interviews because it demonstrates an understanding of modular arithmetic.

---

**Topics:** `Math` | `Simulation` | `Number Theory`

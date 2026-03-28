# [231. Power of Two](https://leetcode.com/problems/power-of-two/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer `n`, return `true` if it is a power of two. Otherwise, return `false`.

An integer `n` is a power of two if there exists an integer `x` such that $n = 2^x$.

---

### **Examples**

**Example 1:**
> **Input:** `n = 1`  
> **Output:** `true`  
> **Explanation:** $2^0 = 1$

**Example 2:**
> **Input:** `n = 16`  
> **Output:** `true`  
> **Explanation:** $2^4 = 16$

**Example 3:**
> **Input:** `n = 3`  
> **Output:** `false`

---

### **Constraints**

- $-2^{31} \le n \le 2^{31} - 1$

---

### **Complexity Analysis**

* **Time Complexity:** $O(1)$  
  Using bitwise operations, we determine the result in constant time.
* **Space Complexity:** $O(1)$  
  No extra space is used.

---

### **Approach: Bit Manipulation (The `n & (n - 1)` Trick)**



A number that is a power of two has a very distinct binary signature: it is a `1` followed by only `0`s (e.g., $8 = 1000_2$, $16 = 10000_2$).

#### **The Logic:**
1.  **Positive Check:** A power of two must be greater than 0.
2.  **The Flip:** If you subtract `1` from a power of two, the leading `1` becomes `0`, and all subsequent `0`s become `1`s.
    * Example: $8$ is `1000`. $8 - 1$ is `0111`.
3.  **The Bitwise AND:** If you perform `n & (n - 1)`, a power of two will result in exactly `0` because there are no overlapping `1` bits.
    * `1000 & 0111 = 0000`

#### **Condition:**
`return n > 0 && (n & (n - 1)) == 0;`

---

**Topics:** `Math` | `Bit Manipulation` | `Recursion`

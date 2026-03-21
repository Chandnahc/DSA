# [191. Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/)

## 🟢 Easy

---

### **Problem Statement**

Given a positive integer `n`, write a function that returns the number of **set bits** in its binary representation (also known as the **Hamming weight**).

---

### **Examples**

**Example 1:**
> **Input:** `n = 11`  
> **Output:** `3`  
> **Explanation:** The input binary string `1011` has a total of three set bits.

**Example 2:**
> **Input:** `n = 128`  
> **Output:** `1`  
> **Explanation:** The input binary string `10000000` has a total of one set bit.

**Example 3:**
> **Input:** `n = 2147483645`  
> **Output:** `30`

---

### **Constraints**

- `1 <= n <= 2^31 - 1`

---

### **Complexity Analysis**

* **Time Complexity:** $O(k)$  
  Where $k$ is the number of set bits (1s) in the integer. In the worst case (all bits are 1), this is $O(32)$, which is effectively $O(1)$.
* **Space Complexity:** $O(1)$  
  We only use a single counter variable.

---

### **Approach 1: Simple Bit Shifting**

We can check each bit by using a mask or shifting the number right 32 times and checking the last bit using `n & 1`.

### **Approach 2: Brian Kernighan’s Algorithm (Optimal)**



This is the most efficient way to count set bits because it **only iterates as many times as there are 1s**.

#### **The Logic:**
When you subtract `1` from a number, the rightmost set bit (1) becomes `0`, and all bits to its right become `1`. If you then perform a bitwise **AND** between the original number and the modified number (`n & (n - 1)`), it effectively "flips" the rightmost 1 to a 0.

**Example Trace (`n = 12`):**
1. `n = 1100` (12)
2. `n = n & (n - 1)` → `1100 & 1011` = `1000` (One iteration, one '1' removed)
3. `n = n & (n - 1)` → `1000 & 0111` = `0000` (Second iteration, all '1's removed)
4. Total count = **2**.

---

**Topics:** `Divide and Conquer` | `Bit Manipulation`

# [1009. Complement of Base 10 Integer](https://leetcode.com/problems/complement-of-base-10-integer/)

## 🟢 Easy

---

### **Problem Statement**

The **complement** of an integer is the integer you get when you flip all the `0`'s to `1`'s and all the `1`'s to `0`'s in its binary representation.

* For example, the integer `5` is `"101"` in binary and its **complement** is `"010"` which is the integer `2`.

Given an integer `n`, return *its complement*.

---

### **Examples**

**Example 1:**
> **Input:** `n = 5`  
> **Output:** `2`  
> **Explanation:** 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.

**Example 2:**
> **Input:** `n = 7`  
> **Output:** `0`  
> **Explanation:** 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.

**Example 3:**
> **Input:** `n = 10`  
> **Output:** `5`  
> **Explanation:** 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.

---

### **Constraints**

- `0 <= n < 10^9`

---

### **Complexity Analysis**

* **Time Complexity:** $O(\log n)$  
  The number of bits in $n$ is $\log_2(n)$. We iterate or perform operations based on the bit length.
* **Space Complexity:** $O(1)$  
  Only a few variables are used to store the mask and the result.

---

### **Approach: Bit Manipulation (Masking)**



To find the complement, we cannot simply use the bitwise NOT operator (`~`) because it flips all 32 bits (including leading zeros), leading to a negative result in signed integers. Instead:

1.  **Handle Base Case:** If `n == 0`, the complement is `1`.
2.  **Create a Mask:** Find a number that has all `1`s with the same bit-length as `n`.  
    * Example: For `n = 5` (101), the mask is `7` (111).
3.  **XOR Operation:** Use the XOR (`^`) operator between `n` and the `mask`.  
    * `101 ^ 111 = 010` (which is 2).
4.  **Return Result.**

---

**Topics:** `Bit Manipulation`

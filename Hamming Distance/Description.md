# [461. Hamming Distance](https://leetcode.com/problems/hamming-distance/)

## 🟢 Easy

---

### **Problem Statement**

The **Hamming distance** between two integers is the number of positions at which the corresponding bits are different.

Given two integers `x` and `y`, return the **Hamming distance** between them.

---

### **Examples**

**Example 1:**
> **Input:** `x = 1, y = 4`  
> **Output:** `2`  
> **Explanation:** > 1 (0 0 0 1)  
> 4 (0 1 0 0)  
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↑&nbsp;&nbsp;&nbsp;↑  
> The bits at positions 0 and 2 are different.

**Example 2:**
> **Input:** `x = 3, y = 1`  
> **Output:** `1`  
> **Explanation:** > 3 (0 0 1 1)  
> 1 (0 0 0 1)  
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;↑  
> Only the bit at position 1 is different.

---

### **Constraints**

- $0 \le x, y \le 2^{31} - 1$

---

### **Complexity Analysis**

* **Time Complexity:** $O(1)$  
  Since the integers are 32-bit (bounded by $2^{31}-1$), the number of operations is fixed and does not depend on the input size.
* **Space Complexity:** $O(1)$  
  We only use a single variable to store the XOR result and the count.

---

### **Approach: XOR + Bit Counting**



The XOR ($\oplus$) operator is designed specifically to identify differences. For any two bits:
- $0 \oplus 0 = 0$
- $1 \oplus 1 = 0$
- $1 \oplus 0 = 1$
- $0 \oplus 1 = 1$

By XORing `x` and `y`, we get a new number where every bit set to `1` represents a position where `x` and `y` were different.

#### **The Strategy:**
1.  **Calculate XOR:** `xor_result = x ^ y`.
2.  **Count Set Bits:** Count how many bits are set to `1` in `xor_result`.
    * **Method A (Built-in):** Use language-specific functions like `Integer.bitCount()` (Java), `bin(n).count('1')` (Python), or `__builtin_popcount()` (C++).
    * **Method B (Brian Kernighan’s Algorithm):** Repeatedly flip the least significant set bit to zero using `n = n & (n - 1)` until the number becomes zero. This is faster if the number of set bits is small.



#### **Why XOR?**
XOR effectively "highlights" the differences. Once we have the differences isolated as `1`s, the problem simply turns into "Count the number of set bits," also known as finding the **Hamming Weight**.

---

**Topics:** `Bit Manipulation`

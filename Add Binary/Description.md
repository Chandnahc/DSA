# [67. Add Binary](https://leetcode.com/problems/add-binary/)

## 🟢 Easy

---

### **Problem Statement**

Given two binary strings `a` and `b`, return their sum as a binary string.

The input strings consist only of `'0'` or `'1'` characters and do not contain leading zeros except for the zero itself.

---

### **Examples**

**Example 1:**
> **Input:** `a = "11", b = "1"`  
> **Output:** `"100"`  
> **Explanation:** 11 (3 in decimal) + 1 (1 in decimal) = 100 (4 in decimal).

**Example 2:**
> **Input:** `a = "1010", b = "1011"`  
> **Output:** `"10101"`  
> **Explanation:** 1010 (10 in decimal) + 1011 (11 in decimal) = 10101 (21 in decimal).

---

### **Constraints**

- `1 <= a.length, b.length <= 10^4`
- `a` and `b` consist only of `'0'` or `'1'` characters.
- Each string does not contain leading zeros except for the zero itself.

---

### **Complexity Analysis**

* **Time Complexity:** $O(\max(N, M))$  
  Where $N$ and $M$ are the lengths of strings `a` and `b`. We iterate through the strings once.
* **Space Complexity:** $O(\max(N, M))$  
  To store the resulting sum string.

---

### **Approach: Bit-by-Bit Simulation**



Since the strings can be very long (up to $10^4$), we cannot convert them to integers directly (as they will overflow). Instead, we simulate the addition from right to left:

1.  **Initialize** a `carry` variable to 0 and a result string/builder.
2.  **Iterate** from the end of both strings using two pointers.
3.  **Calculate Sum:** For each position, `sum = bitA + bitB + carry`.
    * The new bit to add to our result is `sum % 2`.
    * The new carry is `sum / 2`.
4.  **Handle Final Carry:** After the loop, if `carry` is still 1, append it to the result.
5.  **Reverse** the result string (since we added bits from right to left) and return it.

---

**Topics:** `Math` | `String` | `Bit Manipulation` | `Simulation`

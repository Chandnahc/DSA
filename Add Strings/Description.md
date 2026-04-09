# [415. Add Strings](https://leetcode.com/problems/add-strings/)

## 🟢 Easy

---

### **Problem Statement**

Given two non-negative integers, `num1` and `num2` represented as strings, return the **sum** of `num1` and `num2` as a string.

**Constraints:**
- You must solve the problem **without** using any built-in library for handling large integers (like `BigInteger`).
- You must **not** convert the inputs to integers directly.

---

### **Examples**

**Example 1:**
> **Input:** `num1 = "11", num2 = "123"`  
> **Output:** `"134"`

**Example 2:**
> **Input:** `num1 = "456", num2 = "77"`  
> **Output:** `"533"`

**Example 3:**
> **Input:** `num1 = "0", num2 = "0"`  
> **Output:** `"0"`

---

### **Constraints**

- $1 \le \text{num1.length, num2.length} \le 10^4$
- `num1` and `num2` consist of only digits.
- `num1` and `num2` don't have leading zeros except for the zero itself.

---

### **Complexity Analysis**

* **Time Complexity:** $O(\max(n, m))$  
  Where $n$ and $m$ are the lengths of the two strings. We process each digit at most once.
* **Space Complexity:** $O(\max(n, m))$  
  The result string (or StringBuilder) will have a length of at most $\max(n, m) + 1$.

---

### **Approach: Elementary Addition (Two Pointers + Carry)**



We simulate the process of manual addition by iterating from the end of both strings toward the beginning.

#### **The Strategy:**
1.  **Initialize:** Start with two pointers, `i = num1.length - 1` and `j = num2.length - 1`. Initialize `carry = 0`.
2.  **Iterate:** While `i >= 0` OR `j >= 0` OR `carry > 0`:
    * **Extract Digits:** * Get the digit from `num1` if `i >= 0`, otherwise use `0`. 
        * Get the digit from `num2` if `j >= 0`, otherwise use `0`.
        * *Tip:* To get the integer value of a character `'5'`, use `s[i] - '0'`.
    * **Calculate Sum:** `total = digit1 + digit2 + carry`.
    * **Update Carry:** `carry = total // 10`.
    * **Append Result:** Add `total % 10` to your result builder.
    * **Move Pointers:** Decrement both `i` and `j`.
3.  **Finalize:** Since we added digits from right to left, the result builder will be backward. **Reverse** the string before returning.

#### **Key Detail:**
The condition `OR carry > 0` is crucial. It ensures that if the last addition (the most significant digits) results in a carry (e.g., $900 + 100$), we don't forget to add that final `1` at the beginning of the number.

---

**Topics:** `Math` | `String` | `Simulation`

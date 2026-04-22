# [504. Base 7](https://leetcode.com/problems/base-7/)

## 🟢 Easy

---

### **Problem Statement**

Given an integer `num`, return its **Base 7** representation as a string.

---

### **Examples**

**Example 1:**
> **Input:** `num = 100`  
> **Output:** `"202"`  
> **Explanation:** > $100 = (2 \times 7^2) + (0 \times 7^1) + (2 \times 7^0)$
> $100 = (2 \times 49) + (0 \times 7) + (2 \times 1) = 98 + 0 + 2$.

**Example 2:**
> **Input:** `num = -7`  
> **Output:** `"-10"`

---

### **Constraints**

- $-10^7 \le num \le 10^7$

---

### **Complexity Analysis**

* **Time Complexity:** $O(\log_7 |num|)$  
  The number of digits in base 7 is proportional to the logarithm of the number.
* **Space Complexity:** $O(\log_7 |num|)$  
  To store the resulting string or character buffer.

---

### **Approach: Repeated Division (Successive Modulo)**



To convert a decimal number to any base, we use the "Divide and Remainder" method.

#### **The Strategy:**
1.  **Handle Zero:** If `num` is 0, return `"0"` immediately.
2.  **Handle Negative:** Keep track of the sign. Work with the absolute value of `num`, and append a `"-"` at the end if the original number was negative.
3.  **The Loop:** While `num > 0`:
    * Calculate the remainder: `digit = num % 7`.
    * Append this digit to a string builder.
    * Update the number: `num = num // 7`.
4.  **Finalize:** The digits are collected in reverse order (from least significant to most significant). **Reverse** the string before returning it.

#### **Manual Example (num = 100):**
1. $100 \div 7 = 14$, remainder **2**
2. $14 \div 7 = 2$, remainder **0**
3. $2 \div 7 = 0$, remainder **2**
* Digits collected: `2, 0, 2`. Reversed: `"202"`.

---

**Topics:** `Math`

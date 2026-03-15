# [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/)

## 🟢 Easy

---

### **Problem Statement**

Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

| Symbol | Value |
| :--- | :--- |
| **I** | 1 |
| **V** | 5 |
| **X** | 10 |
| **L** | 50 |
| **C** | 100 |
| **D** | 500 |
| **M** | 1000 |

Roman numerals are usually written largest to smallest from left to right. However, there are six instances where subtraction is used:
* `I` can be placed before `V` (5) and `X` (10) to make 4 and 9.
* `X` can be placed before `L` (50) and `C` (100) to make 40 and 90.
* `C` can be placed before `D` (500) and `M` (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

---

### **Examples**

**Example 1:**
> **Input:** `s = "III"`  
> **Output:** `3`

**Example 2:**
> **Input:** `s = "LVIII"`  
> **Output:** `58`  
> **Explanation:** L = 50, V = 5, III = 3.

**Example 3:**
> **Input:** `s = "MCMXCIV"`  
> **Output:** `1994`  
> **Explanation:** M = 1000, CM = 900, XC = 90, IV = 4.

---

### **Constraints**

- `1 <= s.length <= 15`
- `s` contains only the characters (`'I'`, `'V'`, `'X'`, `'L'`, `'C'`, `'D'`, `'M'`).
- It is guaranteed that `s` is a valid roman numeral in the range `[1, 3999]`.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the string once. Since the maximum length of the string is constant (15), this is technically $O(1)$.
* **Space Complexity:** $O(1)$  
  We use a fixed-size map/dictionary to store the Roman symbol values.

---

### **Approach: Left-to-Right Comparison**



To convert the string to an integer, we iterate through the string and compare the current character's value with the next character's value:

1.  **Map Symbols:** Store the values of each Roman numeral in a hash map.
2.  **Iterate:** Look at each character `s[i]`.
3.  **Check Next Value:**
    * If the value of `s[i]` is **less than** the value of `s[i+1]`, it means we are in a subtraction case (like `IV` or `XC`). **Subtract** the current value from our total.
    * Otherwise, **add** the current value to our total.
4.  **Final Value:** The last character is always added.

---

**Topics:** `Hash Table` | `Math` | `String`

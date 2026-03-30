# [2839. Check if Strings Can be Made Equal With Operations I](https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-i/)

## 🟢 Easy

---

### **Problem Statement**

You are given two strings `s1` and `s2`, both of length **4**, consisting of lowercase English letters.

You can apply the following operation on any of the two strings any number of times:
- Choose any two indices `i` and `j` such that `j - i = 2`, then **swap** the two characters at those indices.

Return `true` if you can make the strings `s1` and `s2` equal, and `false` otherwise.

---

### **Examples**

**Example 1:**
> **Input:** `s1 = "abcd", s2 = "cdab"`  
> **Output:** `true`  
> **Explanation:** > 1. Swap `s1[0]` and `s1[2]` ('a' and 'c') -> `s1` becomes `"cbad"`.
> 2. Swap `s1[1]` and `s1[3]` ('b' and 'd') -> `s1` becomes `"cdab"`.
> Now `s1 == s2`.

**Example 2:**
> **Input:** `s1 = "abcd", s2 = "dacb"`  
> **Output:** `false`  
> **Explanation:** It is impossible to move 'd' to the first position because 'd' is at an odd index (3) and can only move to another odd index (1).

---

### **Constraints**

- `s1.length == s2.length == 4`
- Strings consist only of lowercase English letters.

---

### **Complexity Analysis**

* **Time Complexity:** $O(1)$  
  Since the string length is fixed at 4, the number of comparisons is constant.
* **Space Complexity:** $O(1)$  
  No extra space is required beyond a few character comparisons.

---

### **Approach: Even and Odd Index Parity**



The constraint `j - i = 2` is the key. In a string of length 4:
- Index **0** can only swap with index **2**.
- Index **1** can only swap with index **3**.

This means for `s1` to become `s2`, the **set** of characters at even indices in `s1` must match the **set** of characters at even indices in `s2`. The same must be true for odd indices.

#### **The Logic:**
For each pair, there are only two possibilities: either they stay in their original positions or they swap.

1.  **Check Even Indices (0 and 2):**
    * Is `(s1[0] == s2[0] && s1[2] == s2[2])` OR `(s1[0] == s2[2] && s1[2] == s2[0])`?
2.  **Check Odd Indices (1 and 3):**
    * Is `(s1[1] == s2[1] && s1[3] == s2[3])` OR `(s1[1] == s2[3] && s1[3] == s2[1])`?
3.  **Result:** If both conditions are true, return `true`. Otherwise, return `false`.

---

**Topics:** `String` | `Math`

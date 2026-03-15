# [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

## 🟢 Easy

---

### **Problem Statement**

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

---

### **Examples**

**Example 1:**
> **Input:** `s = "()"`  
> **Output:** `true`

**Example 2:**
> **Input:** `s = "()[]{}"`  
> **Output:** `true`

**Example 3:**
> **Input:** `s = "(]"`  
> **Output:** `false`

**Example 4:**
> **Input:** `s = "([])"`  
> **Output:** `true`

**Example 5:**
> **Input:** `s = "([)]"`  
> **Output:** `false`

---

### **Constraints**

- `1 <= s.length <= 10^4`
- `s` consists of parentheses only `'()[]{}'`.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the string once, and each stack operation (push/pop) takes $O(1)$ time.
* **Space Complexity:** $O(n)$  
  In the worst case (e.g., all opening brackets `((((((`), the stack will store all $n$ characters.

---

### **Approach: Using a Stack (LIFO)**



A stack is the ideal data structure here because the **last** opening bracket encountered must be the **first** one closed.

1.  **Initialize** an empty stack.
2.  **Iterate** through each character in the string:
    * If it is an **opening bracket** (`(`, `{`, `[`), **push** it onto the stack.
    * If it is a **closing bracket** (`)`, `}`, `]`):
        * Check if the stack is empty. If it is, the string is invalid (no matching opening bracket).
        * **Pop** the top element from the stack and check if it matches the current closing bracket.
        * If they don't match (e.g., `(` vs `]`), the string is invalid.
3.  **Final Check:** After the loop, if the stack is **empty**, return `true`. If elements remain in the stack, it means some opening brackets were never closed, so return `false`.

---

**Topics:** `String` | `Stack`

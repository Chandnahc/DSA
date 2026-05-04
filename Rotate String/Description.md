# [796. Rotate String](https://leetcode.com/problems/rotate-string/)

## 🟢 Easy

---

### **Problem Statement**

Given two strings `s` and `goal`, return `true` if and only if `s` can become `goal` after some number of **shifts** on `s`.

A **shift** on `s` consists of moving the leftmost character of `s` to the rightmost position.
- For example, if `s = "abcde"`, one shift makes it `"bcdea"`.

---

### **Examples**

**Example 1:**
> **Input:** `s = "abcde", goal = "cdeab"`  
> **Output:** `true`  
> **Explanation:** 
> - Shift 1: `"bcdea"`
> - Shift 2: `"cdeab"` (Match!)

**Example 2:**
> **Input:** `s = "abcde", goal = "abced"`  
> **Output:** `false`  
> **Explanation:** No matter how many shifts you perform, you can never get `"abced"`.

---

### **Constraints**

- $1 \le s.length, goal.length \le 100$
- `s` and `goal` consist of lowercase English letters.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  String concatenation takes $O(n)$, and the substring search (depending on the language's implementation) generally takes $O(n)$.
* **Space Complexity:** $O(n)$  
  We create a new string of length $2n$ when we concatenate `s + s`.

---

### **Approach: String Concatenation Trick**

The most elegant way to solve this doesn't involve moving characters at all.



#### **The Strategy:**
1.  **Check Lengths:** If `s` and `goal` have different lengths, it is impossible for one to be a rotation of the other. Return `false`.
2.  **Double the String:** Create a new string by adding `s` to itself: `combined = s + s`.
3.  **Search:** Check if `goal` is a substring of `combined`.
    * If `s = "abcde"`, then `s + s = "abcdeabcde"`.
    * Notice the rotations inside: `"abcde"`, `"bcdea"`, `"cdeab"`, `"deabc"`, `"eabcd"`.
4.  **Return:** `true` if `goal` is found, `false` otherwise.

#### **Why this works:**
Any cyclic shift of a string is simply a "break" in the circle. By doubling the string, you represent the circle twice, ensuring that no matter where the "break" occurs, the sequence will appear contiguously somewhere in the middle of the doubled string.

---

**Topics:** `String` | `String Matching`

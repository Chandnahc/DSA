# [392. Is Subsequence](https://leetcode.com/problems/is-subsequence/)

## 🟢 Easy

---

### **Problem Statement**

Given two strings `s` and `t`, return `true` if `s` is a **subsequence** of `t`, or `false` otherwise.

A **subsequence** is a new string formed from the original string by deleting zero or more characters without disturbing the relative positions of the remaining characters. (e.g., `"ace"` is a subsequence of `"abcde"`, but `"aec"` is not).

---

### **Examples**

**Example 1:**
> **Input:** `s = "abc", t = "ahbgdc"`  
> **Output:** `true`  
> **Explanation:** 'a', 'b', and 'c' appear in `t` in that specific order.

**Example 2:**
> **Input:** `s = "axc", t = "ahbgdc"`  
> **Output:** `false`  
> **Explanation:** While 'a' and 'c' are present, 'x' is nowhere to be found in `t`.

---

### **Constraints**

- $0 \le s.length \le 100$
- $0 \le t.length \le 10^4$
- `s` and `t` consist only of lowercase English letters.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  Where $n$ is the length of the target string `t`. In the worst case, we scan `t` once.
* **Space Complexity:** $O(1)$  
  We only use two integer pointers regardless of the input size.

---

### **Approach: Two Pointers**



Since we need to match characters of `s` in the order they appear, we can use one pointer for each string.

#### **The Strategy:**
1.  **Initialize Pointers:** `i = 0` (for `s`) and `j = 0` (for `t`).
2.  **Iterate:** While `i < s.length` and `j < t.length`:
    * If `s[i] == t[j]`, we found a match for the current character in `s`. Increment `i` to look for the next character.
    * Always increment `j` to keep scanning through string `t`.
3.  **Check Result:** If `i` reaches the end of `s` (`i == s.length`), it means we found every character of `s` in the correct order within `t`. Return `true`.
4.  **Fallback:** If the loop ends and `i` hasn't reached the end, return `false`.

#### **Edge Case:**
If `s` is an empty string, it is technically a subsequence of any string `t`. The logic `i == s.length` handles this perfectly (returning `true` immediately).

---

**Topics:** `Two Pointers` | `String` | `Dynamic Programming`

# [1784. Check if Binary String Has at Most One Segment of Ones](https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/)

## 🟢 Easy

---

### **Problem Statement**

Given a binary string `s` **without leading zeros**, return `true` if `s` contains **at most one contiguous segment of ones**. Otherwise, return `false`.

---

### **Examples**

**Example 1:**
> **Input:** `s = "1001"`  
> **Output:** `false`  
> **Explanation:** The ones are separated by zeros, creating two distinct segments.

**Example 2:**
> **Input:** `s = "110"`  
> **Output:** `true`  
> **Explanation:** There is only one contiguous block of ones at the beginning.

---

### **Constraints**

- `1 <= s.length <= 100`
- `s[i]` is either `'0'` or `'1'`.
- `s[0]` is `'1'`.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n)$  
  We traverse the string at most once to check for the segment pattern.
* **Space Complexity:** $O(1)$  
  We only use a constant amount of extra space.

---

### **Approach: Identifying Segment Transitions**



Since the string is guaranteed to start with `'1'`, the only way to have more than one segment of ones is if a `'1'` appears after a `'0'` has already occurred.

1.  **Observation:** If we find the substring `"01"` anywhere in the string, it means a new segment of ones has started after the first one ended.
2.  **Implementation:** * Simply check if `"01"` is present in the string. 
    * If it is found, return `false`.
    * If we reach the end of the string without finding `"01"`, return `true`.

---

**Topics:** `String`

# [28. Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

## 🟢 Easy

---

### **Problem Statement**

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

---

### **Examples**

**Example 1:**
> **Input:** `haystack = "sadbutsad", needle = "sad"`  
> **Output:** `0`  
> **Explanation:** `"sad"` occurs at index 0 and 6. The first occurrence is at index 0, so we return 0.

**Example 2:**
> **Input:** `haystack = "leetcode", needle = "leeto"`  
> **Output:** `-1`  
> **Explanation:** `"leeto"` did not occur in `"leetcode"`, so we return -1.

---

### **Constraints**

- `1 <= haystack.length, needle.length <= 10^4`
- `haystack` and `needle` consist of only lowercase English characters.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n \cdot m)$  
  Where $n$ is the length of `haystack` and $m$ is the length of `needle`. In the worst case, we check the `needle` at every possible starting position in the `haystack`.
* **Space Complexity:** $O(1)$  
  We only use a few integer variables for indexing.

---

### **Approach: Sliding Window (Brute Force)**



1.  **Edge Case:** If `needle` is longer than `haystack`, return `-1` immediately.
2.  **Iterate:** Loop through the `haystack` from index `i = 0` up to `haystack.length - needle.length`.
3.  **Substring Comparison:** At each index `i`, check if the substring of `haystack` starting at `i` with length `needle.length` is equal to `needle`.
4.  **Return Index:** If a match is found, return the current index `i`.
5.  **Not Found:** If the loop completes without a match, return `-1`.

---

**Topics:** `Two Pointers` | `String` | `String Matching`

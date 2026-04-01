# [2840. Check if Strings Can be Made Equal With Operations II](https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-ii/)

## 🟡 Medium

---

### **Problem Statement**

You are given two strings `s1` and `s2`, both of length `n`, consisting of lowercase English letters.

You can apply the following operation on any of the two strings any number of times:
- Choose any two indices `i` and `j` such that `i < j` and the difference `j - i` is **even**, then **swap** the two characters at those indices.

Return `true` if you can make the strings `s1` and `s2` equal, and `false` otherwise.

---

### **Examples**

**Example 1:**
> **Input:** `s1 = "abcdba", s2 = "cabdab"`  
> **Output:** `true`  
> **Explanation:** By swapping characters at even indices and odd indices separately, we can rearrange `s1` to match `s2`.

**Example 2:**
> **Input:** `s1 = "abe", s2 = "bea"`  
> **Output:** `false`  
> **Explanation:** In `s1`, 'a' is at index 0 (even). In `s2`, 'a' is at index 2 (even), which is fine. However, 'b' is at index 1 (odd) in `s1` but index 0 (even) in `s2`. Since an odd-indexed character can never move to an even index, they cannot be made equal.

---

### **Constraints**

- $n == s1.length == s2.length$
- $1 \le n \le 10^5$
- `s1` and `s2` consist only of lowercase English letters.

---

### **Complexity Analysis**

* **Time Complexity:** $O(n \log n)$ or $O(n)$  
  $O(n \log n)$ if you use sorting to compare the parity buckets, or $O(n)$ if you use a frequency array (since the character set is limited to 26).
* **Space Complexity:** $O(n)$ or $O(1)$  
  $O(n)$ for storing the characters of each bucket, or $O(1)$ for a fixed-size frequency array of 26 integers.

---

### **Approach: Parity Grouping (Frequency Counting)**



Because the swap distance must be even, any character at an **even index** can reach **any other even index** through a series of swaps. The same applies to **odd indices**. However, a character can **never** jump from an even index to an odd one.

#### **The Strategy:**
1.  **Separate the Buckets:** Create four frequency counts (or sorted lists):
    * Characters at **even** indices of `s1`.
    * Characters at **even** indices of `s2`.
    * Characters at **odd** indices of `s1`.
    * Characters at **odd** indices of `s2`.
2.  **Compare:** * The even-index characters of `s1` must be a perfect permutation of the even-index characters of `s2`.
    * The odd-index characters of `s1` must be a perfect permutation of the odd-index characters of `s2`.
3.  **Result:** If both "bucket" comparisons match, return `true`. Otherwise, return `false`.

---

**Topics:** `Hash Table` | `String` | `Sorting`

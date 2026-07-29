# 3517. Smallest Palindromic Rearrangement I

**Difficulty:** Medium  
**Topics:** Hash Table, String, Counting, Greedy  

---

## Problem Description

You are given a palindromic string `s`.

Return *the lexicographically smallest palindromic permutation of `s`*.

---

## Examples

### Example 1
**Input:** `s = "z"`  
**Output:** `"z"`  
**Explanation:**  
A string of only one character is already the lexicographically smallest palindrome.

### Example 2
**Input:** `s = "babab"`  
**Output:** `"abbba"`  
**Explanation:**  
Rearranging `"babab"` $\rightarrow$ `"abbba"` gives the smallest lexicographic palindrome.

### Example 3
**Input:** `s = "daccad"`  
**Output:** `"acddca"`  
**Explanation:**  
Rearranging `"daccad"` $\rightarrow$ `"acddca"` gives the smallest lexicographic palindrome.

---

## Constraints

* `1 <= s.length <= 10^5`
* `s` consists of lowercase English letters.
* `s` is guaranteed to be palindromic.

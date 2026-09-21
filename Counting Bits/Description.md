# 338. Counting Bits

**Difficulty:** Easy  
**Topics:** Dynamic Programming, Bit Manipulation  

---

## Problem Description

Given an integer `n`, return an array `ans` of length `n + 1` such that for each `i` ($0 \le i \le n$), `ans[i]` is the number of 1's in the binary representation of `i`.

Do not solve it with built-in functions (i.e., like `__builtin_popcount` in C++).  

---

## Examples

### Example 1
**Input:** `n = 2`  
**Output:** `[0,1,1]`  
**Explanation:**  
* `0 --> 0`
* `1 --> 1`
* `2 --> 10`

### Example 2
**Input:** `n = 5`  
**Output:** `[0,1,1,2,1,2]`  
**Explanation:**  
* `0 --> 0`
* `1 --> 1`
* `2 --> 10`
* `3 --> 11`
* `4 --> 100`
* `5 --> 101`

---

## Constraints

* `0 <= n <= 10^5`

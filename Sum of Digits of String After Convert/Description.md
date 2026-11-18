# 1945. Sum of Digits of String After Convert

**Difficulty:** Easy  
**Topics:** String, Simulation  

---

## Problem Description

You are given a string `s` consisting of lowercase English letters, and an integer `k`. Your task is to convert the string into an integer by a special process, and then transform it by summing its digits repeatedly `k` times. More specifically, perform the following steps:
1. Convert `s` into an integer by replacing each letter with its position in the alphabet (i.e. replace `'a'` with 1, `'b'` with 2, ..., `'z'` with 26).
2. Transform the integer by replacing it with the sum of its digits.
3. Repeat the transform operation (step 2) `k` times in total.

For example, if `s = "zbax"` and `k = 2`, then the resulting integer would be 8 by the following operations:
1. Convert: `"zbax"` $\to$ `"(26)(2)(1)(24)"` $\to$ `"262124"` $\to$ 262124
2. Transform #1: 262124 $\to$ $2 + 6 + 2 + 1 + 2 + 4$ $\to$ 17
3. Transform #2: 17 $\to$ $1 + 7$ $\to$ 8

Return *the resulting integer after performing the operations described above*.

---

## Examples

### Example 1
**Input:** `s = "iiii"`, `k = 1`  
**Output:** `36`  
**Explanation:**  
The operations are as follows:
* Convert: `"iiii"` $\to$ `"(9)(9)(9)(9)"` $\to$ `"9999"` $\to$ 9999
* Transform #1: 9999 $\to$ $9 + 9 + 9 + 9$ $\to$ 36  
Thus the resulting integer is 36.

### Example 2
**Input:** `s = "leetcode"`, `k = 2`  
**Output:** `6`  
**Explanation:**  
The operations are as follows:
* Convert: `"leetcode"` $\to$ `"(12)(5)(5)(20)(3)(15)(4)(5)"` $\to$ `"12552031545"` $\to$ 12552031545
* Transform #1: 12552031545 $\to$ $1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5$ $\to$ 33
* Transform #2: 33 $\to$ $3 + 3$ $\to$ 6  
Thus the resulting integer is 6.

### Example 3
**Input:** `s = "zbax"`, `k = 2`  
**Output:** `8`  

---

## Constraints

* $1 \le s.\text{length} \le 100$
* $1 \le k \le 10$
* `s` consists of lowercase English letters.

# 1640. Check Array Formation Through Concatenation

**Difficulty:** Easy  
**Topics:** Array, Hash Table  

---

## Problem Description

You are given an array of distinct integers `arr` and an array of integer arrays `pieces`, where the integers in `pieces` are distinct. Your goal is to form `arr` by concatenating the arrays in `pieces` in any order. However, you are not allowed to reorder the integers in each array `pieces[i]`.

Return *`true` if it is possible to form the array `arr` from `pieces`. Otherwise, return `false`*.

---

## Examples

### Example 1
**Input:** `arr = [15,88]`, `pieces = [[88],[15]]`  
**Output:** `true`  
**Explanation:** Concatenate `[15]` then `[88]`.

### Example 2
**Input:** `arr = [49,18,16]`, `pieces = [[16,18,49]]`  
**Output:** `false`  
**Explanation:** Even though the numbers match, we cannot reorder `pieces[0]`.

### Example 3
**Input:** `arr = [91,4,64,78]`, `pieces = [[78],[4,64],[91]]`  
**Output:** `true`  
**Explanation:** Concatenate `[91]` then `[4,64]` then `[78]`.

---

## Constraints

* $1 \le \text{pieces.length} \le \text{arr.length} \le 100$
* $\sum \text{pieces}[i].\text{length} == \text{arr.length}$
* $1 \le \text{pieces}[i].\text{length} \le \text{arr.length}$
* $1 \le \text{arr}[i], \text{pieces}[i][j] \le 100$
* The integers in `arr` are distinct.
* The integers in `pieces` are distinct (i.e., if we flatten `pieces` into a 1D array, all the integers in this array are distinct).

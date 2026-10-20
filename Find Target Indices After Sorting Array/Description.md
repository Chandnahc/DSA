# 2089. Find Target Indices After Sorting Array

**Difficulty:** Easy  
**Topics:** Array, Sorting, Binary Search  

---

## Problem Description

You are given a 0-indexed integer array `nums` and a target element `target`.

A target index is an index $i$ such that $\text{nums}[i] == \text{target}$.

Return *a list of the target indices of `nums` after sorting `nums` in non-decreasing order*. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.

---

## Examples

### Example 1
**Input:** `nums = [1,2,5,2,3]`, `target = 2`  
**Output:** `[1,2]`  
**Explanation:** After sorting, `nums` is `[1,2,2,3,5]`.  
The indices where $\text{nums}[i] == 2$ are 1 and 2.

### Example 2
**Input:** `nums = [1,2,5,2,3]`, `target = 3`  
**Output:** `[3]`  
**Explanation:** After sorting, `nums` is `[1,2,2,3,5]`.  
The index where $\text{nums}[i] == 3$ is 3.

### Example 3
**Input:** `nums = [1,2,5,2,3]`, `target = 5`  
**Output:** `[4]`  
**Explanation:** After sorting, `nums` is `[1,2,2,3,5]`.  
The index where $\text{nums}[i] == 5$ is 4.

---

## Constraints

* $1 \le \text{nums.length} \le 100$
* $1 \le \text{nums}[i], \text{target} \le 100$

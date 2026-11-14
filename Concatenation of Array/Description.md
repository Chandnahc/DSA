# 1929. Concatenation of Array

**Difficulty:** Easy  
**Topics:** Array, Simulation  

---

## Problem Description

Given an integer array `nums` of length `n`, you want to create an array `ans` of length $2n$ where $\text{ans}[i] == \text{nums}[i]$ and $\text{ans}[i + n] == \text{nums}[i]$ for $0 \le i < n$ (0-indexed).

Specifically, `ans` is the concatenation of two `nums` arrays.

Return *the array `ans`*.

---

## Examples

### Example 1
**Input:** `nums = [1,2,1]`  
**Output:** `[1,2,1,1,2,1]`  
**Explanation:** The array `ans` is formed as follows:  
* $\text{ans} = [\text{nums}[0], \text{nums}[1], \text{nums}[2], \text{nums}[0], \text{nums}[1], \text{nums}[2]]$  
* $\text{ans} = [1, 2, 1, 1, 2, 1]$

### Example 2
**Input:** `nums = [1,3,2,1]`  
**Output:** `[1,3,2,1,1,3,2,1]`  
**Explanation:** The array `ans` is formed as follows:  
* $\text{ans} = [\text{nums}[0], \text{nums}[1], \text{nums}[2], \text{nums}[3], \text{nums}[0], \text{nums}[1], \text{nums}[2], \text{nums}[3]]$  
* $\text{ans} = [1, 3, 2, 1, 1, 3, 2, 1]$

---

## Constraints

* $n == \text{nums.length}$
* $1 \le n \le 1000$
* $1 \le \text{nums}[i] \le 1000$

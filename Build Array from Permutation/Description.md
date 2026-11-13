# 1920. Build Array from Permutation

**Difficulty:** Easy  
**Topics:** Array, Simulation  

---

## Problem Description

Given a zero-based permutation `nums` (0-indexed), build an array `ans` of the same length where $\text{ans}[i] = \text{nums}[\text{nums}[i]]$ for each $0 \le i < \text{nums.length}$ and return it.

A zero-based permutation `nums` is an array of distinct integers from 0 to $\text{nums.length} - 1$ (inclusive).

---

## Examples

### Example 1
**Input:** `nums = [0,2,1,5,3,4]`  
**Output:** `[0,1,2,4,5,3]`  
**Explanation:** The array `ans` is built as follows:  
$\text{ans} = [\text{nums}[\text{nums}[0]], \text{nums}[\text{nums}[1]], \text{nums}[\text{nums}[2]], \text{nums}[\text{nums}[3]], \text{nums}[\text{nums}[4]], \text{nums}[\text{nums}[5]]]$  
$\phantom{\text{ans}} = [\text{nums}[0], \text{nums}[2], \text{nums}[1], \text{nums}[5], \text{nums}[3], \text{nums}[4]]$  
$\phantom{\text{ans}} = [0, 1, 2, 4, 5, 3]$

### Example 2
**Input:** `nums = [5,0,1,2,3,4]`  
**Output:** `[4,5,0,1,2,3]`  
**Explanation:** The array `ans` is built as follows:  
$\text{ans} = [\text{nums}[\text{nums}[0]], \text{nums}[\text{nums}[1]], \text{nums}[\text{nums}[2]], \text{nums}[\text{nums}[3]], \text{nums}[\text{nums}[4]], \text{nums}[\text{nums}[5]]]$  
$\phantom{\text{ans}} = [\text{nums}[5], \text{nums}[0], \text{nums}[1], \text{nums}[2], \text{nums}[3], \text{nums}[4]]$  
$\phantom{\text{ans}} = [4, 5, 0, 1, 2, 3]$

---

## Constraints

* $1 \le \text{nums.length} \le 1000$
* $0 \le \text{nums}[i] < \text{nums.length}$
* The elements in `nums` are distinct.

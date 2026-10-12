# 2778. Sum of Squares of Special Elements

**Difficulty:** Easy  
**Topics:** Array, Simulation  

---

## Problem Description

You are given a 1-indexed integer array `nums` of length $n$.

An element `nums[i]` of `nums` is called special if $i$ divides $n$, i.e., $n \pmod i == 0$.

Return *the sum of the squares of all special elements of `nums`*.

---

## Examples

### Example 1
**Input:** `nums = [1,2,3,4]`  
**Output:** `21`  
**Explanation:** There are exactly 3 special elements in `nums`: `nums[1]` since 1 divides 4, `nums[2]` since 2 divides 4, and `nums[4]` since 4 divides 4.  
Hence, the sum of the squares of all special elements of `nums` is $\text{nums}[1]^2 + \text{nums}[2]^2 + \text{nums}[4]^2 = 1^2 + 2^2 + 4^2 = 21$.

### Example 2
**Input:** `nums = [2,7,1,19,18,3]`  
**Output:** `63`  
**Explanation:** There are exactly 4 special elements in `nums`: `nums[1]` since 1 divides 6, `nums[2]` since 2 divides 6, `nums[3]` since 3 divides 6, and `nums[6]` since 6 divides 6.  
Hence, the sum of the squares of all special elements of `nums` is $\text{nums}[1]^2 + \text{nums}[2]^2 + \text{nums}[3]^2 + \text{nums}[6]^2 = 2^2 + 7^2 + 1^2 + 3^2 = 63$.

---

## Constraints

* $1 \le \text{nums.length} == n \le 50$
* $1 \le \text{nums}[i] \le 50$

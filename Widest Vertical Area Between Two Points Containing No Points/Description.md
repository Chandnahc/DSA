# 1637. Widest Vertical Area Between Two Points Containing No Points

**Difficulty:** Easy  
**Topics:** Array, Sorting, Geometry  

---

## Problem Description

Given $n$ points on a 2D plane where $\text{points}[i] = [x_i, y_i]$, return *the widest vertical area between two points such that no points are inside the area*.

A vertical area is an area of fixed-width extending infinitely along the Y-axis (i.e., infinite height). The widest vertical area is the one with the maximum width.

Note that points on the edge of a vertical area are not considered included in the area.

---

## Examples

### Example 1

![example_1](https://assets.leetcode.com/uploads/2020/09/19/points3.png)

**Input:** `points = [[8,7],[9,9],[7,4],[9,7]]`  
**Output:** `1`  
**Explanation:** Both the red and the blue area are optimal.

### Example 2
**Input:** `points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]`  
**Output:** `3`

---

## Constraints

* $n == \text{points.length}$
* $2 \le n \le 10^5$
* $\text{points}[i].\text{length} == 2$
* $0 \le x_i, y_i \le 10^9$

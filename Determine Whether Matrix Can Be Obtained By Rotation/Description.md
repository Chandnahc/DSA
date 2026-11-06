# 1886. Determine Whether Matrix Can Be Obtained By Rotation

**Difficulty:** Easy  
**Topics:** Array, Matrix, Simulation  

---

## Problem Description

Given two $n \times n$ binary matrices `mat` and `target`, return *`true` if it is possible to make `mat` equal to `target` by rotating `mat` in 90-degree increments, or `false` otherwise*.

---

## Examples

### Example 1

![example_1](https://assets.leetcode.com/uploads/2021/05/20/grid3.png)

**Input:** `mat = [[0,1],[1,0]]`, `target = [[1,0],[0,1]]`  
**Output:** `true`  
**Explanation:** We can rotate `mat` 90 degrees clockwise to make `mat` equal `target`.

### Example 2

![example_2](https://assets.leetcode.com/uploads/2021/05/20/grid4.png)

**Input:** `mat = [[0,1],[1,1]]`, `target = [[1,0],[0,1]]`  
**Output:** `false`  
**Explanation:** It is impossible to make `mat` equal to `target` by rotating `mat`.

### Example 3

![example_3](https://assets.leetcode.com/uploads/2021/05/26/grid4.png)

**Input:** `mat = [[0,0,0],[0,1,0],[1,1,1]]`, `target = [[1,1,1],[0,1,0],[0,0,0]]`  
**Output:** `true`  
**Explanation:** We can rotate `mat` 90 degrees clockwise two times to make `mat` equal `target`.

---

## Constraints

* $n == \text{mat.length} == \text{target.length}$
* $n == \text{mat}[i].\text{length} == \text{target}[i].\text{length}$
* $1 \le n \le 10$
* `mat[i][j]` and `target[i][j]` are either 0 or 1.

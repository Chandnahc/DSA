# 1812. Determine Color of a Chessboard Square

**Difficulty:** Easy  
**Topics:** Math, String  

---

## Problem Description

You are given `coordinates`, a string that represents the coordinates of a square of the chessboard.

![example](https://assets.leetcode.com/uploads/2021/02/19/screenshot-2021-02-20-at-22159-pm.png)

Return *`true` if the square is white, and `false` if the square is black*.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.

---

## Examples

### Example 1
**Input:** `coordinates = "a1"`  
**Output:** `false`  
**Explanation:** The square with coordinates `"a1"` is black, so return `false`.

### Example 2
**Input:** `coordinates = "h3"`  
**Output:** `true`  
**Explanation:** The square with coordinates `"h3"` is white, so return `true`.

### Example 3
**Input:** `coordinates = "c7"`  
**Output:** `false`  

---

## Constraints

* `coordinates.length == 2`
* `'a' <= coordinates[0] <= 'h'`
* `'1' <= coordinates[1] <= '8'`

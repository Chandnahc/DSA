# [2946. Matrix Similarity After Cyclic Shifts](https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts/)

## 🟢 Easy

---

### **Problem Statement**

You are given an $m \times n$ integer matrix `mat` and an integer `k`.

The following process happens `k` times:
- **Even-indexed rows** (0, 2, 4, ...) are cyclically shifted to the **left**.
- 
  ![Even index rows](https://assets.leetcode.com/uploads/2024/05/19/lshift.jpg)
  
- **Odd-indexed rows** (1, 3, 5, ...) are cyclically shifted to the **right**.

  ![Odd indexed rows](https://assets.leetcode.com/uploads/2024/05/19/rshift-stlone.jpg)

Return `true` if the final modified matrix after `k` steps is identical to the original matrix, and `false` otherwise.

---

### **Examples**

**Example 1:**

![Example1](https://assets.leetcode.com/uploads/2024/05/19/t1-2.jpg)

> **Input:** `mat = [[1,2,3],[4,5,6],[7,8,9]], k = 4`  
> **Output:** `false`  
> **Explanation:** After shifts, the rows will not match their original state because the values are distinct and the shift amount isn't a multiple of the row length.

**Example 2:**

![Example2](https://assets.leetcode.com/uploads/2024/05/19/t1-3.jpg)

> **Input:** `mat = [[1,2,1,2],[5,5,5,5],[6,3,6,3]], k = 2`  
> **Output:** `true`  
> **Explanation:** Row 0 `[1,2,1,2]` shifted left by 2 becomes `[1,2,1,2]`. Row 1 remains the same. Row 2 shifted right by 2 becomes `[6,3,6,3]`.

**Example 3:**
> **Input:** `mat = [[2,2],[2,2]], k = 3`  
> **Output:** `true`

---

### **Constraints**

- $1 \le m, n \le 25$
- $1 \le \text{mat}[i][j] \le 25$
- $1 \le k \le 50$

---

### **Complexity Analysis**

* **Time Complexity:** $O(m \times n)$  
  We iterate through every element of the matrix exactly once to check the condition.
* **Space Complexity:** $O(1)$  
  No extra space is needed beyond a few variables, as we don't need to actually perform the shifts.

---

### **Approach: The Modulo Shortcut**



The most important observation is that **the direction of the shift (left or right) doesn't actually matter** for determining similarity. 

#### **The Logic:**
If a row is shifted $k$ positions and results in the same row, it means that for every element at index $j$, the element at $(j + k) \pmod n$ must be the same. 

1.  **Simplify $k$:** Since shifting a row of length $n$ by $n$ positions results in the same row, we only care about $k \pmod n$.
2.  **The Similarity Condition:** A row is identical after a shift if:
    `mat[i][j] == mat[i][(j + k) % n]`
3.  **Iterate:** Check this condition for every single element in the matrix. If any element fails this check, return `false`.
4.  **Result:** If all elements pass, return `true`.

#### **Why ignore direction?**
In a cyclic shift of length $n$, shifting left by $k$ is the same as shifting right by $(n - k)$. In both cases, if the matrix is to remain "identical," the element at index $j$ must match the element $k$ positions away (circularly).

---

**Topics:** `Array` | `Math` | `Matrix` | `Simulation`

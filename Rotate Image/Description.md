# [48. Rotate Image](https://leetcode.com/problems/rotate-image/)

## 🟡 Medium

---

### **Problem Statement**

You are given an $n \times n$ 2D `matrix` representing an image. Rotate the image by **90 degrees (clockwise)**.

**Crucial Requirement:** You must rotate the image **in-place**. Modify the input matrix directly; **do not** allocate another 2D matrix for the rotation.

---

### **Examples**

**Example 1:**

![example_1](https://assets.leetcode.com/uploads/2020/08/28/mat1.jpg)

> **Input:** `matrix = [[1,2,3],[4,5,6],[7,8,9]]`  
> **Output:** `[[7,4,1],[8,5,2],[9,6,3]]`

**Example 2:**

![example_2](https://assets.leetcode.com/uploads/2020/08/28/mat2.jpg)

> **Input:** `matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]`  
> **Output:** `[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]`

---

### **Constraints**

- $n == \text{matrix.length} == \text{matrix}[i].\text{length}$
- $1 \le n \le 20$
- $-1000 \le \text{matrix}[i][j] \le 1000$

---

### **Complexity Analysis**

* **Time Complexity:** $O(n^2)$  
  We visit every cell in the matrix twice: once for the transpose and once for the reversal.
* **Space Complexity:** $O(1)$  
  Since we are modifying the matrix in-place, we use no extra storage regardless of the input size.

---

### **Approach: Transpose and Reflect**

The most elegant way to solve this is to treat the rotation as a two-step geometric flip.

#### **The Strategy:**
1.  **Transpose the Matrix:** Flip the matrix over its main diagonal (top-left to bottom-right). This turns all rows into columns.
    * Swap `matrix[i][j]` with `matrix[j][i]` where $j > i$.
    * *Result for Ex 1:* `[[1,4,7],[2,5,8],[3,6,9]]`
2.  **Reverse Each Row:** Flip the matrix horizontally.
    * For every row, swap the first element with the last, second with second-to-last, etc.
    * *Result for Ex 1:* `[[7,4,1],[8,5,2],[9,6,3]]` (Success!)



#### **Why this works:**
A clockwise rotation moves an element at $(i, j)$ to $(j, n-1-i)$.
- Transposing moves $(i, j) \to (j, i)$.
- Reversing a row moves the element at $(j, i) \to (j, n-1-i)$.
Together, they achieve exactly the target coordinate transformation without requiring a temporary buffer.

---

**Topics:** `Array` | `Math` | `Matrix`

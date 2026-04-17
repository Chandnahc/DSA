# [463. Island Perimeter](https://leetcode.com/problems/island-perimeter/)

## 🟢 Easy

---

### **Problem Statement**

You are given a `row x col` grid representing a map where `grid[i][j] = 1` represents land and `grid[i][j] = 0` represents water.

The island is formed by land cells connected **horizontally or vertically**. There is exactly one island, and it has no "lakes" (internal water). Each cell is a square with a side length of 1.

**Goal:** Determine the total perimeter of the island.

---

### **Examples**

**Example 1:**

![example_1](https://assets.leetcode.com/uploads/2018/10/12/island.png)

> **Input:** `grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]`  
> **Output:** `16`  
> **Explanation:** By counting all the edges where land meets water or the grid boundary, we get 16.

**Example 2:**
> **Input:** `grid = [[1]]`  
> **Output:** `4`

---

### **Constraints**

- $1 \le row, col \le 100$
- `grid[i][j]` is `0` or `1`.
- There is exactly one island.

---

### **Complexity Analysis**

* **Time Complexity:** $O(R \times C)$  
  We must visit every cell in the grid exactly once.
* **Space Complexity:** $O(1)$  
  We only use a single variable to accumulate the perimeter count.

---

### **Approach: Iterative Counting (The "Shared Edge" Rule)**

A naive way is to check all 4 neighbors for every land cell, but there is a more efficient "Greedy" counting method.

#### **The Strategy:**
1.  **Iterate:** Loop through every cell in the grid using nested loops (row `i`, column `j`).
2.  **Find Land:** If `grid[i][j] == 1`:
    * Add **4** to your total perimeter (assume it's isolated).
    * **Check Up:** If there is a land cell directly above (`i > 0` and `grid[i-1][j] == 1`), subtract **2**. (This accounts for the shared edge between the current cell and the one above it).
    * **Check Left:** If there is a land cell directly to the left (`j > 0` and `grid[i][j-1] == 1`), subtract **2**. (This accounts for the shared edge between the current cell and the one to its left).
3.  **Return:** The final total.

#### **Why only check Up and Left?**
If you check all 4 directions for every cell, you will double-count the shared edges. By only checking the "past" neighbors (Up and Left), you ensure each shared edge is subtracted exactly once when the second land square of a pair is encountered.

---

**Topics:** `Array` | `Depth-First Search` | `Breadth-First Search` | `Matrix`

# 938. Range Sum of BST

**Difficulty:** Easy  
**Topics:** Tree, Depth-First Search, Binary Search Tree, Binary Tree  

---

### Problem Description
Given the `root` node of a binary search tree and two integers `low` and `high`, return *the sum of values of all nodes with a value in the **inclusive** range `[low, high]`*.

### Example 1

![example_1](https://assets.leetcode.com/uploads/2020/11/05/bst1.jpg)

**Input:** `root = [10,5,15,3,7,null,18]`, `low = 7`, `high = 15`  
**Output:** `32`  
**Explanation:** Nodes 7, 10, and 15 are in the range `[7, 15]`. $7 + 10 + 15 = 32$.

### Example 2

![example_2](https://assets.leetcode.com/uploads/2020/11/05/bst2.jpg)

**Input:** `root = [10,5,15,3,7,13,18,1,null,6]`, `low = 6`, `high = 10`  
**Output:** `23`  
**Explanation:** Nodes 6, 7, and 10 are in the range `[6, 10]`. $6 + 7 + 10 = 23$.

### Constraints
- The number of nodes in the tree is in the range $[1, 2 \times 10^4]$.
- $1 \le \text{Node.val} \le 10^5$
- $1 \le \text{low} \le \text{high} \le 10^5$
- All `Node.val` are **unique**.

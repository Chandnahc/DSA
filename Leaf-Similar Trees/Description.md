# 872. Leaf-Similar Trees

**Difficulty:** Easy  
**Topics:** Tree, Depth-First Search, Binary Tree  

---

### Problem Description
Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a **leaf value sequence**.

For example, in a standard binary tree, extracting the bottom-most nodes from left to right might yield a sequence like `(6, 7, 4, 9, 8)`.

Two binary trees are considered **leaf-similar** if their leaf value sequence is the same.

Return `true` *if and only if the two given trees with head nodes `root1` and `root2` are leaf-similar*.

![image](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/16/tree.png)

### Example 1

![example_1](https://assets.leetcode.com/uploads/2020/09/03/leaf-similar-1.jpg)

**Input:** `root1 = [3,5,1,6,2,9,8,null,null,7,4]`, `root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]`  
**Output:** `true`  
**Explanation:** Both trees yield the leaf value sequence `[6, 7, 4, 9, 8]`.

### Example 2

![example_2](https://assets.leetcode.com/uploads/2020/09/03/leaf-similar-2.jpg)

**Input:** `root1 = [1,2,3]`, `root2 = [1,3,2]`  
**Output:** `false`  
**Explanation:** The leaf value sequence for `root1` is `[2, 3]`, while for `root2` it is `[3, 2]`.

### Constraints
- The number of nodes in each tree will be in the range `[1, 200]`.
- Both of the given trees will have values in the range `[0, 200]`.
